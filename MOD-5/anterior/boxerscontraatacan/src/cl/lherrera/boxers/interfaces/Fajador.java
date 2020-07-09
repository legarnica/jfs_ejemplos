package cl.lherrera.boxers.interfaces;

public interface Fajador {

	default void golpearYMoverse() {

		System.out.println("Golpea, se mueve");

	}

	default void contratacar() {

		System.out.println("Contrataca !!!");

	}
}
