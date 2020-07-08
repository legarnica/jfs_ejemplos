package cl.lherrera.figuras;

import static java.lang.Math.*;

public class Circulo implements Figura {

	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double obtenerArea() {
		System.out.println("Area de un círculo de radio: " + radio);
		return PI * pow(radio, 2);
	}

}
