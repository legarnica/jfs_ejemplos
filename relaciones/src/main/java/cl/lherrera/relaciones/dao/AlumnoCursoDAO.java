package cl.lherrera.relaciones.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import cl.lherrera.relaciones.modelo.Alumno;
import cl.lherrera.relaciones.modelo.AlumnoCurso;
import cl.lherrera.relaciones.modelo.Curso;

public class AlumnoCursoDAO {
	private static final ManejaConexion manejaConexion = ManejaConexion.obtenerManejo();
	Logger logger = Logger.getLogger(AlumnoCursoDAO.class.getName());
	
	public int ingresaAlumnoCurso(AlumnoCurso alumnoCurso) {
		 int filasAfectadas = 0;
		 Long idAlumno = alumnoCurso.getAlumno().getId();
		 Long idCurso = alumnoCurso.getCurso().getId();

		 String sqlQuery = "INSERT INTO alumno_curso VALUES (?, ?)";

        try(
            Connection conexion = manejaConexion.obtenerConexion();
            PreparedStatement ps = conexion.prepareStatement(sqlQuery);
        ){
            ps.setLong(1, idAlumno);
            ps.setLong(2, idCurso);
            
            filasAfectadas = ps.executeUpdate();

            if(filasAfectadas != 1)
                throw new SQLException("Error al insertar registro");

        }catch (SQLException e) {
        	logger.severe(e.getMessage());
        }

        return filasAfectadas;
	}
	
	/**
	 * |alumno| >-< |curso| 
	 * Trae todos los cursos por alumnos 
	 */
	public List<Alumno> obtenerAlumnosPorCurso(Curso curso){
		List<Alumno> alumnos = new ArrayList<>();
		String sqlTxt = ""
		+ "SELECT a.id,                            "
	    + "   a.nombre                             "
		+ "FROM   alumno a                         "
		+ "       INNER JOIN alumno_curso ac       "
		+ "               ON a.id = ac.id_alumno   "
		+ "                  AND ac.id_curso = " + curso.getId();

		try(
			Connection conexion = manejaConexion.obtenerConexion();
			PreparedStatement ps = conexion.prepareStatement(sqlTxt);
			ResultSet rs = ps.executeQuery();
		) {
			while(rs.next()) {
				alumnos.add(new Alumno(rs.getLong("id"), rs.getString("nombre")) );
			}
			
		} catch (SQLException e) {
			logger.severe("No se pudieron obtener los alumnos para el curso: " + curso.toString());
			logger.severe(e.getMessage());
		}
		
		return alumnos;
	}
	
	public List<Curso> obtenerCursosPorAlumno(Alumno alumno){
		List<Curso> cursos = new ArrayList<>();
		String sqlTxt = ""
		+ "SELECT c.id,                            "
	    + "   c.nombre                             "
		+ "FROM   curso c                          "
		+ "       INNER JOIN alumno_curso ac       "
		+ "               ON c.id = ac.id_curso    "
		+ "                  AND ac.id_alumno = " + alumno.getId();

		try(
			Connection conexion = manejaConexion.obtenerConexion();
			PreparedStatement ps = conexion.prepareStatement(sqlTxt);
			ResultSet rs = ps.executeQuery();
		) {
			while(rs.next()) {
				cursos.add(new Curso(rs.getLong("id"), rs.getString("nombre")) );
			}
			
		} catch (SQLException e) {
			logger.severe("No se pudieron obtener los cursos para el alumno: " + alumno.toString());
			logger.severe(e.getMessage());
		}
		
		return cursos;
	}

}
