package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import melisa.bootcamp.entities.JobPosition;

@Service
public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}