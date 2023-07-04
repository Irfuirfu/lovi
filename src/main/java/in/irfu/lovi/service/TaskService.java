package in.irfu.lovi.service;
import in.irfu.lovi.dao.TaskDAO;
import in.irfu.lovi.model.Task;
import in.irfu.lovi.Validation.TaskValidator;

	public class TaskService {
		public Task[] getAll() {

			TaskDAO taskDao = new TaskDAO();

			Task[] taskList = taskDao.findAll();

			for (int i = 0; i < taskList.length; i++) {
				System.out.println(taskList[i]);
			}
			return taskList;
		}

		public void create(Task newTask) throws Exception {
			TaskValidator.validate(newTask);
			TaskDAO taskDao = new TaskDAO();
			taskDao.create(newTask);

		}

		public void update(int id, Task updateTask) {
			// Task updateTask = new Task();
			TaskDAO taskDao = new TaskDAO();
			taskDao.update(001, updateTask);
		}

		public void delete() {
			Task deleteTask = new Task();
			TaskDAO taskDao = new TaskDAO();
			taskDao.delete(001);
		}

		public Task findById(int id) {
			TaskDAO taskDao = new TaskDAO();
			Task task = taskDao.findById(id);
			return task;
		}
	}

