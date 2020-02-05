package sr.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import sr.model.UserType;
public interface UserTypeRepository extends JpaRepository<UserType, Integer>
{

}
