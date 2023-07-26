package in.irfu.lovi.interfaces;

import java.util.Set;

import in.irfu.lovi.model.Task;
public interface TaskInterface extends Base<Task>{
	public abstract	Set<Task> findAll();
	public abstract Task findById(int id);
}