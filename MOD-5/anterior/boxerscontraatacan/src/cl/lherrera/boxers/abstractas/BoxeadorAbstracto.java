package cl.lherrera.boxers.abstractas;

import cl.lherrera.boxers.interfaces.Boxeador;

public abstract class BoxeadorAbstracto implements Boxeador {

    protected String nombre;

    protected double peso;

    protected BoxeadorAbstracto(String nombre, double peso) {

        this.nombre = nombre;
        this.peso = peso;

    }

    protected String getNomnbre() {

        return nombre;

    }

    protected void setNomnbre(String nombre) {

        this.nombre = nombre;

    }

    protected double getPeso() {

        return peso;

    }

    protected void setPeso(double peso) {

        this.peso = peso;

    }

}
