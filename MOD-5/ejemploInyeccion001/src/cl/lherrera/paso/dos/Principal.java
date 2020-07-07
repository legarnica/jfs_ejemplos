package cl.lherrera.paso.dos;


/**
 * Se transforma a objetos, para efectos de escalabilidad
 * del código
 * @author luisherrera
 *
 */
public class Principal {
	private static final LuzRoja luzRoja = new LuzRoja();

	private static final LuzVerde luzVerde = new LuzVerde();

	public static void main(String[] args) {

		String colorLuz = "roja";

		if (colorLuz.equals("roja")) {

			luzRoja.encender();

		} else {

			luzVerde.encender();

		}

	}
}
