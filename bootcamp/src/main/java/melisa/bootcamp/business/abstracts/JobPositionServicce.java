package melisa.bootcamp.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.JobPosition;

public interface JobPositionServicce {
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
	Result delete(JobPosition jobPosition);
}

