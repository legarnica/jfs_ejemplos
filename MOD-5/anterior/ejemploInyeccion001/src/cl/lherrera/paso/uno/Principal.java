package cl.lherrera.paso.uno;

/**
 * @author luisherrera
 * 
 * aplicación que enciende dos luces, una verde
 * y una roja, esta luz roja es peligrosa y se
 * solicita imprimir un aviso
 *
 */
public class Principal {
    
    public static void main(String[] args) {
        String colorLuz = "roja";
        
        if(colorLuz.equals("roja")) {
            System.out.println("Cuidado !!, Se enciende la luz: " + colorLuz);
        }else {
            System.out.println("Se enciende la luz: " + colorLuz);
        }
        
    }
    
}