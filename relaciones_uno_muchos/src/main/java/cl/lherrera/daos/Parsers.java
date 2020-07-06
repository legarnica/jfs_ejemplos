package cl.lherrera.daos;

import java.util.Date;

public class Parsers {
	
	private Parsers() {}
	
	/**
	 * Transforma un Date a un sql.date 
	 */
	public static java.sql.Date toFechaDb(Date fecha){
		return new java.sql.Date(fecha.getTime());
	}

}
