package cl.lherrera.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.lherrera.model.service.IUsuarioService;

@Controller
@RequestMapping(value = "/")
public class LoginController {
    
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    
    @Autowired
    private IUsuarioService servicio;
    
    /**
     *  carga la vista del login
     */
    @RequestMapping(value = {"", "/", "/login"})
    public String login() {
        return null;
    }

    /**
     * IMPLEMENTAR:
     * intenta realizar el inicio de sesión, en caso de exito, se va al
     * principal, en caso contrario, vuelve al inicio de sesión 
     * con mensaje de error.
     */
    @RequestMapping(value = "/dologin")
    public String doLogin() {
        return null;
    }
    
    /**
     * IMPLEMENTAR:
     * Cierra la sesión y redirige al login
     */
    @RequestMapping(value = "/logout")
    public String logout() {
        return null;
        
    }

}
