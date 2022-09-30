package melisa.bootcamp.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.SocialMedia;

@Service
public interface SocialMediaService {
	DataResult<List<SocialMedia>> getAll();
	Result add(SocialMedia socialMedia);
}

