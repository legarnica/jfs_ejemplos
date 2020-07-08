package cl.lherrera.paso.dos;

public class Principal {
	private static final LuzRoja luzRoja = new LuzRoja();
	private static final LuzVerde luzVerde = new LuzVerde();

	public static void main(String[] args) {
		String colorLuz = "verde";
		
		if (colorLuz.equals("roja"))
			luzRoja.encender();
		else
			luzVerde.encender();

	}
}
