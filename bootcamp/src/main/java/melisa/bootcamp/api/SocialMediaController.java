package melisa.bootcamp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.SocialMediaService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.SocialMedia;

@RestController
@RequestMapping("/api/socialmedia")
public class SocialMediaController {
	private SocialMediaService socialMediaService;
	
	@Autowired
	public SocialMediaController(SocialMediaService socialMediaService) {
		super();
		this.socialMediaService = socialMediaService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<SocialMedia>> getAll(){
		return this.socialMediaService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SocialMedia socialMedia) {
		return this.socialMediaService.add(socialMedia);
	}
}