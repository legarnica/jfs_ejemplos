package cl.lherrera.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import cl.lherrera.entidades.Usuario;



public class UsuarioDAO {
	private static Logger logger = Logger.getLogger(UsuarioDAO.class.getName());
	private static ManejaConexion acceso = ManejaConexion.obtenerManejo();

	public Usuario obtenerPorId(int id) {
		Usuario usuario = new Usuario();
		String sqlTxt = "select id, nombre from usuario where id = " + id;

		try (Connection conexion = acceso.obtenerConexion();
				PreparedStatement ps = conexion.prepareStatement(sqlTxt);
				ResultSet rs = ps.executeQuery();) {
			while (rs.next()) {
				usuario.setId(rs.getInt("id"));
				usuario.setNombre(rs.getString("nombre"));
			}
		} catch (SQLException e) {
			logger.severe(sqlTxt);
			logger.info(e.getMessage());
		}

		return usuario;
	}
}
