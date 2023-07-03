package in.irfu.lovi.Validation;

import in.irfu.lovi.exception.ValidationException;
import in.irfu.lovi.model.User;
import in.irfu.lovi.util.StringUtil;

public class UserValidator {

	public static void validate(User user) throws ValidationException {

		if (user == null) {
			throw new ValidationException("Invalid user input");
		}
		StringUtil.rejectIfInvalidString(user.getEmail(),"Email");
		StringUtil.rejectIfInvalidString(user.getPassword(),"Password");
		StringUtil.rejectIfInvalidString(user.getFirstName(),"Firstname");
		
//		if (user.getEmail() == null || " ".equals(user.getEmail().trim())) {
//			throw new ValidationException("Email cannot be null or empty");
//		}

	}

}