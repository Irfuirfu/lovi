package in.irfu.lovi;

import java.util.Set;

import org.junit.jupiter.api.Test;

import in.irfu.lovi.model.User;
import in.irfu.lovi.service.UserService;

public class TestGetAllUser {
	
	@Test
	public void getAllUser() {
		UserService userService = new UserService();
		Set<User> arr = userService.getAll();
		System.out.println(arr);
	}
	
	@Test
	public void getFindAll() {
		UserService userService = new UserService();
		User arr =  userService.findById(1);
	    System.out.println(arr);
	}
	
    @Test
	public void testUpdateUser() throws Exception {
		UserService userService = new UserService();
        User newUser = new User();
		newUser.setFirstName("irfan");
		newUser.setLastName("rahamathulla");
		userService.update(3, newUser);
	}
    
    @Test
   	public void testDeleteUser() {
   		UserService userService = new UserService();
        User newUser = new User();
   		userService.delete(1);
   	}
	

//	public void getFindByEmailId() {
//		UserService userService = new UserService();
//		User arr =  userService.findByEmail("irfan@gmail.com");
//	    System.out.println(arr);
//	}
}
