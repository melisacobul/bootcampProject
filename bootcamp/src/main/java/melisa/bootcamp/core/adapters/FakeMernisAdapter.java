package melisa.bootcamp.core.adapters;

import org.springframework.stereotype.Service;

import melisa.bootcamp.entities.Employee;

@Service
public class FakeMernisAdapter implements ValidationService{

	@Override
	public boolean checkIfRealPerson(Employee employee) {
		if(employee.getEmployeeTckn().length() != 11) {
			return false;
		}
		else {
			return true;
		}
	}

}
