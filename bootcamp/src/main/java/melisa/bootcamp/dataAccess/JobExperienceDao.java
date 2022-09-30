package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer>{

}
