public class HighPriorityTask extends Task {

    public HighPriorityTask(String title, String description, String dueDate, String status, int priority){
        super(title, description, dueDate, status, priority);
    }

    public void escalate();

}
