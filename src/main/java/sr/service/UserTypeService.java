package sr.service;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import sr.model.UserType;
import sr.repository.UserTypeRepository;
public class UserTypeService
{
   @Autowired
    private UserTypeRepository usertypeRepository;
	public void deleteAllInBatch() 
	{
		
	}

	public void deleteInBatch(Iterable<UserType> arg0) 
	{
		
	}

	public List<UserType> findAll() 
	{
		
		return null;
	}

	public List<UserType> findAll(Sort arg0)
	{
		
		return null;
	}

	public <S extends UserType> List<S> findAll(Example<S> arg0) 
	{
		
		return null;
	}

	public <S extends UserType> List<S> findAll(Example<S> arg0, Sort arg1) 
	{
	
		return null;
	}

	public List<UserType> findAllById(Iterable<Integer> arg0)
	{
	
		return null;
	}

	public void flush()
	{
		
		
	}

	public UserType getOne(Integer arg0) 
	{
		return null;
	}

	@SuppressWarnings("unchecked")
	public <S extends UserType> List<S> saveAll(Set<UserType> utype) 
	{
		return (List<S>) (usertypeRepository.saveAll(utype));
	}

	public <S extends UserType> S saveAndFlush(S arg0) 
	{
		
		return null;
	}

	public Page<UserType> findAll(Pageable arg0)
	{
		
		return null;
	}

	public long count() 
	{
		
		return 0;
	}

	public void delete(UserType arg0) 
	{
		
		
	}

	public void deleteAll() 
	{
	
		
	}

	public void deleteAll(Iterable<? extends UserType> arg0) 
	{
		
		
	}

	public void deleteById(Integer arg0)
	{
	
		
	}

	public boolean existsById(Integer arg0)
	{
		
		return false;
	}

	public Optional<UserType> findById(Integer arg0)
	{
		
		return null;
	}

	public <S extends UserType> S save(S arg0) 
	{
	
		return null;
	}

	public <S extends UserType> long count(Example<S> arg0) 
	{
		
		return 0;
	}

	public <S extends UserType> boolean exists(Example<S> arg0) 
	{
	
		return false;
	}

	public <S extends UserType> Page<S> findAll(Example<S> arg0, Pageable arg1) 
	{
		
		return null;
	}

	public <S extends UserType> Optional<S> findOne(Example<S> arg0)
	{
		
		return null;
	}

}
