package melisa.bootcamp.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.EmployeeCv;
import melisa.bootcamp.entities.EmployeeEducation;
import melisa.bootcamp.entities.EmployeeLanguage;
import melisa.bootcamp.entities.EmployeeSocialMedia;
import melisa.bootcamp.entities.EmployeeTechnology;
import melisa.bootcamp.entities.JobExperience;

@Service
public interface EmployeeCvService {
	DataResult<List<EmployeeCv>> getAll();
	DataResult<List<JobExperience>> getJobExperiences();
	DataResult<List<EmployeeEducation>> getEmployeeEducation();
	DataResult<List<EmployeeTechnology>> getAllTechnologies();
	DataResult<List<EmployeeLanguage>> getAllEmployeeLanguages();
	DataResult<List<EmployeeSocialMedia>> getAllSocialMedias();
	DataResult<List<EmployeeCv>> getById();
	
	Result addCv(EmployeeCv employeeCv);
	Result addExperience(JobExperience jobExperience);
	Result addEducation(EmployeeEducation employeeEducation);
	Result addTechnology(EmployeeTechnology employeeTechnology);
	Result addLanguage(EmployeeLanguage employeeLanguage);
	Result addSocialMedia(EmployeeSocialMedia employeeSocialMedia);
}
