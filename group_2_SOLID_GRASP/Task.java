import java.time.LocalDate;

public class Task { // base task!
    private String title;
    private String description;
    private LocalDate dueDate;
    private String status;
    private String priority;

    public Task(String title, String description, LocalDate dueDate, String status, String priority) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
    }

    public Task() {
        this.title = "Default";
        this.description = "Default";
        this.dueDate = null;
        this.status = "Default";
        this.priority = "Default";
    }
}
