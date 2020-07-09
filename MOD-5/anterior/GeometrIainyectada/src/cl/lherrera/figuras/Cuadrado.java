package cl.lherrera.figuras;

public class Cuadrado implements Figura {
	private int lado;

	public Cuadrado(int lado) {
		this.lado = lado;
	}

	@Override
	public double obtenerArea() {
		System.out.println("Area de un cuadrado de lado: " + lado);
		return lado * lado;
	}

}
