package melisa.bootcamp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.JobService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
	private JobService jobService;
	
	@Autowired
	public JobController(JobService jobService) {
		super();
		this.jobService = jobService;
	}
	
	
	@GetMapping("/getalljobs")
	public DataResult<List<Job>> getAllJobs(){
		return this.jobService.getAllJobs();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Job job) {
		return this.jobService.add(job);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody Job job) {
		return jobService.Delete(job);
	}
}
 
