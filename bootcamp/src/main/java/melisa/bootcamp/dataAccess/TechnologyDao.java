package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.Technology;

public interface TechnologyDao extends JpaRepository<Technology, Integer>{

}
