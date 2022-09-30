package melisa.bootcamp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.SchoolService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.core.utilities.SuccessDataResult;
import melisa.bootcamp.core.utilities.SuccessResult;
import melisa.bootcamp.dataAccess.EmployeeSchoolDepartmentDao;
import melisa.bootcamp.dataAccess.SchoolDao;
import melisa.bootcamp.dataAccess.SchoolDegreeDao;
import melisa.bootcamp.dataAccess.SchoolDepartmentDao;
import melisa.bootcamp.entities.EmployeeSchoolDepartment;
import melisa.bootcamp.entities.School;
import melisa.bootcamp.entities.SchoolDegree;
import melisa.bootcamp.entities.SchoolDepartment;

@Service
public class SchoolManager implements SchoolService{
	private SchoolDao schoolDao;
	private EmployeeSchoolDepartmentDao employeeSchoolDepartment;
	private SchoolDepartmentDao schoolDepartmentDao;
	private SchoolDegreeDao schoolDegreeDao;
	
	
	@Autowired
	public SchoolManager(SchoolDao schoolDao, EmployeeSchoolDepartmentDao employeeSchoolDepartment,
			SchoolDepartmentDao schoolDepartmentDao, SchoolDegreeDao schoolDegreeDao) {
		super();
		this.schoolDao = schoolDao;
		this.employeeSchoolDepartment = employeeSchoolDepartment;
		this.schoolDepartmentDao = schoolDepartmentDao;
		this.schoolDegreeDao = schoolDegreeDao;
	}

	@Override
	public DataResult<List<School>> getAll() {
		return new SuccessDataResult<List<School>>(this.schoolDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("Okul Bilgisi Eklendi.");
	}

	@Override
	public DataResult<List<SchoolDepartment>> getAllDepartments() {
		return new SuccessDataResult<List<SchoolDepartment>>(this.schoolDepartmentDao.findAll(),"Veriler Listelendi");
	}

	@Override
	public DataResult<List<EmployeeSchoolDepartment>> getAllEmployeeSchoolDepartment() {
		return new SuccessDataResult<List<EmployeeSchoolDepartment>>(this.employeeSchoolDepartment.findAll(),"Veriler Listelendi");
	}

	@Override
	public DataResult<List<SchoolDegree>> getAllSchoolDegrees() {
		return new SuccessDataResult<List<SchoolDegree>>(this.schoolDegreeDao.findAll(),"Veriler Listelendi");
	}

	@Override
	public Result addSchoolDepartment(SchoolDepartment schoolDepartment) {
		this.schoolDepartmentDao.save(schoolDepartment);
		return new SuccessResult("Okul Bölümü Eklendi.");
	}

	@Override
	public Result addEmployeeSchoolDepartment(EmployeeSchoolDepartment employeeSchoolDepartment) {
		this.employeeSchoolDepartment.save(employeeSchoolDepartment);
		return new SuccessResult("Okul Bölümü Eklendi.");
	}

	@Override
	public Result addSchoolDegree(SchoolDegree schoolDegree) {
		this.schoolDegreeDao.save(schoolDegree);
		return new SuccessResult("Okul Derecesi Eklendi.");
	}

}
