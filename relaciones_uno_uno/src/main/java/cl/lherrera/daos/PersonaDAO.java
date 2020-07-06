package cl.lherrera.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import cl.lherrera.entidades.Persona;


public class PersonaDAO {
	private static Logger logger = Logger.getLogger(PersonaDAO.class.getName());
	private static ManejaConexion mc = ManejaConexion.obtenerManejo();
	
	public Persona obtenerPorId(int id) {
		Persona persona = new Persona();
		String sqlTxt = "select id, nombre from persona where id = " + id;
		
		try(
			Connection conexion = mc.obtenerConexion();
			PreparedStatement ps = conexion.prepareStatement(sqlTxt);
			ResultSet rs = ps.executeQuery();
		){
			if(rs.next()) {
				persona.setId(rs.getInt("id"));
				persona.setNombre(rs.getString("nombre"));
			}
		}catch(SQLException e) {
			logger.severe(e.getMessage());
		}

		return persona;
	}
	
	public int ingresar(Persona persona) {
		String sqlTxt = "insert into persona (nombre) values (?)";
		int idIngresado = 0;
		
		try(
			Connection conexion = mc.obtenerConexion();
			PreparedStatement ps = conexion.prepareStatement(sqlTxt, Statement.RETURN_GENERATED_KEYS);
			
		){
			ps.setString(1, persona.getNombre() );
			int filasAfectadas = ps.executeUpdate();
			
			ResultSet rs = ps.getGeneratedKeys();
			if(rs.next()) {
				idIngresado = rs.getInt(1);
			}			
			
			if(filasAfectadas == 0) {
				throw new SQLException("No se pudo ingresar el registro");
			}
			
		}catch(SQLException e) {logger.severe(e.getMessage());}
		
		return idIngresado;
	}
}
