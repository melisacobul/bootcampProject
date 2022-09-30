package melisa.bootcamp.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.Employee;

public interface EmployeeService {
	DataResult<List<Employee>> getAll();
	Result add(Employee employee);
	Result delete(Employee employee);
}
