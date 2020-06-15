package ar.edu.unju.fi.trackpersonas.model;

import org.springframework.stereotype.Component;

/**
 * Clase que representa el nombre de un barrio 
 * cualquiera dentro de una cuidad.
 * @author Torrejon Cristian
 * @version 1.0
 */

@Component
public class Barrio {

	/*
	 *---------------------------------
	 *-------- atributos --------------
	 *---------------------------------
	 */
	
	/**
	 * Atributo que representa el nombre del Barrio.
	 */
	String nombre;
	
	/*
	 *---------------------------------
	 *-------- constructores --------------
	 *---------------------------------
	 */
	/**
	 * Constructor por defecto
	 */
	public Barrio() {
		// TODO Auto-generated constructor stub
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

	//Metodo que retorna una cadena de texto con los valores de los atributos
	@Override
	public String toString() {
		return "Barrio [nombre=" + nombre + "]";
	}
}
