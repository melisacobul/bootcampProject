package melisa.bootcamp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.JobPositionServicce;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionController {
	private JobPositionServicce jobPositionServicce;
	
	@Autowired
	public JobPositionController(JobPositionServicce jobPositionServicce) {
		super();
		this.jobPositionServicce = jobPositionServicce;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return this.jobPositionServicce.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition) {
		return this.jobPositionServicce.add(jobPosition);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody JobPosition jobPosition) {
		return this.jobPositionServicce.delete(jobPosition);
	}
}
