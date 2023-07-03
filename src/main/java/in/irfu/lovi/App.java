package in.irfu.lovi;

import in.irfu.lovi.model.User;
import in.irfu.lovi.service.UserService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserService  userService = new UserService();
		
		User newUser = new User();
		newUser.setId(003);
		newUser.setFirstName("Irfan");
		newUser.setLastName("Kohli");
		newUser.setEmail("irfan@gmail.com");
		newUser.setPassword("adaikalam");
		newUser.setActive(true);
		
		userService.create(newUser);
		userService.getAll();
	}

}
