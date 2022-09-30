package melisa.bootcamp.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.Technology;

@Service
public interface TechnologyService {
	DataResult<List<Technology>> getAll();
	Result add(Technology technology);
}
