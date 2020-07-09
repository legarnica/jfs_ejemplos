package cl.lherrera.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracion {
	
	@Bean
	public Persona persona() {
		return new Persona();
	}

}
