package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}