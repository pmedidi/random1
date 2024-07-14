import java.util.Date;

public class HighPriorityTask extends Task {
    Member issuer;

    public HighPriorityTask(String title, String description, Date dueDate, boolean status, Member issuer) {
        super(title, description, dueDate, status, 10);
        this.issuer = issuer;
    }
}