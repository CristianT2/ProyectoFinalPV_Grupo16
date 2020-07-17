package ar.edu.unju.fi.tracking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

/**
 * Clase que representa a un usuario que se registrara 
 * y debera completar los campos requeridos y obligatorios.
 * @author GRUPO16   
 * @version 1.0
 */
@Component
@Entity
@Table (name="USUARIOS")
 public class Usuario implements Serializable {
	private static final long serialVersionUID =1L ;
	
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
	 * Atributo que representa el nombre del Usuario.
	 */
	@Column (name = " NOMBRE ", length = 150, nullable = true)
	@NotBlank(message="Debe ingresar un nombre de usuario")
	private String nombreUsuario;
	/**
	 * Atributo que representa el password del Usuario.
	 */
	@Column (name = "PASSWORD")
	@NotBlank
	@Size(min=8, message= "Su contraseña tiene que tener como minimo 8 caracteres")
	private String password;
	/**
	 * Atributo que representa el nombre real del Usuario.
	 */
	@Column(name = "NOMBRE_REAL")
	@NotBlank
	private String nombreReal;
	/**
	 * Atributo que representa el apellido real del Usuario.
	 */
	@Column (name = " APELLIDO_REAL")
	@NotBlank ( message = " El apellido no puede quedar en blanco")
	private String apellidoReal;
	/**
	 * Atributo que representa el tipo de Usuario.
	 */
	@Column(name = "TIPO_DE_USUARIO")
	@NotBlank
	private String tipoUsuario;     //Consultor-Registrador-Bd
	
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
	 *Se crea cinco constructores
	 * @param nombreUsuario Valor para el nombreUsuario del usuario(un parametro para inicializar nombreUsuario)
	 * @param password Valor para el password del usuario (un parametro para inicializar password)
	 * @param nombreReal Valor para el nombre real del usuario ( un parametro para inicializar nombreReal)
	 * @param apellidoReal Valor para el apellido real del usuario (un parametro para inicializar apellidoReal)
	 * @param tipoUsuario Valor para el tipo de usuario (un parametro para inicializar tipoUsuario)
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
	 * Metodo que muestra nombreUsuario
	 * @return Retorna nombreUsuario tipo String
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
/**
 * Metodo que muestra id de Usuario 
 * @return Retorna id de tipo Long
 */
	public Long getId() {
		return id;
	}
/**
 * Metodo que setea un valor a atributo id
 * @param id
 */
	public void setId(Long id) {
		this.id = id;
	}

	// Metodo que retorna una cadena de texto con los valores de los atributos
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", password=" + password + ", nombreReal=" + nombreReal
				+ ", apellidoReal=" + apellidoReal + ", tipoUsuario=" + tipoUsuario + "]";
	}
	
}
