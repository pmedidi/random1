import java.util.ArrayList;
import java.util.Date;

public class Manager extends TeamMember implements Responsibilities {
    private ArrayList<Employee> employees;
    public Manager(String name, String email, Notes currNotes, ArrayList<Employee> employees) {
        super(name, email, currNotes);
        this.employees = employees;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
    public void inMeeting() {
        Date today = new Date();
        Notes notes = new Notes("Meeting", "Leading a meeting", today, "Scheduled meeting", "MEDIUM", "Make sure to invite team members", today);
        setNotes(notes);
    }
    public void reviewingProject() {
        Date today = new Date();
        Notes notes = new Notes("Project Review", "Reviewing team's work", today, "Looking through main branch", "MEDIUM", "Make sure to notify team members of problems", today);
        setNotes(notes);
    }

    public void writingCode() {
        Date today = new Date();
        Notes notes = new Notes("Writing Code", "Fixing team member's code", today, "Fixing errors", "HIGH", "Make sure to talk to team about the errors", today);
        setNotes(notes);
    }
}
