package melisa.bootcamp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import melisa.bootcamp.entities.City;

public interface CityDao extends JpaRepository<City, Integer>{
	
}