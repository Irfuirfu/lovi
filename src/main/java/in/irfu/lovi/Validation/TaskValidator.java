package in.irfu.lovi.Validation;

import java.lang.Exception;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

import in.irfu.lovi.exception.ValidationException;
import in.irfu.lovi.model.Task;
import in.irfu.lovi.util.StringUtil;

public class TaskValidator {
  
    public static void Validate(Task task) throws Exception {
        if (task == null) {
            throw new ValidationException("Invalid Task Input");
        }
        
        StringUtil.rejectIfInvalidString(task.getName(), "Name");
        StringUtil.rejectIfInvalidString(task.getDueDate(), "DueDate");
        
        String date = task.getDueDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dueDate = LocalDate.parse(date, formatter);
        
        LocalDate.parse(date,
                DateTimeFormatter.ofPattern("uuuu-MM-dd").withResolverStyle(ResolverStyle.STRICT));
        
        LocalDate currentDate = LocalDate.now();
        if (dueDate.equals(currentDate) || dueDate.isBefore(currentDate)) {
            throw new ValidationException("Due date should be in the future");
        }
        
       
    }
}