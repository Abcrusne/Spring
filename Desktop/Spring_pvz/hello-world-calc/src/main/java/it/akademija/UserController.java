package it.akademija;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(value = "user")
@RequestMapping(value = "/api/users")
public class UserController {

	private final UserDao userDao; // pridedame DAO

	@Autowired
	public UserController(UserDao userDao) {
		this.userDao = userDao;
	}

	/* Apdoros užklausas: GET /api/users */
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get users", notes = "Returns registered users")
	public List<User> getUsers() {
		return userDao.getUsers(); // skaitome per DAO
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Create user", notes = "Creates users with data")
	public void createUser(
			@ApiParam(value = "User Data", required = true) @Valid @RequestBody final CreateUserCommand cmd) {
		User user = new User(cmd.getUsername(), cmd.getFirstName(), cmd.getLastName(), cmd.getEmail());
		userDao.createUser(user);
		System.out.println("Created user with username: " + user.getUsername());
	}

	/* Apdoros užklausas: DELETE /api/users/<vartotojas> */
	@RequestMapping(path = "/{username}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable final String username) {
		userDao.deleteUser(username);
		System.out.println("Deleting user: " + username);
	}

}
