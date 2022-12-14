package melisa.bootcamp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.JobInformationService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.JobInformation;

@RestController
@RequestMapping("/api/jobinformations")
@CrossOrigin
public class JobInformationController {
	private JobInformationService jobInformationService;
	
	@Autowired
	public JobInformationController(JobInformationService jobInformationService) {
		super();
		this.jobInformationService = jobInformationService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobInformation>> getAllJobInformations(){
		return this.jobInformationService.getAllJobInformations();
	}
	
	@GetMapping("/getbyid")
	public DataResult<List<JobInformation>> getById(int id){
		return this.jobInformationService.getById(id);
	}
	
	@PostMapping("/addjobinformation")
	public Result add(@RequestBody JobInformation jobInformation) {
		return this.jobInformationService.add(jobInformation);
	}
	
	@PostMapping("/deletejobinformation")
	public Result delete(JobInformation jobInformation) {
		return this.jobInformationService.delete(jobInformation);
	}

}

