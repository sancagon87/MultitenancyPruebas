package util;

import java.sql.SQLException;

import javax.persistence.EntityManager;

public class Brutus {
	
	public static void setUpTenant(String tenantId, EntityManager em) throws SQLException {
		
		em.getTransaction().begin();	
		java.sql.Connection connection = em.unwrap(java.sql.Connection.class);
		connection.createStatement().execute(
			   "CREATE TABLE IF NOT EXISTS `" + tenantId + "_av` ("
				  + "`ID` bigint(20) NOT NULL AUTO_INCREMENT,"
				  + "`NOMBRE` varchar(255) DEFAULT NULL,"
				+ "PRIMARY KEY (`ID`) ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;"
				  );
		em.getTransaction().commit();
	}
	
}
