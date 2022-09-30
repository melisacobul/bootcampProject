package melisa.bootcamp.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.EmployeeSchoolDepartment;
import melisa.bootcamp.entities.School;
import melisa.bootcamp.entities.SchoolDegree;
import melisa.bootcamp.entities.SchoolDepartment;

@Service
public interface SchoolService {
	DataResult<List<School>> getAll();
	DataResult<List<SchoolDepartment>> getAllDepartments();
	DataResult<List<EmployeeSchoolDepartment>> getAllEmployeeSchoolDepartment();
	DataResult<List<SchoolDegree>> getAllSchoolDegrees();
	
	Result add(School school);
	Result addSchoolDepartment(SchoolDepartment schoolDepartment);
	Result addEmployeeSchoolDepartment(EmployeeSchoolDepartment employeeSchoolDepartment);
	Result addSchoolDegree(SchoolDegree schoolDegree);
	
}

