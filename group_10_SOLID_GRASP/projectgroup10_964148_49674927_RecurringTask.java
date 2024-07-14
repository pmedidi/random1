import java.util.Date;

public class RecurringTask extends Task {
    private int frequency;

    public RecurringTask(String title, String description, Date dueDate, boolean status, int priority, int frequency) {
        super(title, description, dueDate, status, priority);
        this.frequency = frequency;
    }
}
