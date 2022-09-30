package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.EmployeeSchoolDepartment;

public interface EmployeeSchoolDepartmentDao extends JpaRepository<EmployeeSchoolDepartment, Integer>{

}
