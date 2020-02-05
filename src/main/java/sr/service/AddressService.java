package sr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import sr.model.Address;
import sr.repository.AddressRepository;

public class AddressService
{
@Autowired
private AddressRepository addressRepository;
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public void deleteInBatch(Iterable<Address> arg0) {
		// TODO Auto-generated method stub
		
	}

	public List<Address> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Address> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Address> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Address> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Address> findAllById(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public Address getOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Address> List<S> saveAll(Iterable<S> address) 
	{
		// TODO Auto-generated method stub
		return addressRepository.saveAll(address);
	}

	public <S extends Address> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Address> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(Address arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Address> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean existsById(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Optional<Address> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Address> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Address> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends Address> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public <S extends Address> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Address> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
