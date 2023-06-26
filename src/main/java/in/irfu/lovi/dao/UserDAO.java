package in.irfu.lovi.dao;

import in.irfu.lovi.model.User;

public class UserDAO {
	public User[] findAll() {
		User[] userList = UserList.listOfUsers;
		return userList;
	}
	
	public void create(User newUser) {
		
		UserList.listOfUsers[0] = newUser;
	}
}
