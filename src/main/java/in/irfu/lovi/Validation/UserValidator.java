package in.irfu.lovi.Validation;

import java.lang.Exception;
import in.irfu.lovi.exception.ValidationException;
import in.irfu.lovi.model.User;
import in.irfu.lovi.util.StringUtil;

public class UserValidator {
	
    public static void Validate(User user) throws Exception{
    	if(user == null) {
    		throw new ValidationException("Invalid User Input");
    	}
//    	if(user.getEmail() == null || "".equals(user.getEmail().trim())) {
//    		throw new ValidationException("Email cannot be null or empty");
//    	}	
//    	if(user.getPassword() == null || "".equals(user.getPassword().trim())) {
//    		throw new ValidationException("Password cannot be null or empty");
//    	}
//    	if(user.getFirstName() == null || "".equals(user.getFirstName().trim())) {
//    		throw new ValidationException("FirstName cannot be null or empty");
//    	}
    	StringUtil.rejectIfInvalidString(user.getEmail(), "Email");
    	StringUtil.rejectIfInvalidString(user.getPassword(), "Password");
    	StringUtil.rejectIfInvalidString(user.getFirstName(), "FirstName");

    }
    
    
    
	
}