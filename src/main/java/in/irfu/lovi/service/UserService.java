package in.irfu.lovi.service;

import java.util.Iterator;
import java.util.Set;
import in.irfu.lovi.Validation.UserValidator;
import in.irfu.lovi.dao.UserDAO;
import in.irfu.lovi.exception.ValidationException;
import in.irfu.lovi.model.User;

public class UserService {
	public Set<User> getAll() {
		UserDAO userDao = new UserDAO();
		Set<User> userList = userDao.findAll();
		Iterator<User> iterator = userList.iterator();
		
		while (iterator.hasNext()) {
			User user = iterator.next();
			System.out.println(user);
			//System.out.println(count++);
		}
		return userList;
	}
	
	public void create(User newUser) throws ValidationException {
		
		UserValidator.validate(newUser);
		
		UserDAO userDao = new UserDAO();
		
		userDao.create(newUser);
	}

	public void update(int id, User newUpdate) throws Exception {
		
		UserValidator.validate(newUpdate);
		
		UserDAO userDAO = new UserDAO();
		
		userDAO.update(1, newUpdate);
	}
	
//
	public void delete(int id) {
		UserDAO userDao = new UserDAO();
		userDao.delete(id);
	}
	
	public User findById(int id) {
		
		UserDAO userDao = new UserDAO();
		User user = userDao.findById(id);
		return user;
		
	}






}