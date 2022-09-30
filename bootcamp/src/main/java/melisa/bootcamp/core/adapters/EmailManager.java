package melisa.bootcamp.core.adapters;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.SuccessResult;
import melisa.bootcamp.entities.Employee;

public class EmailManager implements EmailService{

	@Override
	public SuccessResult sendMail(Employee employee) {
		return new SuccessResult("Kullanıcıya Mail Gönderildi.");
	}

}