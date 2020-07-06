package cl.lherrera.relaciones.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import cl.lherrera.relaciones.modelo.Alumno;

public class AlumnoDAO {
	ManejaConexion manejoCon = ManejaConexion.obtenerManejo();
	Logger logger = Logger.getLogger(AlumnoDAO.class.getName());
	
	public Alumno obtenerAlumnoPorId(Long id) {
		Alumno alumno = new Alumno();
		String sqlTxt = "select id, nombre from alumno where id = " + id;
		
		try(
				Connection conn = manejoCon.obtenerConexion();
				PreparedStatement ps = conn.prepareStatement(sqlTxt);
				ResultSet rs = ps.executeQuery();
			) {
				while(rs.next()) {
					alumno.setId(rs.getLong("id"));
					alumno.setNombre(rs.getString("nombre"));
				}
				
			} catch (SQLException e) {
				logger.severe("No se pudieron obtener los cursos para el alumno: " + alumno.toString());
				logger.severe(e.getMessage());
			}
		return alumno;
	}
	

	
}
