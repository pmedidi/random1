import java.util.Date;

public class Project {
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;

    public Project(String name, String description, Date startDate, Date endDate) {
        this.name = new String(name);
        this.description = new String(description);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addTask(Task newTask) {
        // Functionality
    }

    public void removeTask(Task newTask) {
        // Functionality
    }

    public void addMember(Member newMember) {
        // Functionality
    }

    public void removeMember(Member newMember) {
        // Functionality
    }
}