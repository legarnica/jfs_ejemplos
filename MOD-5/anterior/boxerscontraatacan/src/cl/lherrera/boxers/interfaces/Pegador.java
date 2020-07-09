package cl.lherrera.boxers.interfaces;

public interface Pegador {

	default void aplicarUpperCut() {

		System.out.println("Aplica un UpperCut !!");

	}

	default void aplicarCrochet() {

		System.out.println("Se aplica un Crochet");

	}
}
