package Main;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Dominio.AV;
import util.Brutus;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		AV av = new AV();
		av.setNombre("heladera1");
		
		Map properties = new HashMap<>();
		properties.put("tenant-id", "pepito");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MultiTeanantTest", properties );
		EntityManager em = emf.createEntityManager();
		
		Brutus.setUpTenant("pepito", em);
		
		em.getTransaction().begin();
		em.persist(av);
		em.getTransaction().commit();

	}

}
