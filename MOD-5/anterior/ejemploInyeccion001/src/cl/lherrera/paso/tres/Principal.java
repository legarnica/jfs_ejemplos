package cl.lherrera.paso.tres;

/**
 * @author luisherrera
 *
 * Con la inversión del control, podemos exponer funcionamiento desde
 * fuera de la clase. Así invertimos el control, inyectando dependencias
 * desde fuera. Así preparamos los objetos con lo necesario para que una
 * clase central, ejecute su funcionalidad. Pueden aparecer más luces
 * con el polimorfismo, no se debe realizar otro cambio más que 
 * crear esta clase y su comportamiento lo definimos diferentes
 * sin afectar el resto de las implementaciones.
 * 
 * esta es la técnica que utiliza spring para implementar clases
 * automáticamente, como los daos, servicios, etc.
 * 
 * En el fondo, la inyección de dependencia es una consecuencia de
 * la inversión del control. 
 * 
 * The Dependency Inversion Principle is the fifth and final design principle
 * y se basa en la que exponemos un objeto interno de la clase en el
 * construcctor, para que sea de esta forma, construído fuera de una clase.
 * 
 * Notamos este patrol cuando vemos archivos, o el PrepareStatemen ;)
 *
 */
public class Principal {

    public static void main(String[] args) {

    	// acá preparamos el objeto, para inyectarlo
    	// en la clase, que ejecuta un mismo método
    	// para direfentes tipos de clases hermanas.
        Luz luz = new LuzRoja();
        PreparaLuz pl = new PreparaLuz(luz);

        pl.encenderLuz();

    }

}
