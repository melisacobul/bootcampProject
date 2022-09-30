package melisa.bootcamp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.JobPositionServicce;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.core.utilities.SuccessDataResult;
import melisa.bootcamp.core.utilities.SuccessResult;
import melisa.bootcamp.dataAccess.JobPositionDao;
import melisa.bootcamp.entities.JobPosition;

@Service
public class JobPositionManager implements JobPositionServicce{
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Veriler Listlendi");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		jobPositionDao.save(jobPosition);
		return new SuccessResult("İş Pozisyonu Eklendi.");
	}

	@Override
	public Result delete(JobPosition jobPosition) {
		jobPositionDao.delete(jobPosition);
		return new SuccessResult("İş Pozisyonu Silindi.");
	}

}

