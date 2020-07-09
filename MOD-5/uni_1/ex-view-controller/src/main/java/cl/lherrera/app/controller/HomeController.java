package cl.lherrera.app.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private final static Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/")
	public String daLoMismoElNombre(Model modelo) {

		List<String> lineas = new ArrayList<>();
		String path = "src/main/resources/static/datos.txt";

		try {
			FileReader archivo = new FileReader(path);
			// inyectando desde siempre...
			BufferedReader br = new BufferedReader(archivo);
			String lineaLeida = br.readLine();
			
			while(lineaLeida != null) {
				lineas.add(lineaLeida);
				lineaLeida = br.readLine();
			}


		} catch (FileNotFoundException e) {

			logger.warn("Archivo no encontrado " + path);
			logger.error("El error: " + e);
				
		} catch (IOException ex) {
			logger.error("Error IO: " + ex);
		}
		
		// request.setAttribute("nombre", valor);
		modelo.addAttribute("lineas", lineas);

		// reauest.getRequestDispatcher("nombre-de-la-vista").forward(req, resp);
		return "nombre-de-la-vista";
	}

}
