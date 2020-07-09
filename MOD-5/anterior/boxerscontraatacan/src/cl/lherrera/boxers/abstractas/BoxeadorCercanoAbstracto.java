package cl.lherrera.boxers.abstractas;

import cl.lherrera.boxers.interfaces.BoxeadorCercano;

public abstract class BoxeadorCercanoAbstracto extends BoxeadorAbstracto implements BoxeadorCercano {

	protected BoxeadorCercanoAbstracto(String nombre, double peso) {

		super(nombre, peso);

	}

}
