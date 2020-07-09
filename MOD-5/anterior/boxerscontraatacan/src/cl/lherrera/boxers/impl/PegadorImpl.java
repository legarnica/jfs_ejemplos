package cl.lherrera.boxers.impl;

import cl.lherrera.boxers.abstractas.BoxeadorAbstracto;
import cl.lherrera.boxers.interfaces.Pegador;

public class PegadorImpl extends BoxeadorAbstracto implements Pegador {

	public PegadorImpl(String nomnbre, double peso) {

		super(nomnbre, peso);

	}

	@Override
	public void pelear() {

		System.out.println(nombre + " Pegador !!");
		aplicarCrochet();
		aplicarUpperCut();

	}

}
