package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.Company;


public interface CompanyDao extends JpaRepository<Company, Integer>{

}
