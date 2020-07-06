package cl.lherrera.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import cl.lherrera.entidades.DatoPersonal;
import cl.lherrera.entidades.Persona;



public class DatoPersonalDAO {
	private Logger logger = Logger.getLogger(DatoPersonalDAO.class.getName());
	
	private static ManejaConexion manejaDB = ManejaConexion.obtenerManejo();
	
	public List<DatoPersonal> obtenerTodos() {
		List<DatoPersonal> datospersonales = new ArrayList<>();
		
		String sqlTxt = "select id, telefono, email, persona_id from dato_personal";
		
		try(
			Connection conexion = manejaDB.obtenerConexion();	
			PreparedStatement ps = conexion.prepareStatement(sqlTxt);
			ResultSet rs = ps.executeQuery();
		){
			while(rs.next()) {
				DatoPersonal datoPersonal = new DatoPersonal();
				// llenamos la persona con el id que tenemos
				Persona persona = (new PersonaDAO()).obtenerPorId(rs.getInt("id"));
				
				datoPersonal.setId(rs.getInt("id"));
				datoPersonal.setTelefono(rs.getString("telefono"));
				datoPersonal.setEmail(rs.getString("email"));
				datoPersonal.setPersona(persona);
				
				// lo dejamos en la lista
				datospersonales.add(datoPersonal);
			}
		}catch(SQLException e){
			logger.info(e.getMessage());
		}
		
		return datospersonales;
	}
	
	public int ingresar(DatoPersonal datoPersonal) {
		String sqlTxt = "insert into dato_personal (telefono, email, persona_id) values (?, ?, ?)";
		int idIngresado = 0;
		
		int filasAfectadas = 0;
		
		try(
			Connection conexion = manejaDB.obtenerConexion();
			PreparedStatement ps = conexion.prepareStatement(sqlTxt, Statement.RETURN_GENERATED_KEYS);
		){
			
			ps.setString(1, datoPersonal.getTelefono());
			ps.setString(2, datoPersonal.getEmail());
			ps.setInt(3, datoPersonal.getPersona().getId() );
			filasAfectadas = ps.executeUpdate();
			
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
