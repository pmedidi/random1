import java.util.Date;

public class MediumPriority extends Task {
  public MediumPriority(String name, String description, Date dueDate, Status status) {
    super(name, description, dueDate, status, Priority.MEDIUM);
  }
}