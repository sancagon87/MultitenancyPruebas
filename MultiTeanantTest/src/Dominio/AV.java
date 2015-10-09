package Dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Multitenant;
import org.eclipse.persistence.annotations.MultitenantType;
import org.eclipse.persistence.annotations.TenantTableDiscriminator;
import org.eclipse.persistence.annotations.TenantTableDiscriminatorType;

/**
 * Entity implementation class for Entity: AV
 *
 */
@Entity
@Table(name = "av")
@Multitenant(value = MultitenantType.TABLE_PER_TENANT)
@TenantTableDiscriminator(type = TenantTableDiscriminatorType.PREFIX, contextProperty = "tenant-id")
public class AV implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private static final long serialVersionUID = 1L;
	private String nombre;
	
	public AV() {
		super();
	}
	
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
