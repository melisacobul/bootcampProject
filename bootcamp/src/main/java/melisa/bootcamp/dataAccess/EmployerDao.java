package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
