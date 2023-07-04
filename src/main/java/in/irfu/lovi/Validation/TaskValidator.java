package in.irfu.lovi.Validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import in.irfu.lovi.exception.ValidationException;
import in.irfu.lovi.model.Task;
import in.irfu.lovi.util.StringUtil;

public class TaskValidator {

	public static void validate(Task task) throws ValidationException {

		if (task == null) {
			throw new ValidationException("Invalid task input");
		}
		// if (task.getEmail() == null || "".equals(task.getEmail().trim())) {
		// throw new ValidationException("Email can't be null or empty");
		// }
		StringUtil.rejectIfInvalidString(task.getName(), "Name");
		// if (task.getPassword() == null || "".equals(task.getPassword().trim())) {
		// throw new ValidationException("Password can't be null or empty");
		// }
		StringUtil.rejectIfInvalidString(task.getDueDate(), "DueDate");
		
		String date = task.getDueDate();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dueDate = LocalDate.parse(date, formatter);
        LocalDate currentDate = LocalDate.now();
		if(dueDate.equals(currentDate) || dueDate.isBefore(currentDate)) {
			throw new ValidationException("Due date should be in future");
		}
	}

}