import java.util.Date;

public abstract class Task {
    private String title;
    private String description;
    private Date dueDate;
    private String status;
    private String priority;
    public Task(String title, String description, Date dueDate, String status, String priority) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
    }
}
