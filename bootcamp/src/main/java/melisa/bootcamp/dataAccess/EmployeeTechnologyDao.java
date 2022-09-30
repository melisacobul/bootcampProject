package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.EmployeeTechnology;

public interface EmployeeTechnologyDao extends JpaRepository<EmployeeTechnology, Integer>{

}

