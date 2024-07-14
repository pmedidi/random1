import java.util.Date;

public abstract class Task implements Processable {
    private String title;
    private String description;
    private Date dueDate;
    private String status;
    private int priority;

    public Task(String title, String description, Date dueDate, String status, int priority) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
