package Persistencia;

import java.sql.SQLException;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class AVDAO
 */
@Stateless
@LocalBean
public class AVDAO {

	@PersistenceContext(unitName="MultitenantEnServidor")
	private javax.persistence.EntityManager em;
    /**
     * Default constructor. 
     */
    public AVDAO() {
        // TODO Auto-generated constructor stub
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void persistirAV(String tenantID) {
    	try {
			util.Brutus.setUpTenant(tenantID, em);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
