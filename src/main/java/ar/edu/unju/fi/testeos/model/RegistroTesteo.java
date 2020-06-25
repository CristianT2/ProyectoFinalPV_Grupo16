package ar.edu.unju.fi.testeos.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase que representa el registro de los testeos 
 * hechos a una persona
 * @author Torrejon Cristian
 * @version 1.0
 */

@Component
@Entity
public class RegistroTesteo {

	/*
	 *---------------------------------
	 *-------- atributos --------------
	 *---------------------------------
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	/**
	 * Atributo que representa la fecha y hora dentro del registro de testeo.
	 */
	@Column ( name = "FECHA/HORA")
	private LocalDateTime fechaHora;

	/**
	 * Atributo que representa la vivienda dentro del registro de testeo.
	 */
	@Autowired
	@OneToMany(mappedBy = "documento" , cascade = CascadeType.ALL) 
	@JoinColumn ( name = "VIVIENDA")
	private UnidadHabitacional unidadHabitacional;
	/**
	 * Atributo que representa una lista de personas dentro del registro de testeo.
	 */
	@Autowired
	List<PersonaTesteada> personasTesteadas;
	
	/*
	 *---------------------------------
	 *-------- constructores --------------
	 *---------------------------------
	 */
	/**
	 * Constructor por defecto
	 */
	public RegistroTesteo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor Parametrizado
	 * @param fechaHora valor para la fecha y hora del registro
	 * @param unidadHabitacional valor para la direccion de la vivienda del registro
	 * @param personasTesteadas valor para las personas testeadas del registro
	 */
	public RegistroTesteo(LocalDateTime fechaHora, UnidadHabitacional unidadHabitacional,
			List<PersonaTesteada> personasTesteadas) {
		//asignacion del parametro fechaHora al atributo fechaHora.
		this.fechaHora = fechaHora;
		//asignacion del parametro unidadHabitacional al atributo unidadHabitacional.
		this.unidadHabitacional = unidadHabitacional;
		//asignacion del parametro personasTesteadas al atributo personasTesteadas.
		this.personasTesteadas = personasTesteadas;
	}
	
	/*
	 *---------------------------------
	 *-------- metodos accesores --------------
	 *---------------------------------
	 */

	/**
	 * retorna la fecha y hora del registro
	 * @return the fechaHora
	 */
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	/**
	 * asigna un valor a la fecha del registro
	 * @param fechaHora the fechaHora to set
	 */
	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	/**
	 * retorna la unidad habitacional del registro
	 * @return the unidadHabitacional
	 */
	public UnidadHabitacional getUnidadHabitacional() {
		return unidadHabitacional;
	}

	/**
	 * asigna un valor a la unidad habitacional del registro
	 * @param unidadHabitacional the unidadHabitacional to set
	 */
	public void setUnidadHabitacional(UnidadHabitacional unidadHabitacional) {
		this.unidadHabitacional = unidadHabitacional;
	}

	/**
	 * retorna las personas testeadad del registro
	 * @return the personasTesteadas
	 */
	public List<PersonaTesteada> getPersonasTesteadas() {
		return personasTesteadas;
	}

	/**
	 * asigna un valor a la persona testeaada del registro
	 * @param personasTesteadas the personasTesteadas to set
	 */
	public void setPersonasTesteadas(List<PersonaTesteada> personasTesteadas) {
		this.personasTesteadas = personasTesteadas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	//Metodo que retorna una cadena de texto con los valores de los atributos
	@Override
	public String toString() {
		return "RegistroTesteo [fechaHora=" + fechaHora + ", unidadHabitacional=" + unidadHabitacional
				+ ", personasTesteadas=" + personasTesteadas + "]";
	}
	
}
