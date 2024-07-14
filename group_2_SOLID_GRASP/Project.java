import java.time.LocalDate;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Project {

    // attributes
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    private LinkedList<TeamMember> teamMembers;
    private LinkedList<Task> tasks;


    public Project(String name, String description, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teamMembers = new LinkedList<>();
        this.tasks = new LinkedList<>();
    }

    // add task to project
    public void addTask(Task task) {
        if (task != null) {
            tasks.add(task);
        } else {
            throw new IllegalArgumentException("Cannot pass in null task!");
        }
    }

    // remove task from project
    public void removeTask(Task task) {
        if (task != null && tasks.contains(task)) {
            tasks.remove(task);
        } else if (task == null) {
            throw new IllegalArgumentException("Task passed in cannot be null!");
        } else {
            throw new NoSuchElementException("Task not found!");
        }
    }

    // add team member
    public void addTeamMember(TeamMember teamMember) {
        if (teamMember != null) {
            teamMembers.add(teamMember);
        } else {
            throw new IllegalArgumentException("Cannot pass in null member!");
        }
    }

    // remove team member
    public void removeTeamMember(TeamMember teamMember) {
        if (teamMembers != null && teamMembers.contains(teamMember)) {
            teamMembers.remove(teamMember);
        } else if (teamMember == null) {
            throw new IllegalArgumentException("teamMember cannot be null!");
        } else {
            throw new NoSuchElementException("Team member not found!");
        }
    }

}
