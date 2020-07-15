package ar.edu.unju.fi.testeos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 *  Clase que representa a una persona testeada
 * durante la pandemia para saber si dicha persona
 * se contagio de covid-19.
 * @author GRUPO16
 * @version 1.0
 */

@Component
@Entity
@Table(name = "PERSONAS")
//  Crea la clase persona Testeada
public class PersonaTesteada implements Serializable {
	private static final long serialVersionUID = 1L;
	/*
	 *---------------------------------
	 *-------- atributos --------------
	 *---------------------------------
	 */
	 
	 /*
	  * @Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name="per_testeada_id")
private Long id;
@Column(name="per_testeada_documento")
private String documento;
@Column(name="per_testeada_apellido")
private String apellido;
@Column(name="per_testeada_nombre")
private String nombres;
@Column(name="per_testeada_resultado")
private String resultadoTesteo;
	  */
	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name= "REGISTRO_TESTEO")
	/**
	 * Atributo que representa el registro de testeo
	 */
	private RegistroTesteo testeo; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	/**
	 * Atributo que presenta id el indentificador de la persona testeada
	 */
	private Long id;
	/**
	 * Atributo que representa el dni de la persona testeada.
	 */

	@Column( name = "DOCUMENTO")
	private String documento;
	/**
	 * Atributo que representa el apellido de la persona testeada.
	 */
	@Column ( name = "APELLIDO")
	private String apellido;
	/**
	 * Atributo que representa el o los nombres de la persona testeada.
	 */
	@Column ( name = "NOMBRES" , length = 150, nullable = true)
	private String nombres;
	/**
	 * Atributo que representa el resultado del testeo de la persona testeada.
	 */
	@Column ( name = "RESULTADO")
	private String resultadoTesteo;

	/*
	 *---------------------------------
	 *-------- constructores --------------
	 *---------------------------------
	 */
	/**
	 * Constructor vacio
	 */

	public PersonaTesteada() {
		super();
	}


	/**
	 * Constructor Parametrizado
	 * @param documento valor del dni de la persona testeada.
	 * @param apellido valor del apellido de la persona testeada. 
	 * @param nombres valor de los nombres de la persona testeada.
	 * @param resultadoTesteo valor del resultado de la persona testeada.
	 */
	public PersonaTesteada(String documento, String apellido, String nombres, String resultadoTesteo) {
		//asignacion del parametro documento a el atributo documento
		this.documento = documento;
		//asignacion del parametro apellido al atributo apellido
		this.apellido = apellido;
		//asignacion del paraetro nombres al atributo nombres
		this.nombres = nombres;
		//asignacion del parametro resultadoTesteo al atributo resultadoTesteo.
		this.resultadoTesteo = resultadoTesteo;
	}
	
	/*
	 *---------------------------------
	 *-------- metodos accesores --------------
	 *---------------------------------
	 */

	/**
	 * retorna el documento de la persona testeada
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}


	/**
	 * asigna un valor al documento de la persona testeada
	 * @param documento the documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}


	/**
	 * retorna el apellido de la persona testeada
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}


	/**
	 * asigna un valor al apellido de la persona testeada
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	/**
	 * retorna los nombres de la persona testeada
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}


	/**
	 * asigna un valor al nombre de la persona testeada
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	/**
	 * retorna el resultado del testeo de la persona testeada
	 * @return the resultadoTesteo
	 */
	public String getResultadoTesteo() {
		return resultadoTesteo;
	}


	/**
	 * asigna un valor al resultado del testeo de la persona testeada
	 * @param resultadoTesteo the resultadoTesteo to set
	 */
	public void setResultadoTesteo(String resultadoTesteo) {
		this.resultadoTesteo = resultadoTesteo;
	}
/**
 * 
 * @return
 */
	public Long getId() {
		return id;
	}

/**
 * 
 * @param id
 */
	public void setId(Long id) {
		this.id = id;
	}


	//Metodo que retorna u na cadena de texto con los valores de los atributos
	@Override
	public String toString() {
		return "PersonaTesteada [documento=" + documento + ", apellido=" + apellido + ", nombres=" + nombres
				+ ", resultadoTesteo=" + resultadoTesteo + "]";
	}
	
}
