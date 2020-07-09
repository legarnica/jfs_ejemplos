package cl.lherrera.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.lherrera.entity.Tarea;

@Controller
@RequestMapping("/ejemplo")
public class EjemploController {

    private static final Logger logger = LoggerFactory
            .getLogger(EjemploController.class);

//    @Autowired
//    Tarea tarea;
    
    List<String> datos;

    public EjemploController() {
        datos = new ArrayList<>();
    }

    @RequestMapping("/dihola")
    public String diHola(ModelMap modelo) {
        modelo.put("saludo", "Hola mundo desde el controlador");

        return "hello";

    }

    @RequestMapping("/dichao")
    public String diChao(ModelMap modelo) {
        modelo.put("despedida", "Chao mundo desde el controlador");

        return "hello";

    }

    // crear ahora interacción entre ventanas
    @RequestMapping(value = "/inicioEnvio", method = RequestMethod.GET)
    public String inicioEnvio() {
        return "sendData";
    }

    @RequestMapping(value = "/enviarDatos", method = RequestMethod.POST)
    public String haceEnvio(ModelMap modelo,
        @RequestParam(value = "dato", required = true) String datoDeLaVista) {

        logger.info("Dato de la vista: " + datoDeLaVista);
        modelo.put("mensaje", datoDeLaVista);

        return "sendData";
    }

    @RequestMapping(value = "/addData", method = RequestMethod.GET)
    public String guardarDatos(ModelMap modelo,
        @RequestParam(value = "txtTarea", required = false) String datoDeLaVista) {

        logger.info("datos: " + datos);

        if (datoDeLaVista != null) {
            datos.add(datoDeLaVista);
        }

        modelo.put("tareas", datos);

        return "addData";
    }

    @RequestMapping(value = "/todo")
    public String porHacer(ModelMap modelo,
        @ModelAttribute("tarea") Tarea tarea) {

        logger.info("TAREA: " + tarea);
        
        if(tarea != null) {
            String texto = tarea.getTexto();
            String nivel = tarea.getNivel();
            
            String tareaaNueva = "Nombre: " + texto + ", Nivel: " + nivel;
            
            datos.add(tareaaNueva);
            modelo.put("tareas", datos);
        }

        return "porhacer";

    }

}
