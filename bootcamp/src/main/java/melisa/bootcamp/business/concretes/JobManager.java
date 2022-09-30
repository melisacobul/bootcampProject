package melisa.bootcamp.business.concretes;

import java.util.List;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.JobService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.core.utilities.ErrorResult;
import melisa.bootcamp.core.utilities.SuccessDataResult;
import melisa.bootcamp.core.utilities.SuccessResult;
import melisa.bootcamp.dataAccess.JobDao;
import melisa.bootcamp.entities.Job;
import lombok.var;

@Service
public class JobManager implements JobService{
	
	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public DataResult<List<Job>> getAllJobs() {
		return new SuccessDataResult<List<Job>>(jobDao.findAll(),"Veriler Listelendi");
	}

	@Override
	public Result add(Job job) {
		var jobNameControl = checkJobName(job);
		if(!jobNameControl.isSuccess()) return new ErrorResult(jobNameControl.getMessage());
		jobDao.save(job);
		return new SuccessResult("İş Pozisyonu Eklendi");
	}

	private Result checkJobName(Job job) {
		for (Job jobs : jobDao.findAll()) {
			if(job.getDepartmentName().equals(jobs.getDepartmentName())) return new ErrorResult("Aynı İsimde İş mevcut");
		}
		return new SuccessResult("İş Eklendi");
	}

	@Override
	public Result Delete(Job job) {
		jobDao.delete(job);
		return new SuccessResult(job.getDepartmentName() + " İsimli İş Pozizyonu Silindi.");
	}
}
