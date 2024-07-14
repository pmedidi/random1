package urgenttask;

import task.Task;

public class UrgentTask extends Task {
    private boolean isHighPriority;

    public UrgentTask(int id, String title, String description, boolean isHighPriority) {
        super(id, title, description);
        this.isHighPriority = isHighPriority;
    }

    public boolean isHighPriority() {
        return isHighPriority;
    }

    public void setHighPriority(boolean highPriority) {
        isHighPriority = highPriority;
    }

    @Override
    public void execute() {
        System.out.println("Executing urgent task: " + getTitle());
        // Logic specific to executing an urgent task
        if (isHighPriority) {
            System.out.println("This is a high priority task.");
        }
    }
}