package cl.lherrera.main;

import cl.lherrera.entidades.Usuario;
import cl.lherrera.facades.Facade;

public class Principal {

    public static void main(String[] args) {
        Facade facade = new Facade();
        Usuario usuarioTest = facade.obtenerUsuarioPorIdentificador(1);
        
        System.out.println(facade.obtenerPosteos(usuarioTest));
    }

}
