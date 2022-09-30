package melisa.bootcamp.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAllEmployers();
	Result add(Employer employer);
	Result delete(Employer employer);
}

