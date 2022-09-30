package melisa.bootcamp.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.User;

public interface UserService {
	DataResult<List<User>> getAllUsers();
	Result add(User user);
	Result delete(User user);
}
