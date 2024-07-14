import java.util.HashSet;
import java.util.Set;
public class Project {
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private Set<Task> tasks;
    private Set<TeamMember> teamMembers;

    public Project(String name, String description, String startDate, String endDate) {
        tasks = new HashSet<>();
        teamMembers = new HashSet<>();
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Task addTask(Task task) {
        tasks.add(task);
        return task;
    }
    public Task removeTask(Task task) {
        tasks.remove(task);
        return task;
    }
    public TeamMember addMember(TeamMember member){
        teamMembers.add(member);
        return member;
    }
    public TeamMember removeMember(TeamMember member){
        teamMembers.remove(member);
        return member;
    }

}
