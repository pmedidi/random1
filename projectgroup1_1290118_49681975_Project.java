import java.util.ArrayList;
import java.util.Date;

public class Project {
    private ArrayList<Task> tasks;
    private String name;
    private Date startDate;
    private Date endDate;
    private ArrayList<TeamMember> teamMembers;

    public Project(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public ArrayList<TeamMember> getTeamMembers() {
        return teamMembers;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void addTeamMember(TeamMember member) {
        teamMembers.add(member);
    }

    public void removeTeamMember(TeamMember member) {
        teamMembers.remove(member);
    }
}
