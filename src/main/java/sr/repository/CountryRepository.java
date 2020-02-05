package sr.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import sr.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>
{
  
}
