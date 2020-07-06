package cl.lherrera.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

//::pool
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
//::pool_


public class ManejaConexion {

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
		
		// esta vez no cargamos el driver
		try {
		    //::pool
			InitialContext contextoInicial = new InitialContext(); 
			DataSource ds = (DataSource) contextoInicial.lookup("java:comp/env/jdbc/mydb");
			//::pool_
			conexion = ds.getConnection(); 
			
		} catch (NamingException e) {
			milog.severe("No se pudo obtener conexión del pool");
			milog.severe(e.getMessage());
		}
		return conexion;
	}
	

}
