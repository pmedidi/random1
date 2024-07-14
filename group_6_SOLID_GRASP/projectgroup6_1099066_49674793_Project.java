import java.util.ArrayList;
import java.util.Collection;

public class Project {
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private ArrayList<Notes> notes;
    private ArrayList<TeamMember> members;
    public Project(String name, String description, String startDate, String endDate, ArrayList<Notes> notes, ArrayList<TeamMember> members) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.notes = notes;
        this.members = members;
    }
    public void addTask(Notes notes) {
        this.notes.add(notes);
    }
    public void removeTask(Notes notes) {
        this.notes.remove(notes);
    }
    public void addMember(TeamMember member) {
        members.add(member);
    }
    public void removeMember(TeamMember member) {
        members.remove(member);
    }
}
