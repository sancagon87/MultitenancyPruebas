package managedbeans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import Persistencia.AVDAO;

@ManagedBean
public class PruebaMB implements Serializable {

	@EJB
	AVDAO dao;

	public PruebaMB() {
		super();
	}
	
	public String pruebaManejoDB() {
		dao.persistirAV("Conchudo");
		return "Hola";
	}
	
}
