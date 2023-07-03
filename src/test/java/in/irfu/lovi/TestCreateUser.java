package in.irfu.lovi;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.irfu.lovi.exception.ValidationException;
import in.irfu.lovi.model.User;
import in.irfu.lovi.service.UserService;

public class TestCreateUser {
	@Test
	public void testCreateUserWithValidataInput() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setId(003);
		newUser.setFirstName("Irfan");
		newUser.setLastName("Kohli");
		newUser.setEmail("irfan@gmail.com");
		newUser.setPassword("adaikalam");
		newUser.setActive(true);
		assertDoesNotThrow(() -> {
			userService.create(newUser);
		});

	}

	@Test
	public void testCreatUserWithInvalidInput() {
		UserService userService = new UserService();
		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.create(null);
		});
		String exceptedMessage = "Invalid user input";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));

	}

	@Test
	public void testCreateUserWithEmailNull() {
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(1234);
		newUser.setFirstName("Irfan");
		newUser.setLastName("Boi");
		newUser.setEmail(null);
		newUser.setPassword("Aspirin2004");
		newUser.setActive(true);
		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.create(newUser);
		});
		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	@Test
	
	public void testCreateUserWithEmailEmpty() {
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(1234);
		newUser.setFirstName("Irfan");
		newUser.setLastName("Boi");
		newUser.setEmail("");
		newUser.setPassword("Aspirin2004");
		newUser.setActive(true);
		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.create(newUser);
		});
		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	@Test
	public void testCreateUserWithPasswordNull() {
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(1234);
		newUser.setFirstName("Irfan");
		newUser.setLastName("Boi");
		newUser.setEmail("irfan@gmail.com");
		newUser.setPassword(null);
		newUser.setActive(true);
		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.create(newUser);
		});
		String expectedMessage = "Password cannot be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	@Test
	public void testCreateUserWithPasswordEmpty() {
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(1234);
		newUser.setFirstName("Irfan");
		newUser.setLastName("Boi");
		newUser.setEmail("irfan@gmail.com");
		newUser.setPassword("");
		newUser.setActive(true);
		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.create(newUser);
		});
		String expectedMessage = "Password cannot be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	@Test
	public void testCreateUserWithFirstNameNull() {
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(1234);
		newUser.setFirstName(null);
		newUser.setLastName("Boi");
		newUser.setEmail("irfan@gmail.com");
		newUser.setPassword("Aspirin2004");
		newUser.setActive(true);
		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.create(newUser);
		});
		String expectedMessage = "Firstname cannot be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	@Test
	public void testCreateUserWithFirstnameEmpty() {
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(1234);
		newUser.setFirstName("");
		newUser.setLastName("Boi");
		newUser.setEmail("irfan@gmail.com");
		newUser.setPassword("asdfghjkl");
		newUser.setActive(true);
		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.create(newUser);
		});
		String expectedMessage = "Firstname cannot be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}






}
