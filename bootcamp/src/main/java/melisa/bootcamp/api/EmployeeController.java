package melisa.bootcamp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.EmployeeService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getallemployees")
	public DataResult<List<Employee>> getAll(){
		return this.employeeService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employee employee) {
		return this.employeeService.add(employee);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody Employee employee) {
		return employeeService.delete(employee);	
	}
}
