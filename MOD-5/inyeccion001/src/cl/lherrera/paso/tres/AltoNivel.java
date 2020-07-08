package cl.lherrera.paso.tres;

public class AltoNivel {
	private Luz luz;
	
	public AltoNivel(Luz luz) {
		this.luz = luz;
	}
	
	public void encenderLuz() {
		luz.encender();
	}
}
