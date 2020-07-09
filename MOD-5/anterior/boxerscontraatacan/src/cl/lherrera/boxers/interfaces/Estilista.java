package cl.lherrera.boxers.interfaces;

public interface Estilista {
	
	default void mantenerDistancia() {

		System.out.println("Mantiene distancia");

	}

	default void aplicarJab() {

		System.out.println("Aplica un Jab");

	}
}
