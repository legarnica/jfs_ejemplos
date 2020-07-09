package cl.lherrera.boxers.impl;

import cl.lherrera.boxers.abstractas.BoxeadorCercanoAbstracto;
import cl.lherrera.boxers.interfaces.Mixto;

public class MixtoImpl extends BoxeadorCercanoAbstracto implements Mixto {

	public MixtoImpl(String nomnbre, double peso) {

		super(nomnbre, peso);

	}

	@Override
	public void pelear() {

		System.out.println(nombre + " Mixto, keep calm and... ");
		aplicarCrochet();
		aplicarJab();
		aplicarLluviaDeGolpes();
		aplicarUpperCut();
		mantenerDistancia();
		contratacar();
		golpearYMoverse();

	}

}
