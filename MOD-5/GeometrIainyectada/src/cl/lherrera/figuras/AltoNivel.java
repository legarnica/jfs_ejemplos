package cl.lherrera.figuras;

public class AltoNivel {

	private Figura figura;

	public AltoNivel(Figura figura) {
		this.figura = figura;
	}

	public void imprimeArea() {
		System.out.println(figura.obtenerArea());
	}

}
