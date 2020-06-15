package ar.edu.unju.fi.tracking.model;

import org.springframework.stereotype.Component;

/**
 * Clase que representa a un usuario que se registrara 
 * y debera completar los campos requeridos y obligatorios.
 * @author Torrejon Cristian
 * @version 1.0
 */
@Component
public class Usuario {
	
	/*
	 *---------------------------------
	 *-------- atributos --------------
	 *---------------------------------
	 */
	
	/**
	 * Atributo que representa el nombre del Usuario.
	 */
	String nombreUsuario;
	/**
	 * Atributo que representa el password del Usuario.
	 */
	String password;
	/**
	 * Atributo que representa el nombre real del Usuario.
	 */
	String nombreReal;
	/**
	 * Atributo que representa el apellido real del Usuario.
	 */
	String apellidoReal;
	/**
	 * Atributo que representa el tipo de Usuario.
	 */
	String tipoUsuario;     //Consultor-Registrador-Bd
	
	/*
	 *---------------------------------
	 *-------- constructores --------------
	 *---------------------------------
	 */
	/**
	 * Constructor por defecto
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor Parametrizado
	 * @param nombreUsuario Valor para el nombre del usuario
	 * @param password Valor para el password del usuario
	 * @param nombreReal Valor para el nombre real del usuario
	 * @param apellidoReal Valor para el apellido real del usuario
	 * @param tipoUsuario Valor para el tipo de usuario
	 */
	public Usuario(String nombreUsuario, String password, String nombreReal, String apellidoReal, String tipoUsuario) {
		//asignacion del parametro nombreUsuario al atributo nombreUsuario.
		this.nombreUsuario = nombreUsuario;
		//asignacion del parametro password al atributo password.
		this.password = password;
		//asignacion del parametro nombreReal al atributo nombreReal.
		this.nombreReal = nombreReal;
		//asignacion del parametro apellidoReal al atributo apellidoReal.
		this.apellidoReal = apellidoReal;
		//asignacion del parametro tipoUsuario al atributo tipoUsuario.
		this.tipoUsuario = tipoUsuario;
	}

	/*
	 *---------------------------------
	 *-------- metodos accesores --------------
	 *---------------------------------
	 */
	
	/**
	 * retorna el nombre del usuario
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * asigna un valor al nombre del usuario
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * retorna el password del usuario
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * asigna un valor al password del usuario
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * retorna el nombre real del usuario
	 * @return the nombreReal
	 */
	public String getNombreReal() {
		return nombreReal;
	}

	/**
	 * asigna un valor al nombre real del usuario
	 * @param nombreReal the nombreReal to set
	 */
	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}

	/**
	 * retorna el apellido real del usuario
	 * @return the apellidoReal
	 */
	public String getApellidoReal() {
		return apellidoReal;
	}

	/**
	 * asigna un valor al apellido real del usuario
	 * @param apellidoReal the apellidoReal to set
	 */
	public void setApellidoReal(String apellidoReal) {
		this.apellidoReal = apellidoReal;
	}

	/**
	 * retorna el tipo de usuario
	 * @return the tipoUsuario
	 */
	public String getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * asigna un valor al tipo de usuario
	 * @param tipoUsuario the tipoUsuario to set
	 */
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	//Metodo que retorna una cadena de texto con los valores de los atributos
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", password=" + password + ", nombreReal=" + nombreReal
				+ ", apellidoReal=" + apellidoReal + ", tipoUsuario=" + tipoUsuario + "]";
	}
	
}
