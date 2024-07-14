package taskservice;

import java.util.List;
import task.Task;
import itaskrepo.InterfaceTaskRepository;

public class TaskService {
    private final InterfaceTaskRepository taskRepo;

    public TaskService(InterfaceTaskRepository taskRepo) {
        this.taskRepo = taskRepo;
    }

    public void addTask(Task task) {
        taskRepo.addTask(task);
    }

    public void deleteTask(int taskId) {
        taskRepo.deleteTask(taskId);
    }

    public Task getTaskById(int id) {
        return taskRepo.findById(id);
    }

    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }
}