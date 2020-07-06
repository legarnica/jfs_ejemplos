package cl.lherrera.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import cl.lherrera.modelo.Persona;

public class PersonaDAO {
	private static final ManejaConexion manejaConexion = ManejaConexion.obtenerManejo();
	private static Logger milog = Logger.getLogger(PersonaDAO.class.getName());
	


	public List<Persona> obtenerTodos(){
		List<Persona> personas = new ArrayList<>();
		
		try(
			Connection conexion = manejaConexion.obtenerConexion();
			PreparedStatement ps = conexion.prepareStatement("SELECT id, nombre FROM persona");
			ResultSet rs = ps.executeQuery();
		){
			while(rs.next()) {
				personas.add(new Persona(rs.getInt("id"), rs.getString("nombre")));
			}
		}catch (SQLException e) {
			milog.severe(e.getMessage());
		}
		
		return personas;
	}

}
