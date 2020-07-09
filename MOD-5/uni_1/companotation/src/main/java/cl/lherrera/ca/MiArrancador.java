package cl.lherrera.ca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MiArrancador implements CommandLineRunner {
	
	@Autowired
	Saludador saludador;
	
//	public MiArrancador(Saludador saludador) {
//		this.saludador = saludador;
//	}
	

	@Override
	public void run(String... args) throws Exception {
		saludador.saluda();
		
	}
	
}
