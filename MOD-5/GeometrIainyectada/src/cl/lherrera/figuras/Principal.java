package cl.lherrera.figuras;

public class Principal {
	
	public static void main(String[] args) {
		Figura circulo = new Circulo(4); 
		Figura cuadrado = new Cuadrado(2); 
		
		AltoNivel texasInstruments = new AltoNivel(cuadrado);
		
		texasInstruments.imprimeArea();
	}

}
