package melisa.bootcamp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import melisa.bootcamp.business.abstracts.CityService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.City;

@RestController
@RequestMapping("/api/cities")
public class CityController {
	private CityService cityService;
	
	@Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<City>> getAll(){
		return this.cityService.getAll();
	}
}
