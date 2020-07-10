package cl.lherrera.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.lherrera.entity.Mensaje;
import cl.lherrera.service.MensajeService;

@Controller
@RequestMapping("/mensaje")
public class MensajeController {
    private static final Logger logger = LoggerFactory.getLogger(MensajeController.class);
    
    @Autowired
    private MensajeService servicio;

    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public String index(ModelMap modelo) {
        modelo.put("mensajes", servicio.obtenerTodos());
        return "mensaje/vista-mensaje";
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.POST)
    public String agregarMensaje(
        ModelMap modelo,
        @ModelAttribute("mensaje") Mensaje mensaje
    ) {
        servicio.agregar(mensaje);
        
        logger.info("Mensaje" + mensaje);
        modelo.put("mensajes", servicio.obtenerTodos());
        
        
        return "mensaje/vista-mensaje";
    }
    
    @RequestMapping(value = "/eliminar", method = RequestMethod.GET)
    public String eliminar(
        ModelMap modelo,
        @RequestParam(name = "id", required = true) int id
    ) {
        
        servicio.eliminar(id);
        modelo.put("mensajes", servicio.obtenerTodos());
        
        return "mensaje/vista-mensaje";
    }

}
