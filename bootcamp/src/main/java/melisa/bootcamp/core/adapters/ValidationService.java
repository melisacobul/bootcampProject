package melisa.bootcamp.core.adapters;

import melisa.bootcamp.entities.Employee;

public interface ValidationService {
	boolean checkIfRealPerson(Employee employee);
}
