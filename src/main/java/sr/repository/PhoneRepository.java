package sr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sr.model.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Integer>
{

}
