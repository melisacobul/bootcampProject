package melisa.bootcamp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.SchoolService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.EmployeeSchoolDepartment;
import melisa.bootcamp.entities.School;
import melisa.bootcamp.entities.SchoolDegree;
import melisa.bootcamp.entities.SchoolDepartment;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {
	private SchoolService schoolService;
	
	@Autowired
	public SchoolController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<School>> getAll(){
		return this.schoolService.getAll();
	}
	
	@GetMapping("/getalldepartments")
	public DataResult<List<SchoolDepartment>> getAllDepartments(){
		return this.schoolService.getAllDepartments();
	}
	
	@GetMapping("/employeeschooldepartment")
	public DataResult<List<EmployeeSchoolDepartment>> getAllEmployeeSchoolDepartment(){
		return this.schoolService.getAllEmployeeSchoolDepartment();
	}
	
	@GetMapping("/getallschooldegrees")
	public DataResult<List<SchoolDegree>> getAllSchoolDegrees(){
		return this.schoolService.getAllSchoolDegrees();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody School school) {
		return this.schoolService.add(school);
	}
	
	@PostMapping("/addschooldepartment")
	public Result addSchoolDepartment(@RequestBody SchoolDepartment schoolDepartment) {
		return this.schoolService.addSchoolDepartment(schoolDepartment);
	}
	
	@PostMapping("/addemployeeschooldepartment")
	public Result addEmployeeSchoolDepartment(@RequestBody EmployeeSchoolDepartment employeeSchoolDepartment) {
		return this.addEmployeeSchoolDepartment(employeeSchoolDepartment);
	}
	
	@PostMapping("/addschooldegree")
	public Result addSchoolDegree(@RequestBody SchoolDegree schoolDegree) {
		return this.addSchoolDegree(schoolDegree);
	}
}

