
package cl.lherrera.main;

import cl.lherrera.facades.Facade;

public class Principal {

    public static void main(String[] args) {

        Facade facade = new Facade();

        System.out.println(facade.obtenerDatos());

    }

}
