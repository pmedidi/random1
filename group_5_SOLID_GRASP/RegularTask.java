import java.util.Date;

public class RegularTask extends Task {

    public RegularTask(String title, String description, Date dueDate, String status, int priority) {
        super(title, description, dueDate, status, priority);
    }

    @Override
    public void process(Workable worker) {
        worker.work();
        System.out.printf("%s (priority = %d) is processed by the assigned worker.\n", getTitle(), getPriority());
    }
}
