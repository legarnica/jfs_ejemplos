package cl.lherrera.boxers.impl;

import cl.lherrera.boxers.abstractas.BoxeadorCercanoAbstracto;
import cl.lherrera.boxers.interfaces.Enjambre;

public class EnjambreImpl extends BoxeadorCercanoAbstracto implements Enjambre {

    protected EnjambreImpl(String nomnbre, double peso) {

        super(nomnbre, peso);

    }

    @Override
    public void pelear() {

        System.out.println(nombre + " Estilista !!");
        aplicarLluviaDeGolpes();

    }

}
