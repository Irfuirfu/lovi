package in.irfu.lovi.Validation;

import in.irfu.lovi.exception.ValidationException;
import in.irfu.lovi.model.User;
import in.irfu.lovi.util.StringUtil;

public class UserValidator {

	public static void validate(User user) throws ValidationException {

		if (user == null) {
			throw new ValidationException("Invalid User input");
		}
		
//		if (user.getEmail() == null || ("").equals(user.getEmail().trim())) {
//			throw new ValidationException("Email cannot be null or empty");
//		}
		StringUtil.rejectIfInvalidString(user.getEmail(), "email");
		
//		if (user.getPassword() == null || ("").equals(user.getEmail().trim())) {
//			throw new ValidationException("Password cannot be null or empty");
//		}
		StringUtil.rejectIfInvalidString(user.getPassword() , "password");
		
//		if (user.getFirstName() == null || ("").equals(user.getEmail().trim())) {
//			throw new ValidationException("Firstname cannot be null or empty");
//		}
		StringUtil.rejectIfInvalidString(user.getFirstName() , "firstName");

	}
}
