package melisa.bootcamp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.CompanyService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.core.utilities.SuccessDataResult;
import melisa.bootcamp.core.utilities.SuccessResult;
import melisa.bootcamp.dataAccess.CompanyDao;
import melisa.bootcamp.entities.Company;

@Service
public class CompanyManager implements CompanyService{
	private CompanyDao companyDao;
	
	@Autowired
	public CompanyManager(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}

	@Override
	public DataResult<List<Company>> getAllCompanies() {
		return new SuccessDataResult<List<Company>>(this.companyDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(Company company) {
		this.companyDao.save(company);
		return new SuccessResult("Kaydedildi.");
	}

	@Override
	public Result delete(Company company) {
		this.companyDao.delete(company);
		return new SuccessResult("Silindi.");
	}
	
}
