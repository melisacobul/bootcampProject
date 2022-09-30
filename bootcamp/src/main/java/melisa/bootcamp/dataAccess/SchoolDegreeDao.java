package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.SchoolDegree;

public interface SchoolDegreeDao extends JpaRepository<SchoolDegree, Integer>{

}