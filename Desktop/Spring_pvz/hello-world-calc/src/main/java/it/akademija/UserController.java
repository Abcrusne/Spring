package it.akademija;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {

	@Autowired
	private final UserDao userDao; // pridedame DAO
	private final List<User> users = new CopyOnWriteArrayList<>();
	// InMemoryUserDao repo;

	@Autowired
	public UserController(UserDao userDao) {
		this.userDao = userDao;
	}

	/* Apdoros užklausas: GET /api/users */
	@RequestMapping(method = RequestMethod.GET)
	public List<User> getUsers() {
		return userDao.getUsers(); // skaitome per DAO
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void createUser(@RequestBody User user) {
		userDao.createUser(user);
		System.out.println("Created user: " + user.getFullName());
	}

	/* Apdoros užklausas: DELETE /api/users/<vartotojas> */
	@RequestMapping(path = "/{username}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable final String username) {
		userDao.deleteUser(username);
		System.out.println("Deleting user: " + username);
	}

}
