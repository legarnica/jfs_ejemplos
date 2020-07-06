package cl.lherrera.servlets;

import java.util.logging.Logger;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.lherrera.dao.PersonaDAO;


@WebServlet(name = "Mantenedor de Personas", urlPatterns = "/mantenedor")
public class IniciaMantenedor extends HttpServlet{
	private static final Logger logger = Logger.getLogger(IniciaMantenedor.class.getName());
	private static PersonaDAO daoPersona = new PersonaDAO();

	private static final long serialVersionUID = -4282664097471786333L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		daoPersona.obtenerTodos().forEach(persona -> System.out.println(persona.getNombre()));
		
		logger.info("procesoTerminado");
		
	}

}