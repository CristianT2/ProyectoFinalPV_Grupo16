package ar.edu.unju.fi.testeos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.testeos.model.UnidadHabitacional;

@Repository("unidadHabitacionalDAOImp")
public class UnidadHabitacionalDAOImp implements IUnidadHabitacionalDAO {
public UnidadHabitacional unidadHabitacional;

@Override
public List<UnidadHabitacional> findAll() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<UnidadHabitacional> findAll(Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<UnidadHabitacional> findAllById(Iterable<Long> ids) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends UnidadHabitacional> List<S> saveAll(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void flush() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends UnidadHabitacional> S saveAndFlush(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteInBatch(Iterable<UnidadHabitacional> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAllInBatch() {
	// TODO Auto-generated method stub
	
}

@Override
public UnidadHabitacional getOne(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends UnidadHabitacional> List<S> findAll(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends UnidadHabitacional> List<S> findAll(Example<S> example, Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Page<UnidadHabitacional> findAll(Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends UnidadHabitacional> S save(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Optional<UnidadHabitacional> findById(Long id) {
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
public void delete(UnidadHabitacional entity) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll(Iterable<? extends UnidadHabitacional> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends UnidadHabitacional> Optional<S> findOne(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends UnidadHabitacional> Page<S> findAll(Example<S> example, Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends UnidadHabitacional> long count(Example<S> example) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public <S extends UnidadHabitacional> boolean exists(Example<S> example) {
	// TODO Auto-generated method stub
	return false;
}
}


