package melisa.bootcamp.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.SystemPersonnel;

public interface SystemPersonnelService {
	DataResult<List<SystemPersonnel>> getAll();
	Result add(SystemPersonnel systemPersonnel);
	Result delete(SystemPersonnel systemPersonnel);
}
