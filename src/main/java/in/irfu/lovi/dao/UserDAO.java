package in.irfu.lovi.dao;

import in.irfu.lovi.model.User;

public class UserDAO {
	public User[] findAll() {
		User[] userList = UserList.listOfUsers;
		return userList;
	}
	
	public void create() {
		User newUser = new User();
		newUser.setId(12345);
		newUser.setFirstName("Irfu");
		newUser.setLastName("Kohli");
		newUser.setEmail("irfu@gmail.com");
		newUser.setPassword("adaikalam");
		newUser.setActive(true);
		
		UserList.listOfUsers[0] = newUser;
	}
}
