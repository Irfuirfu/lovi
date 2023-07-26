package in.irfu.lovi;

import java.util.Set;
import org.junit.jupiter.api.Test;

import in.irfu.lovi.model.Task;
import in.irfu.lovi.model.User;
import in.irfu.lovi.service.TaskService;
import in.irfu.lovi.service.UserService;

public class TestGetAllTask {
	@Test
	public void getAllTask() {
		TaskService taskService = new TaskService();
		Set<Task> arr = taskService.getAll();
		System.out.println(arr);
	}

	@Test
	public void getFindAll() {
		UserService userService = new UserService();
		User arr = userService.findById(1);
		System.out.println(arr);
	}

	@Test
	public void testUpdateTask() throws Exception {
		  TaskService taskService = new TaskService();
		    Task newTask = new Task();
		    newTask.setName("Completed Task");
		    newTask.setDueDate("2023-07-29");
		    taskService.update(3, newTask);
	}
	
	  @Test
	   	public void testDeleteTask() {
	   		TaskService taskService = new TaskService();
	        Task newTask = new Task();
	   		taskService.delete(2);
	   	}

}