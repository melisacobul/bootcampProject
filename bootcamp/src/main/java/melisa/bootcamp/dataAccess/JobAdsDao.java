package melisa.bootcamp.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import melisa.bootcamp.entities.JobsAds;

@Service
public interface JobAdsDao extends JpaRepository<JobsAds, Integer>{
	@Query("From JobAds where isActive=true")
	List<JobsAds> getByIsActive();
	List<JobsAds> findById(int id);
	
	
}