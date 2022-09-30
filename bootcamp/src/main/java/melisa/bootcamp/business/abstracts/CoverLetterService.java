package melisa.bootcamp.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.CoverLetter;

@Service
public interface CoverLetterService {
	DataResult<List<CoverLetter>> getAll();
	Result add(CoverLetter coverLetter);
	Result delete(CoverLetter coverLetter);
}