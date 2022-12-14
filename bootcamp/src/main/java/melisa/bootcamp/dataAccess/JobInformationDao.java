package melisa.bootcamp.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import melisa.bootcamp.entities.JobInformation;

@Service
public interface JobInformationDao extends JpaRepository<JobInformation, Integer> {
	List<JobInformation> findById(int id);

}
