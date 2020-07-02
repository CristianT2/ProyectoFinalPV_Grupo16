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

import ar.edu.unju.fi.trackpersonas.model.Barrio;

/**
 * Clase que representa una vivienda ubicada en una ciudad cualquiera.
 * @author Torrejon Cristian
 * @version 1.0
 */

@Component
@Entity
@Table (name = "UNIDAD_HABITACIONALES")
public class UnidadHabitacional implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/*
	 *---------------------------------
	 *-------- atributos --------------
	 *---------------------------------
	 */
	
	/**
	 * Atributo que representa la direccion de una vivienda.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "DIRECCION")
	private String direccion;
	/**
	 * Atributo que representa el barrio donde esta ubicada de una vivienda.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BARRIO" , nullable = false )
	private Barrio barrio;
	
	/*
	 *---------------------------------
	 *-------- constructores --------------
	 *---------------------------------
	 */
	/**
	 * Constructor por defecto
	 */
	public UnidadHabitacional() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor parametrizado
	 * @param direccion valor de la direccion de una casa
	 * @param barrio valor del barrio donde esta una casa
	 */
	public UnidadHabitacional(String direccion, Barrio barrio) {
		//asignacion del parametro direccion al atributo direccion.
		this.direccion = direccion;
		//asignacion del parametro barrio al atributo barrio.
		this.barrio = barrio;
	}

	/*
	 *---------------------------------
	 *-------- metodos accesores --------------
	 *---------------------------------
	 */
	
	/**
	 * retorna la direccion de la vivienda.
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * asingna un valor a la direccion de la vivienda.
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * retorna el barrio de la vivienda.
	 * @return the barrio
	 */
	public Barrio getBarrio() {
		return barrio;
	}

	/**
	 * asigna un valor al barrio de la vivienda.
	 * @param barrio the barrio to set
	 */
	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
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
		return "UnidadHabitacional [direccion=" + direccion + ", barrio=" + barrio + "]";
	}
	
}
