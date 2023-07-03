package in.irfu.lovi.service;

import in.irfu.lovi.dao.UserDAO;
import in.irfu.lovi.model.User;

public class UserService {

	public void getAll() {
		UserDAO userDao = new UserDAO();
		userDao.findAll();
	};

	public void create(User newUser) throws Exception{
		UserValidator.Validate(newUser);
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
	}


}
