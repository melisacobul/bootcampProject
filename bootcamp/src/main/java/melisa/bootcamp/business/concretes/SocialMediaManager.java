package melisa.bootcamp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.SocialMediaService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.core.utilities.SuccessDataResult;
import melisa.bootcamp.core.utilities.SuccessResult;
import melisa.bootcamp.dataAccess.SocialMediaDao;
import melisa.bootcamp.entities.SocialMedia;

@Service
public class SocialMediaManager implements SocialMediaService{
	private SocialMediaDao socialMediaDao;
	
	@Autowired
	public SocialMediaManager(SocialMediaDao socialMediaDao) {
		super();
		this.socialMediaDao = socialMediaDao;
	}

	@Override
	public DataResult<List<SocialMedia>> getAll() {
		return new SuccessDataResult<List<SocialMedia>>(this.socialMediaDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(SocialMedia socialMedia) {
		this.socialMediaDao.save(socialMedia);
		return new SuccessResult("Sosyal Medya Kullanıcı Adı Eklendi.");
	}
	
}
