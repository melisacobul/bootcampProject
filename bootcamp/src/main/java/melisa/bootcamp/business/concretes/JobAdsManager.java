package melisa.bootcamp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.JobAdsService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.core.utilities.SuccessDataResult;
import melisa.bootcamp.core.utilities.SuccessResult;
import melisa.bootcamp.dataAccess.JobAdsDao;
import melisa.bootcamp.entities.JobsAds;
import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

@Service
public class JobAdsManager implements JobAdsService{
	private JobAdsDao jobAdsDao;
	
	@Autowired
	public JobAdsManager(JobAdsDao jobAdsDao) {
		super();
		this.jobAdsDao = jobAdsDao;
	}

	@Override
	public DataResult<List<JobsAds>> getAllJobAds() {
		return new SuccessDataResult<List<JobAds>>(this.jobAdsDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(JobsAds jobads) {
		jobAdsDao.save(jobads);
		return new SuccessResult("İş İlanı Eklendi");
	}

	@Override
	public Result delete(JobsAds jobads) {
		jobAdsDao.delete(jobads);
		return new SuccessResult("Başlıklı İş İlanı Silindi.");
	}

	@Override
	public DataResult<List<JobsAds>> getAllSortedByActive() {
		return new SuccessDataResult<List<JobAds>>(this.jobAdsDao.getByIsActive());
	}

	@Override
	public DataResult<List<JobsAds>> getAllSortedByDate() {
		Sort sort = Sort.by(Sort.Direction.ASC,"applicationDeadline");
		return new SuccessDataResult<List<JobAds>>(this.jobAdsDao.findAll(sort));
	}

	@Override
	public DataResult<List<JobsAds>> getById(int id) {
		return new SuccessDataResult<List<JobAds>>(this.jobAdsDao.findById(id),"Veriler Listelendi.");
	}

	

	

}
