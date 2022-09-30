package melisa.bootcamp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.JobInformationService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.core.utilities.SuccessDataResult;
import melisa.bootcamp.core.utilities.SuccessResult;
import melisa.bootcamp.dataAccess.JobInformationDao;
import melisa.bootcamp.entities.JobInformation;

@Service
public class JobInformationManager implements JobInformationService{
	private JobInformationDao jobInformationDao;
	
	@Autowired
	public JobInformationManager(JobInformationDao jobInformationDao) {
		super();
		this.jobInformationDao = jobInformationDao;
	}

	@Override
	public DataResult<List<JobInformation>> getAllJobInformations() {
		return new SuccessDataResult<List<JobInformation>>(this.jobInformationDao.findAll(),"Veriler Listelendi");
	}

	@Override
	public DataResult<List<JobInformation>> getById(int id) {
		return new SuccessDataResult<List<JobInformation>>(this.jobInformationDao.findById(id),"Veriler Listelendi");
	}

	@Override
	public Result add(JobInformation jobInformation) {
		jobInformationDao.save(jobInformation);
		return new SuccessResult(jobInformation.getJobTitle() + " Başlıklı İş Bilgisi Eklendi.");
	}

	@Override
	public Result delete(JobInformation jobInformation) {
		jobInformationDao.delete(jobInformation);
		return new SuccessResult(jobInformation.getJobTitle() + " Başlıklı İş Bilgisi Silindi.");
	}
	

}

