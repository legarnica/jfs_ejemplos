package cl.lherrera.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.lherrera.model.service.IUsuarioService;

@Controller
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService servicio;
    
    /**
     * IMPLEMENTAR:
     * carga la ventana principal del mantenedor de usuarios
     * debe además direccionar al login en caso de no existir la 
     * sesion
     */
    @RequestMapping(value = {"", "/"})
    public String usuario() {
        return null;
    }

    /**
     * IMPLEMENTAR:
     * carga la vista de registro, se lleva un usuario vo vacío para
     * no probocar nulos en la vista. 
     */
    @RequestMapping(value = "/registrar")
    public String registrar() {
        return null;
    }
    
    /**
     * IMPLEMENTAR:
     * Registra al usuario, en el caso que exista la sesión
     * en la vista, tenemos la opción de volver.
     * En de error, hay que informar a la vista.
     */
    @RequestMapping(value = "/registrar", method = RequestMethod.POST)
    public String registrar_() {
        return null;
    }
    
    /**
     * IMPLEMENTAR:
     * Elimina y envía al usuario 
     */
    @RequestMapping(value = "/eliminar")
    public String eliminar() {
        return null;
    }
    
    /**
     * IMPLEMENTAR:
     * Elimina por id y envía al usuario 
     */
    @RequestMapping(value = "/actualizar", method = RequestMethod.GET)
    public String actualizar() {
        return null;
    }

    /**
     * IMPLEMENTAR:
     * Ejecuta la actualización y redirije al mantenedor con mensaje
     * en caso contrario, envía mensaje de error a la vista 
     * de registro.
     */
    @RequestMapping(value = "/actualizar", method = RequestMethod.POST)
    public String hacerActualizar(){
        return null;
    }

}
