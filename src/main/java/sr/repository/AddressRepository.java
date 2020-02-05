package sr.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import sr.model.Address;
public interface AddressRepository extends JpaRepository<Address, Integer> 
{

}
