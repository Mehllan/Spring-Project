package sr.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import sr.model.Country;
import sr.repository.CountryRepository;
public class CountryService
{
  @Autowired
  CountryRepository countryRepository;

public void deleteAllInBatch() {
	
	
}

public void deleteInBatch(Iterable<Country> arg0) {
	
	
}

public List<Country> findAll() {
	// TODO Auto-generated method stub
	return null;
}

public List<Country> findAll(Sort arg0) {
	// TODO Auto-generated method stub
	return null;
}

public <S extends Country> List<S> findAll(Example<S> arg0) {
	// TODO Auto-generated method stub
	return null;
}

public <S extends Country> List<S> findAll(Example<S> arg0, Sort arg1) {
	// TODO Auto-generated method stub
	return null;
}

public List<Country> findAllById(Iterable<Integer> arg0) {
	// TODO Auto-generated method stub
	return null;
}

public void flush() {
	// TODO Auto-generated method stub
	
}

public Country getOne(Integer arg0) {
	// TODO Auto-generated method stub
	return null;
}

public <S extends Country> List<S> saveAll(Set<Country> countryset) 
{
	
	return (List<S>) (countryRepository.saveAll(countryset));
}

public <S extends Country> S saveAndFlush(Set<Country> countryset) 
{
	return null;
}

public Page<Country> findAll(Pageable arg0) {
	// TODO Auto-generated method stub
	return null;
}

public long count() {
	// TODO Auto-generated method stub
	return 0;
}

public void delete(Country arg0) {
	// TODO Auto-generated method stub
	
}

public void deleteAll() {
	// TODO Auto-generated method stub
	
}

public void deleteAll(Iterable<? extends Country> arg0) {
	// TODO Auto-generated method stub
	
}

public void deleteById(Integer arg0) 
{
	
	
}

public boolean existsById(Integer arg0)
{
	
	return false;
}

public Optional<Country> findById(Integer arg0)
{
	
	return null;
}

public <S extends Country> Country save(Country c)
{
	return countryRepository.save(c);
}

public <S extends Country> long count(Example<S> arg0) {
	// TODO Auto-generated method stub
	return 0;
}

public <S extends Country> boolean exists(Example<S> arg0) {
	// TODO Auto-generated method stub
	return false;
}

public <S extends Country> Page<S> findAll(Example<S> arg0, Pageable arg1) {
	// TODO Auto-generated method stub
	return null;
}

public <S extends Country> Optional<S> findOne(Example<S> arg0) {
	// TODO Auto-generated method stub
	return null;
}
  
}
