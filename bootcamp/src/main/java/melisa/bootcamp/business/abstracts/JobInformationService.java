package melisa.bootcamp.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.JobInformation;

public interface JobInformationService {
	DataResult<List<JobInformation>> getAllJobInformations();
	DataResult<List<JobInformation>> getById(int id);
	
	Result add(JobInformation jobInformation);
	Result delete(JobInformation jobInformation);
}
