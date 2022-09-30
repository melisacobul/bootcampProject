package melisa.bootcamp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.CompanyService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.Company;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {
	private CompanyService companyService;
	
	@Autowired
	public CompanyController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Company>> getAll(){
		return this.companyService.getAllCompanies();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Company company) {
		return this.companyService.add(company);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody Company company) {
		return this.companyService.delete(company);
	}
}