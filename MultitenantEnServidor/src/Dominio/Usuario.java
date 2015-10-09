package Dominio;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public class Usuario implements Serializable {

	@Id
	@GeneratedValue
	private long id;
	private static final long serialVersionUID = 1L;

	public Usuario() {
		super();
	}
   
}
