package cl.lherrera.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;


public class ManejaConexion {
    private static final String DB_URL = "jdbc:sqlite:/Users/luisherrera/Desktop/TALENTO-PROS/servlets/relaciones/unoamuchos/database.db";
    private static final Logger milog = Logger.getLogger(ManejaConexion.class.getName());

    private static ManejaConexion manejaConexion = new ManejaConexion();

    private ManejaConexion() {
        if (manejaConexion != null){
            //Prevent Reflection
            throw new IllegalStateException("No se puede crear una nueva instancia de ManejaConexion");
        }
    }

    public static ManejaConexion obtenerManejo() {
        return manejaConexion;
    }


    public Connection obtenerConexion() throws SQLException {
        Connection conexion = null;

        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(DB_URL, "admin", "1234");

        } catch (ClassNotFoundException e) {
            milog.severe("No se pudo cargar el driver.");
            milog.severe(e.getMessage());
        }

        return conexion;
    }
}
