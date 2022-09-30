package melisa.bootcamp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.UserService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.core.utilities.SuccessDataResult;
import melisa.bootcamp.core.utilities.SuccessResult;
import melisa.bootcamp.dataAccess.UserDao;
import melisa.bootcamp.entities.User;

@Service
public class UserManager implements UserService{
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAllUsers() {
		return new SuccessDataResult<List<User>>(userDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(User user) {
		userDao.save(user);
		return new SuccessResult("Kullanıcı Eklendi");
	}

	@Override
	public Result delete(User user) {
		userDao.delete(user);
		return new SuccessResult("Kişi Silindi.");
	}

}
