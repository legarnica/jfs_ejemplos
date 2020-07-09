package cl.lherrera.app;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ExBeansConfApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ExBeansConfApplication.class, args);
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(Configuracion.class);
		Persona persona = appContext.getBean(Persona.class);
		
		System.out.println(persona);
	}

}
