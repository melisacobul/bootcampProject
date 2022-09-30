package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.SchoolDepartment;

public interface SchoolDepartmentDao extends JpaRepository<SchoolDepartment, Integer>{

}
