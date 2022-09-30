package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.EmployeeEducation;

public interface EmployeeEducationDao extends JpaRepository<EmployeeEducation, Integer>{

}
