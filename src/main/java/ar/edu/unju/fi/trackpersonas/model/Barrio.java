package ar.edu.unju.fi.trackpersonas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;



/**
 * Clase que representa el nombre de un barrio 
 * cualquiera dentro de una cuidad.
 * @author GRUPO16
 * @version 1.0
 */
@Entity
@Component
@Table( name = "BARRIOS")
public class Barrio implements Serializable {
	private static final long serialVersionUID = 1L;

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
	 * Atributo que representa el nombre del Barrio.
	 */
	
	@Column(name = "NOMBRE")
	@NotBlank
	private String nombre; 

	
	/*
	 *---------------------------------
	 *-------- constructores --------------
	 *---------------------------------
	 */
	/**
	 * Constructor por defecto
	 */
	public Barrio() {
		super();   // TODO Auto-generated constructor stub
	}
     /**
	 * Constructor Parametrizado
	 * @param nombre valor del nombre del Barrio.
	 */
	public Barrio(String nombre) {
		//asignacion del parametro nombre al atributo nombre.
		this.nombre = nombre;
	}
	
	/*
	 *---------------------------------
	 *-------- metodos accesores --------------
	 *---------------------------------
	 */

	/**
	 * reotrna el nombre del Barrio.
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * asigna un valor al nombre del Barrio.
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Barrio [nombre=" + nombre + "]";
	}
}
