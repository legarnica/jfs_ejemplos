package cl.lherrera.relaciones.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import cl.lherrera.relaciones.modelo.Curso;


public class CursoDAO {
	ManejaConexion manejoCon = ManejaConexion.obtenerManejo();
	Logger logger = Logger.getLogger(CursoDAO.class.getName());
	
	
	public Curso obtenerCursoPorId(Long id) {
		Curso curso = new Curso();
		String sqlTxt = "select id, nombre from curso where id = " + id;
		
		try(
				Connection conn = manejoCon.obtenerConexion();
				PreparedStatement ps = conn.prepareStatement(sqlTxt);
				ResultSet rs = ps.executeQuery();
			) {
				while(rs.next()) {
					curso.setId(rs.getLong("id"));
					curso.setNombre(rs.getString("nombre"));
				}
				
			} catch (SQLException e) {
				logger.severe(
					"No se pudieron obtener los cursos para el alumno: " 
					+ curso.toString()
				);

				logger.severe(e.getMessage());
			}
		return curso;
	}



}

