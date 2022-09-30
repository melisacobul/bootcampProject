package melisa.bootcamp.core.adapters;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.entities.Employee;

public interface EmailService {
	Result sendMail(Employee employee);
}