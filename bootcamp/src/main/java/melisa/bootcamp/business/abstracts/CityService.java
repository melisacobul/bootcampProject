package melisa.bootcamp.business.abstracts;

import java.util.List;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.City;

public interface CityService {
	DataResult<List<City>> getAll();
}
