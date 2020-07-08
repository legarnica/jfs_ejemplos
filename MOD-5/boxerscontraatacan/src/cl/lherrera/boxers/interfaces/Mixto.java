package cl.lherrera.boxers.interfaces;

public interface Mixto extends BoxeadorCercano, Estilista, Enjambre, Fajador, Pegador {

    @Override
    default void aplicarUpperCut() {

        System.out.println("Se aplica un Upper Cut Mixto !!! pum pam...");

    }
}
