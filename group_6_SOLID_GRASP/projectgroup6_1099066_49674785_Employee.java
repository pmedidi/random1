import java.util.Date;

public class Employee extends TeamMember implements Responsibilities {
    private Manager manager;
    public Employee(String name, String email, Notes currNotes, Manager manager) {
        super(name, email, currNotes);
        this.manager = manager;
    }
    public void inMeeting() {
        Date today = new Date();
        Notes notes = new Notes("Meeting", "Attending a meeting", today, "Making reminder for meeting", "MEDIUM", "Make sure to RSVP", today);
        setNotes(notes);
    }
    public void reviewingProject() {
        Date today = new Date();
        Notes notes = new Notes("Project Review", "Reviewing my work", today, "Looking through my branch", "MEDIUM", "Make sure to create PR", today);
        setNotes(notes);
    }

    public void writingCode() {
        Date today = new Date();
        Notes notes = new Notes("Writing Code", "Making my code", today, "Creating logic", "HIGH", "Make sure to push to github", today);
        setNotes(notes);
    }
}
