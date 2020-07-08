package cl.lherrera.app;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ExBeansXmlApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ExBeansXmlApplication.class, args);
		
		String path = "cl/lherrera/app/beans.xml";
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext(path);
		

		Persona persona = appContext.getBean(Persona.class);
		
		System.out.println(persona);
	}

}
