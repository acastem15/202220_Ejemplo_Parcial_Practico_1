package co.edu.uniandes.dse.parcialejemplo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

/**
 * Entidad genérica de la que heredan todas las entidades. Contiene la
 * referencia al atributo id
 *
 * @author ISIS2603
 */

@Entity
public abstract class MedicoEntity extends BaseEntity {

	private String nombre; 
	private String apellido; 
	private String registroMedico; 

	@ManyToMany
	private List<EspecialidadEntity> especialidades; 
	


	
}