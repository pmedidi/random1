import java.util.Date;

public class RecurringTask extends Task {
    private int remainingRecurrenceTime;

    public RecurringTask(String title, String description, Date dueDate, String status, int priority, int remainingRecurrenceTime) {
        super(title, description, dueDate, status, priority);
        this.remainingRecurrenceTime = remainingRecurrenceTime;
    }

    @Override
    public void process(Workable worker) {
        worker.work();
        while (remainingRecurrenceTime > 0) {
            System.out.printf("Recurrent task \"%s\" (priority = %d) is processed by the assigned worker, " +
                            "%d more iterations to go.\n",
                    getTitle(), getPriority(), remainingRecurrenceTime);
            remainingRecurrenceTime--;
        }
    }
}
