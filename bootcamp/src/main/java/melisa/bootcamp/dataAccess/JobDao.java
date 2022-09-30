package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.Job;

public interface JobDao extends JpaRepository<Job, Integer>{
	
}
