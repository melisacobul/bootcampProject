package melisa.bootcamp.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.CoverLetterService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.core.utilities.SuccessDataResult;
import melisa.bootcamp.core.utilities.SuccessResult;
import melisa.bootcamp.dataAccess.CoverLetterDao;
import melisa.bootcamp.entities.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService{
	private CoverLetterDao coverLetterDao;
	
	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao = coverLetterDao;
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		return new SuccessDataResult(this.coverLetterDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("Ön Yazı Eklendi.");
	}

	@Override
	public Result delete(CoverLetter coverLetter) {
		this.coverLetterDao.delete(coverLetter);
		return new SuccessResult("Ön Yazı Silindi.");
	}

}