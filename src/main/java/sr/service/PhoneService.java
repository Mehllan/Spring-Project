package sr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import sr.model.Phone;
import sr.repository.PhoneRepository;
public class PhoneService
{
@Autowired
private PhoneRepository phoneRepository;
	public void deleteAllInBatch() 
	{
		
		
	}

	public void deleteInBatch(Iterable<Phone> arg0) {
		// TODO Auto-generated method stub
		
	}

	public List<Phone> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Phone> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Phone> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Phone> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Phone> findAllById(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public Phone getOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Phone> List<S> saveAll(Iterable<S> phlist) 
	{
		return phoneRepository.saveAll(phlist);
	}

	public <S extends Phone> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Phone> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(Phone arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Phone> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean existsById(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Optional<Phone> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Phone> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Phone> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends Phone> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public <S extends Phone> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Phone> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
