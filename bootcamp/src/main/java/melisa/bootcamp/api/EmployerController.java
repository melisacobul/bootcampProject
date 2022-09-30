package melisa.bootcamp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.EmployerService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	private EmployerService employerService;
	
	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getallemployers")
	public DataResult<List<Employer>> getAllEmployers(){
		return this.employerService.getAllEmployers();
	} 
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer){
		return this.employerService.add(employer);
	} 
	
	@PostMapping("/delete")
	public Result delete(@RequestBody Employer employer){
		return this.employerService.delete(employer);
	} 
}