package it.akademija;

import java.util.List;

public interface UserDao {

	List<User> getUsers();

	void createUser(User user);

	void deleteUser(String username);
}