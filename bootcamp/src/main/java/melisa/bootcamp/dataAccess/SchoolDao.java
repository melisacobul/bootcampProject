package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.School;

public interface SchoolDao extends JpaRepository<School, Integer>{

}
