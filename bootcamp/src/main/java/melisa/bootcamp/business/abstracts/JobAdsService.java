package melisa.bootcamp.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.JobsAds;

public interface JobAdsService {
	DataResult<List<JobsAds>> getAllJobAds();
	Result add(JobsAds jobads);
	Result delete(JobsAds jobads);
	
	DataResult<List<JobsAds>> getAllSortedByActive();
	DataResult<List<JobsAds>> getAllSortedByDate();
	DataResult<List<JobsAds>> getById(int id);

}