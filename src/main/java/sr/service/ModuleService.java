package sr.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import sr.model.Modules;
import sr.repository.ModuleRepository;
public class ModuleService
{
  @Autowired
  private ModuleRepository moduleRepository;
  public void deleteAllInBatch() 
  {
  }
	public void deleteInBatch(Iterable<Modules> arg0) 
	{
	
	}

	public List<Modules> findAll()
	{
		return null;
	}

	public List<Modules> findAll(Sort arg0)
	{
		return null;
	}

	public <S extends Modules> List<S> findAll(Example<S> arg0) 
	{
		return null;
	}

	public <S extends Modules> List<S> findAll(Example<S> arg0, Sort arg1)
	{
		return null;
	}

	public List<Modules> findAllById(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public Modules getOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Modules> List<S> saveAll(Iterable<S> moduleset) 
	{
		return moduleRepository.saveAll((Iterable<S>) moduleset);
	}

	public <S extends Modules> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Modules> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(Modules arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Modules> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean existsById(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Optional<Modules> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Modules> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Modules> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends Modules> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public <S extends Modules> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Modules> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
