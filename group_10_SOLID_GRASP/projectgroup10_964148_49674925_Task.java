import java.util.Date;

public abstract class Task {
    protected String title;
    protected String description;
    protected Date dueDate;
    protected boolean status;
    protected int priority;

    public Task(String title, String description, Date dueDate, boolean status, int priority) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
    }
}
