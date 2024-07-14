import java.util.Date;

public class HighPriority extends Task {
  public HighPriority(String name, String description, Date dueDate, Status status) {
    super(name, description, dueDate, status, Priority.HIGH);
  }
}