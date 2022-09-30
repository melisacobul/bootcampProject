package melisa.bootcamp.business.concretes;

import java.util.List;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.EmployeeCvService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.core.utilities.SuccessDataResult;
import melisa.bootcamp.core.utilities.SuccessResult;
import melisa.bootcamp.dataAccess.EmployeeCvDao;
import melisa.bootcamp.dataAccess.EmployeeEducationDao;
import melisa.bootcamp.dataAccess.EmployeeLanguageDao;
import melisa.bootcamp.dataAccess.EmployeeSocialMediaDao;
import melisa.bootcamp.dataAccess.EmployeeTechnologyDao;
import melisa.bootcamp.dataAccess.JobExperienceDao;
import melisa.bootcamp.entities.EmployeeCv;
import melisa.bootcamp.entities.EmployeeEducation;
import melisa.bootcamp.entities.EmployeeLanguage;
import melisa.bootcamp.entities.EmployeeSocialMedia;
import melisa.bootcamp.entities.EmployeeTechnology;
import melisa.bootcamp.entities.JobExperience;

@Service
public class EmployeeCvManager implements EmployeeCvService{
	private EmployeeCvDao employeeCvDao;
	private JobExperienceDao jobExperienceDao;
	private EmployeeEducationDao employeeEducationDao;
	private EmployeeTechnologyDao employeeTechnologyDao;
	private EmployeeLanguageDao employeeLanguageDao;
	private EmployeeSocialMediaDao employeeSocialMediaDao;
	
	@Autowired
	public EmployeeCvManager(EmployeeCvDao employeeCvDao, JobExperienceDao jobExperienceDao,
			EmployeeEducationDao employeeEducationDao, EmployeeTechnologyDao employeeTechnologyDao,
			EmployeeLanguageDao employeeLanguageDao, EmployeeSocialMediaDao employeeSocialMediaDao) {
		super();
		this.employeeCvDao = employeeCvDao;
		this.jobExperienceDao = jobExperienceDao;
		this.employeeEducationDao = employeeEducationDao;
		this.employeeTechnologyDao = employeeTechnologyDao;
		this.employeeLanguageDao = employeeLanguageDao;
		this.employeeSocialMediaDao = employeeSocialMediaDao;
	}

	@Override
	public DataResult<List<EmployeeCv>> getAll() {
		return new SuccessDataResult<List<EmployeeCv>>(this.employeeCvDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public DataResult<List<JobExperience>> getJobExperiences() {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public DataResult<List<EmployeeEducation>> getEmployeeEducation() {
		return new SuccessDataResult<List<EmployeeEducation>>(this.employeeEducationDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public DataResult<List<EmployeeTechnology>> getAllTechnologies() {
		return new SuccessDataResult<List<EmployeeTechnology>>(this.employeeTechnologyDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public DataResult<List<EmployeeLanguage>> getAllEmployeeLanguages() {
		return new SuccessDataResult<List<EmployeeLanguage>>(this.employeeLanguageDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public DataResult<List<EmployeeSocialMedia>> getAllSocialMedias() {
		return new SuccessDataResult<List<EmployeeSocialMedia>>(this.employeeSocialMediaDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public DataResult<List<EmployeeCv>> getById() {
		return new SuccessDataResult<List<EmployeeCv>>(this.employeeCvDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result addCv(EmployeeCv employeeCv) {
		this.employeeCvDao.save(employeeCv);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result addExperience(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result addEducation(EmployeeEducation employeeEducation) {
		this.employeeEducationDao.save(employeeEducation);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result addTechnology(EmployeeTechnology employeeTechnology) {
		this.employeeTechnologyDao.save(employeeTechnology);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result addLanguage(EmployeeLanguage employeeLanguage) {
		this.employeeLanguageDao.save(employeeLanguage);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result addSocialMedia(EmployeeSocialMedia employeeSocialMedia) {
		this.employeeSocialMediaDao.save(employeeSocialMedia);
		return new SuccessResult("Eklendi.");
	}
}
