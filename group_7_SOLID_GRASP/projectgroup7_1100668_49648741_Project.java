import java.util.ArrayList;

public class Project {
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private ArrayList<Task> tasks;
    private ArrayList<TeamMember> members;

    public Project(String name, String description, String startDate, String endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        tasks = new ArrayList<Task>();
        members = new ArrayList<TeamMember>();
    }

    public void addTask(Task someTask) {
        tasks.add(someTask);
    }

    public Task removeTask(String taskName) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equals(taskName)) {
                tasks.remove(i);
            }
        }
    }

    public void addTeamMember(TeamMember someMember) {
        members.add(someMember);
    }

    public TeamMember removeTeamMember(String memberName) {
        for (int i = 0; i < members.size(); i++) {
            if (memberName.get(i).equals(memberName)) {
                members.remove(i);
            }
        }
    }
}
