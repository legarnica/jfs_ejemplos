package cl.lherrera.paso.tres;

/**
 * Clase inyectada !!
 * @author luisherrera
 *
 */
public class PreparaLuz {
	// esta dependencia viene inyectada desde fuera.
	private Luz luz;

	public PreparaLuz(Luz luz) {

		this.luz = luz;

	}

	public void encenderLuz() {

		luz.encender();

	}
}
