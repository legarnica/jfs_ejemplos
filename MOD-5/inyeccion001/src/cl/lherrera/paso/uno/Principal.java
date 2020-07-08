package cl.lherrera.paso.uno;

public class Principal {
	public static void main(String[] args) {
		String colorLuz = "verde";
		
		if(colorLuz.equals("roja"))
			System.out.println("Cuidado !!. Se enciende la luz Roja");
		else
			System.out.println("Se enciende la luz " + colorLuz);
	}
}
