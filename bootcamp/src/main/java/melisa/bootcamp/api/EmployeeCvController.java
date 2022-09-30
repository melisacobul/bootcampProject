package melisa.bootcamp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.EmployeeCvService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.EmployeeCv;
import melisa.bootcamp.entities.EmployeeEducation;
import melisa.bootcamp.entities.EmployeeLanguage;
import melisa.bootcamp.entities.EmployeeSocialMedia;
import melisa.bootcamp.entities.EmployeeTechnology;
import melisa.bootcamp.entities.JobExperience;

@RestController
@RequestMapping("/api/employeecv")
public class EmployeeCvController {
	private EmployeeCvService employeeCvService;
	
	@Autowired
	public EmployeeCvController(EmployeeCvService employeeCvService) {
		super();
		this.employeeCvService = employeeCvService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<EmployeeCv>> getAll(){
		return this.employeeCvService.getAll();
	}
	
	@GetMapping("/getallexperiences")
	public DataResult<List<JobExperience>> getJobExperiences(){
		return this.employeeCvService.getJobExperiences();
	}
	
	@GetMapping("/getemployeeeducation")
	public DataResult<List<EmployeeEducation>> getEmployeeEducation(){
		return this.employeeCvService.getEmployeeEducation();
	}
	
	@GetMapping("/getalltechnologies")
	public DataResult<List<EmployeeTechnology>> getAllTechnologies(){
		return this.employeeCvService.getAllTechnologies();
	}
	
	@GetMapping("/getalllanguages")
	public DataResult<List<EmployeeLanguage>> getAllEmployeeLanguages(){
		return this.employeeCvService.getAllEmployeeLanguages();
	}
	
	@GetMapping("/getallsocialmedias")
	public DataResult<List<EmployeeSocialMedia>> getAllSocialMedias(){
		return this.employeeCvService.getAllSocialMedias();
	}
	
	@PostMapping("/addcv")
	public Result addCv(@RequestBody EmployeeCv employeeCv) {
		return this.employeeCvService.addCv(employeeCv);
	}
	
	@PostMapping("/addexperience")
	public Result addExperience(@RequestBody JobExperience jobExperience) {
		return this.employeeCvService.addExperience(jobExperience);
	}
	
	@PostMapping("/addeducation")
	public Result addEducation(@RequestBody EmployeeEducation employeeEducation) {
		return this.employeeCvService.addEducation(employeeEducation);
	}
	
	@PostMapping("/addtechnology")
	public Result addTechnology(@RequestBody EmployeeTechnology employeeTechnology) {
		return this.employeeCvService.addTechnology(employeeTechnology);
	}
	
	@PostMapping("/addlanguage")
	public Result addLanguage(@RequestBody EmployeeLanguage employeeLanguage) {
		return this.employeeCvService.addLanguage(employeeLanguage);
	}
	
	@PostMapping("/addsocialmedia")
	public Result addSocialMedia(@RequestBody EmployeeSocialMedia employeeSocialMedia) {
		return this.employeeCvService.addSocialMedia(employeeSocialMedia);
	}
}
