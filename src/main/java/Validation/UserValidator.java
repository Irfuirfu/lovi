package Validation;

import in.irfu.lovi.model.User;

public class UserValidator {

	public static void Validate(User user) throws Exception {

		if (user == null) {
			throw new Exception("Invalid input");
		}
		
		if (user.getEmail() == null || " ".equals(user.getEmail().trim())) {
			throw new Exception("Email cannot be null or empty");
		}

	}

}