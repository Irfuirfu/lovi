package in.lovi;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import in.irfu.lovi.model.User;
import in.irfu.lovi.service.UserService;


public class TestCreateUser {
@Test	
 public void testCreateUserWithValidataInput() {
	UserService  userService = new UserService();
	
	User newUser = new User();
	newUser.setId(003);
	newUser.setFirstName("Irfan");
	newUser.setLastName("Kohli");
	newUser.setEmail("irfan@gmail.com");
	newUser.setPassword("adaikalam");
	newUser.setActive(true);
	assertDoesNotThrow(()->{
		userService.create(newUser);
	});
	
}
@Test
public void testCreatUserWithInvalidInput() {
	UserService  userService = new UserService();
	Exception exception = assertThrows(Exception.class,()->{
		userService.create(null);
	});
	String exceptedMessage = "Invalid User Input";
	String actualMessage = exception.getMessage();
	
	assertTrue(expectedMessage.equals(actualMessage));
	
}
}
