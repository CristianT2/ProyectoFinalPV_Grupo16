package ar.edu.unju.fi.tracking.repository;




import java.util.Optional;

/*import java.util.Optional; */

import org.springframework.data.jpa.repository.JpaRepository;


import ar.edu.unju.fi.tracking.model.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long>{


/**
 * Metodo definido con el fin de permitir realizar una Busqueda segun el Nombre 
 * de Usuario en el repositorio<br>
 * Obs: nombreUsuario <> nombreReal
 * 
 * @param nombreUsuario
 * @return objeto de tipo Optional que luego sera analizado si es que contiene 
 * un resultado valido luego de la busqueda
 */
public Optional<Usuario> findByNombreUsuario(String nombreUsuario);

}

/**
 * Metodo que permite Listar desde el repositorio todos
 * aquellos Usuario segun su estado ( true->activo, false-> inactivo).
 * 
 * @param estado requerido para generar la Lista
 * @return Lista de tipo Usuario
 */

  

