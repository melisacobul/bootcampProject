package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.EmployeeLanguage;

public interface EmployeeLanguageDao extends JpaRepository<EmployeeLanguage, Integer>{

}
