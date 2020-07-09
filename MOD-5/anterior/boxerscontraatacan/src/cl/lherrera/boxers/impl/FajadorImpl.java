package cl.lherrera.boxers.impl;

import cl.lherrera.boxers.abstractas.BoxeadorCercanoAbstracto;
import cl.lherrera.boxers.interfaces.Fajador;

public class FajadorImpl extends BoxeadorCercanoAbstracto implements Fajador {

    public FajadorImpl(String nomnbre, double peso) {

        super(nomnbre, peso);

    }

    @Override
    public void pelear() {

        System.out.println(nombre + " Fajador !!");
        // mucha más implementación
        golpearYMoverse();
        contratacar();

    }

}
