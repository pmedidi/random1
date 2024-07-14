import java.util.Date;
import java.util.Calendar;

public class RecurringTask extends Task {
  public RecurringTask(String name, String description, Date dueDate, Status status, Priority priority) {
    super(name, description, dueDate, status, priority);
  }

  public void setStatus(Status status) {
    super.setStatus(status);
    if (status == Status.DONE) {
      Calendar c = Calendar.getInstance();
      c.setTime(getDueDate());
      c.add(Calendar.DATE, 7);
      setDueDate(new Date(c.getTime().getTime()));
      super.setStatus(Status.TODO);
    }
  }
}