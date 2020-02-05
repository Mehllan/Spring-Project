package sr.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import sr.model.Modules;

public interface ModuleRepository extends JpaRepository<Modules, Integer>
{

}
