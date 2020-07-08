package cl.lherrera.boxers.impl;

import cl.lherrera.boxers.abstractas.BoxeadorAbstracto;
import cl.lherrera.boxers.interfaces.Estilista;

public class EstilistaImpl extends BoxeadorAbstracto implements Estilista {

    public EstilistaImpl(String nomnbre, double peso) {

        super(nomnbre, peso);

    }

    @Override
    public void pelear() {

        System.out.println(nombre + " Estilista !!");
        aplicarJab();
        mantenerDistancia();

    }

}
