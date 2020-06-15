package ar.edu.unju.fi.testeos.model;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.trackpersonas.model.Barrio;

/**
 * Clase que representa una vivienda ubicada en una ciudad cualquiera.
 * @author Torrejon Cristian
 * @version 1.0
 */

@Component
public class UnidadHabitacional {
	
	/*
	 *---------------------------------
	 *-------- atributos --------------
	 *---------------------------------
	 */
	
	/**
	 * Atributo que representa la direccion de una vivienda.
	 */
	String direccion;
	/**
	 * Atributo que representa el barrio donde esta ubicada de una vivienda.
	 */
	Barrio barrio;
	
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

	//Metodo que retorna una cadena de texto con los valores de los atributos
	@Override
	public String toString() {
		return "UnidadHabitacional [direccion=" + direccion + ", barrio=" + barrio + "]";
	}
	
}
