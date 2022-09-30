package melisa.bootcamp.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.Job;

public interface JobService {
	DataResult<List<Job>> getAllJobs();
	Result add(Job job);
	Result Delete(Job job);
}
