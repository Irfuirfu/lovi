package in.irfu.lovi;

import in.irfu.lovi.model.User;
import in.irfu.lovi.service.UserService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService;
		User newUser;
		
		
		try {
			UserService  userService1 = new UserService();
			
			User newUser1 = new User();
			newUser1.setId(003);
			newUser1.setFirstName("Irfan");
			newUser1.setLastName("Kohli");
			newUser1.setEmail("irfan@gmail.com");
			newUser1.setPassword("adaikalam");
			newUser1.setActive(true);
			
			userService1.create(newUser1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//userService1.getAll();
	}

}
