package recurringtask;

import task.Task;
import java.time.LocalDate;

public class RecurringTask extends Task {
    private LocalDate nextDueDate;
    private int recurrenceIntervalDays;

    public RecurringTask(int id, String title, String description, LocalDate nextDueDate, int recurrenceIntervalDays) {
        super(id, title, description);
        this.nextDueDate = nextDueDate;
        this.recurrenceIntervalDays = recurrenceIntervalDays;
    }

    public LocalDate getNextDueDate() {
        return nextDueDate;
    }

    public void setNextDueDate(LocalDate nextDueDate) {
        this.nextDueDate = nextDueDate;
    }

    public int getRecurrenceIntervalDays() {
        return recurrenceIntervalDays;
    }

    public void setRecurrenceIntervalDays(int recurrenceIntervalDays) {
        this.recurrenceIntervalDays = recurrenceIntervalDays;
    }

    @Override
    public void execute() {
        System.out.println("Executing recurring task: " + getTitle());
        // Logic specific to executing a recurring task
        // For example, rescheduling the next occurrence
        nextDueDate = nextDueDate.plusDays(recurrenceIntervalDays);
    }
}
