package it.akademija;

import java.util.List;

import org.apache.catalina.User;

public interface UserDao {
	List<User> getUsers();

	void createUser(User user);

	void deleteUser(String username);
}