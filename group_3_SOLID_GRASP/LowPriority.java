import java.util.Date;

public class LowPriority extends Task {
  public LowPriority(String name, String description, Date dueDate, Status status) {
    super(name, description, dueDate, status, Priority.LOW);
  }
}