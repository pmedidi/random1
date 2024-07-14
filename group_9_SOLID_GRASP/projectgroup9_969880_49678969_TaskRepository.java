package taskrepo;

import task.Task;
import itaskrepo.InterfaceTaskRepository;

import java.util.ArrayList;
import java.util.List;
public class TaskRepository implements InterfaceTaskRepository {
    private final List<Task> tasks = new ArrayList<>();

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void deleteTask(int taskId) {
        tasks.removeIf(task -> task.getId() == taskId);
    }

    @Override
    public Task findById(int id) {
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(tasks);
    }
}