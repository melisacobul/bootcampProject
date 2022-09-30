package melisa.bootcamp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.EmployerService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.core.utilities.SuccessDataResult;
import melisa.bootcamp.core.utilities.SuccessResult;
import melisa.bootcamp.dataAccess.EmployerDao;
import melisa.bootcamp.entities.Employer;

@Service
public class EmployerManager implements EmployerService{
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAllEmployers() {
		return new SuccessDataResult<List<Employer>>(employerDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(Employer employer) {
		
		
		employerDao.save(employer);
		return new SuccessResult("İş Veren Eklendi");
	}
	
	

	@Override
	public Result delete(Employer employer) {
		employerDao.delete(employer);
		return new SuccessResult("İş Veren Silindi");
	}

}

