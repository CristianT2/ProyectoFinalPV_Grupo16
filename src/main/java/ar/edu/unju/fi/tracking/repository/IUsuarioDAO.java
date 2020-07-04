package ar.edu.unju.fi.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.tracking.model.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long>{

}