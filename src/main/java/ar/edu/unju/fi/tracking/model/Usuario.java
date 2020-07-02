package ar.edu.unju.fi.tracking.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * Clase que representa a un usuario que se registrara 
 * y debera completar los campos requeridos y obligatorios.
 * @author Torrejon Cristian
 * @version 1.0
 */
@Component
@Entity
@Table(name = "USUARIOS")
public class Usuario implements Serializable{
	
	/*
	 *---------------------------------
	 *-------- atributos --------------
	 *---------------------------------
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "ID")
	private Long id;
	
	/**
	 * Atributo que representa el nombre del Usuario.
	 */
	@Column(name= "NOMBRE_USUARIO", length = 20, nullable = true)
	private String nombreUsuario;
	/**
	 * Atributo que representa el password del Usuario.
	 */
	@Column(name = "PASSWORD", length = 15,nullable = true)
	private String password;
	/**
	 * Atributo que representa el nombre real del Usuario.
	 */
	@Column(name = "NOMBRE_REAL", length = 40, nullable = true)
	private String nombreReal;
	/**
	 * Atributo que representa el apellido real del Usuario.
	 */
	@Column(name = "APELLIDO_REAL", length = 20, nullable = true)
	private String apellidoReal;
	/**
	 * Atributo que representa el tipo de Usuario.
	 */
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Rol>roles;     //Consultor-Registrador-Bd
	
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
	 * @param roles Valor para la lista de roles
	 */
	public Usuario(String nombreUsuario, String password, String nombreReal, String apellidoReal, List<Rol> roles) {
		//asignacion del parametro nombreUsuario al atributo nombreUsuario.
		this.nombreUsuario = nombreUsuario;
		//asignacion del parametro password al atributo password.
		this.password = password;
		//asignacion del parametro nombreReal al atributo nombreReal.
		this.nombreReal = nombreReal;
		//asignacion del parametro apellidoReal al atributo apellidoReal.
		this.apellidoReal = apellidoReal;
		//asignacion del parametro roles al atributo roles.
		this.roles = roles;
	}

	/*
	 *---------------------------------
	 *-------- metodos accesores --------------
	 *---------------------------------
	 */

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
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
	 * retorna los roles del usuario
	 * @return the roles
	 */
	public List<Rol> getRoles() {
		return roles;
	}

	/**
	 * asigna un valor a los roles de el usuario
	 * @param roles the roles to set
	 */
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
	//Metodo que retorna una cadena de texto con los valores de los atributos
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", password=" + password + ", nombreReal=" + nombreReal
				+ ", apellidoReal=" + apellidoReal + ", roles=" + roles + "]";
	}
	
}
