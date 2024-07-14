import java.util.Date;

public interface TaskInterface {
  void setName(String name);
  String getName();
  void setDescription(String description);
  String getDescription();
  void setDueDate(Date dueDate);
  Date getDueDate();
  void setStatus(Status status);
  Status getStatus();
  Priority getPriority();
}