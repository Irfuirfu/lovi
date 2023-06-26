package in.irfu.lovi;

import in.irfu.lovi.service.UserService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserService  userService = new UserService();
		
		userService.create();
		
		userService.getAll();
	}

}
