
package cl.lherrera.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Logger;

import cl.lherrera.entidades.Comentario;

public class ComentarioDAO {

    private static Logger logger = Logger.getLogger(ComentarioDAO.class.getName());

    private static ManejaConexion acceso = ManejaConexion.obtenerManejo();

    public List<Comentario> obtenerComentarios() {

        List<Comentario> comentarios = new ArrayList<>();

        String sqlTxt = "select id, fecha, texto, usuario_id from comentario";

        try (Connection conexion = acceso.obtenerConexion();
            PreparedStatement ps = conexion.prepareStatement(sqlTxt);
            ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {

                Comentario comentario = new Comentario();

                comentario.setId(rs.getInt("id"));
                comentario.setFecha(rs.getString("fecha"));
                comentario.setTexto(rs.getString("texto"));

                comentarios.add(comentario);

            }

        } catch (SQLException e) {

            logger.severe(sqlTxt);
            logger.info(e.getMessage());

        }

        return comentarios;

    }

}
