package cl.lherrera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prueba")
public class ExpoController {
    
    @RequestMapping(value = "/login")
    public String doLogin() {
        // retorno de muestra
        return "login";
    }
    
    @RequestMapping(value = "/actualizar")
    public String actualizar() {
        // retorno de muestra
        return "actualizar";
    }
    
    @RequestMapping(value = "/registrar")
    public String registrar() {
        // retorno de muestra
        return "registrar";
    }
    
    @RequestMapping(value = "/usuario")
    public String usuario() {
        // retorno de muestra
        return "usuario";
    }
}
