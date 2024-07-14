import java.util.Date;

public class Notes extends Task{
    private String notes;
    private Date taken;
    public Notes(String title, String description, Date dueDate, String status, String priority, String notes, Date taken) {
        super(title, description, dueDate, status, priority);
        this.notes = notes;
        this.taken = taken;
    }
}
