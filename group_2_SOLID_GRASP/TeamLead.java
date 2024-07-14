import java.time.LocalDate;

public class TeamLead implements TeamMember {
    String name;
    String email;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmailAddress(String email) {
        this.email = email;
    }

    public String getEmailAddress() {
        return email;
    }

    public Project startProject(String name, String description, LocalDate startDate, LocalDate endDate) {
        return new Project(name, description, startDate, endDate);
    }

    public Task createTask(String title, String description, LocalDate dueDate, String status, String priority) {
        return new Task(title, description, dueDate, status, priority);
    }

}
