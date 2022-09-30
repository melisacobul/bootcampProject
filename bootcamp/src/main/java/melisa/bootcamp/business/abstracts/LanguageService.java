package melisa.bootcamp.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.Language;

@Service
public interface LanguageService {
	DataResult<List<Language>> getAll();
	Result add(Language language);
}
