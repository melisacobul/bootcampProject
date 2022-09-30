package melisa.bootcamp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.LanguageService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	private LanguageService languageService;
	
	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getalllanguages")
	public DataResult<List<Language>> getAll(){
		return this.languageService.getAll();
	}
	
	@PostMapping("/addlanguage")
	public Result add(@RequestBody Language language) {
		return this.languageService.add(language);
	}

}
