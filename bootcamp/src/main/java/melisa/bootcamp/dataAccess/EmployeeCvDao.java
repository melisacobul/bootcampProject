package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.EmployeeCv;

public interface EmployeeCvDao extends JpaRepository<EmployeeCv, Integer>{

}

