package in.irfu.lovi.dao;

import in.irfu.lovi.model.User;

public class UserDAO {
	public User[] findAll() {
		User[] userList = UserList.listOfUsers;
		return userList;
	}
	
	public void create(User newUser) {
	
		
		User[] arr = UserList.listOfUsers;
		   for(int i=0; i<arr.length; i++) {
			  User user = arr[i];
			  if(user == null) {
				  arr[i] = newUser;
				 break;
			  }
			
		}
	}
	/**
	 *i
	 * @param id
	 * @param updateUser
	 */
	public void update(int id, User updateUser) {
		User[] arr = UserList.listOfUsers;
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			//if (user == null) {
				//continue;
			//}
			if (user.getId() == id) {
//				user.setFirstName("Irfan");
				arr[i].setFirstName(updateUser.getFirstName());
				break;
			}
		}
	}
	
	public User findById(int userId) {
		User[] arr = UserList.listOfUsers;
		User userMatch = null;
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if (user == null) {
				continue;
			}
			if (user.getId() == userId) {
				userMatch = user;
				break;
			}
		}
		return userMatch;
	}
}
