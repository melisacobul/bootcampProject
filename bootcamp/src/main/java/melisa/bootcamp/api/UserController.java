package melisa.bootcamp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.UserService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.entities.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getallusers")
	public DataResult<List<User>> getAllUsers(){
		return this.userService.getAllUsers();
	}
	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		return this.userService.add(user);
		
	}
	@PostMapping("/delete")
	public Result delete(@RequestBody User user) {
		return this.userService.delete(user);
		
	}
}
