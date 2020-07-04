package ar.edu.unju.fi.testeos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;


@Repository("personaTesteadaDAOImp")
public class PersonaTesteadaDAOImp implements IPersonaTesteadaDAO {
public PersonaTesteada personaTesteada;

@Override
public List<PersonaTesteada> findAll() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<PersonaTesteada> findAll(Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<PersonaTesteada> findAllById(Iterable<Long> ids) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonaTesteada> List<S> saveAll(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void flush() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends PersonaTesteada> S saveAndFlush(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteInBatch(Iterable<PersonaTesteada> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAllInBatch() {
	// TODO Auto-generated method stub
	
}

@Override
public PersonaTesteada getOne(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonaTesteada> List<S> findAll(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonaTesteada> List<S> findAll(Example<S> example, Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Page<PersonaTesteada> findAll(Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonaTesteada> S save(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Optional<PersonaTesteada> findById(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean existsById(Long id) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public long count() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void deleteById(Long id) {
	// TODO Auto-generated method stub
	
}

@Override
public void delete(PersonaTesteada entity) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll(Iterable<? extends PersonaTesteada> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends PersonaTesteada> Optional<S> findOne(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonaTesteada> Page<S> findAll(Example<S> example, Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonaTesteada> long count(Example<S> example) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public <S extends PersonaTesteada> boolean exists(Example<S> example) {
	// TODO Auto-generated method stub
	return false;
}
}
