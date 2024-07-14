import java.util.Date;

public class Task implements TaskInterface {
  private String name;
  private String description;
  private Date dueDate;
  private Status status;
  private final Priority priority;
  
  public Task(String name, String description, Date dueDate, Status status, Priority priority) {
    this.name = name;
    this.description = description;
    this.dueDate = new Date(dueDate.getTime());
    this.status = status;
    this.priority = priority;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = new Date(dueDate.getTime());
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Status getStatus() {
    return status;
  }

  public Priority getPriority() {
    return priority;
  }
}