package in.irfu.lovi.service;
import in.irfu.lovi.dao.UserDAO;
import in.irfu.lovi.model.User;

public class UserService {
    
	public User[] getAll() {
	 
	UserDAO userDao = new UserDAO();
	User[] userList = userDao.findAll();
	
	for(int i = 0; i < userList.length; i++) {
		System.out.println(userList[i]);
	}
	
	return userList;
 }
	public void create() {
		User newUser = new User();
		newUser.setId(003);
		newUser.setFirstName("Irfan");
		newUser.setLastName("Kohli");
		newUser.setEmail("irfan@gmail.com");
		newUser.setPassword("adaikalam");
		newUser.setActive(true);
		
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
	}
}
