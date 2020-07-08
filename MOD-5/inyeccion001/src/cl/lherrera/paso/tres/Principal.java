package cl.lherrera.paso.tres;

public class Principal {
//	private static final LuzRoja luzRoja = new LuzRoja();
//	private static final LuzVerde luzVerde = new LuzVerde();

	public static void main(String[] args) {
//		Luz luz = new LuzRoja();
		Luz luz = new LuzVerde();

		AltoNivel interruptor = new AltoNivel(luz);
		
		interruptor.encenderLuz();
		
		
		
//		String colorLuz = "verde";
//		
//		if (colorLuz.equals("roja"))
//			luzRoja.encender();
//		else
//			luzVerde.encender();

	}
}
