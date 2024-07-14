package itaskrepo;

import task.Task;

import java.util.List;

public interface InterfaceTaskRepository {
    void addTask(Task task);
    void deleteTask(int taskId);
    Task findById(int id);
    List<Task> findAll();
}