package in.irfu.lovi.service;

import java.util.Set;
import in.irfu.lovi.dao.UserDAO;
import in.irfu.lovi.model.User;
import in.irfu.lovi.Validation.UserValidator;

public class UserService {
	public Set<User> getAll() {
		UserDAO userDao = new UserDAO();
		Set<User> userList = userDao.findAll();
		for (User user : userList) {
			System.out.println(user);
		}
		return userList;
	}

	public User findById(int userId) {
		UserDAO userDao = new UserDAO();
		return userDao.findById(userId);	
	}
	
	public void create(User newUser) throws Exception {
		UserValidator.Validate(newUser);
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
	}
	
	public void update(int id, User updatedUser) {
		UserDAO userDao = new UserDAO();
		userDao.update(id, updatedUser);	
	}
	
	public void delete(int userId) {
		UserDAO userDao = new UserDAO();
		userDao.delete(userId);
	}
	
	public User findByEmail(String email) {
		UserDAO userDao = new UserDAO();
		return userDao.findByEmail(email);
	}

}