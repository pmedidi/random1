import java.time.LocalDate;
import java.util.ArrayList;

/**
 * CS 2340 - Week 9 Activity
 *
 * Team 8 memebers:
 * - Anastasia Kotova
 * - Joseph Jabbour
 * - Ben Monnig
 * - Mekho Carter
 * - Haruto Tanaka 
 * - Bailey Francis
 * 
 * @author team8
 * @version 3/5/24
 */
public class Project implements Notification {
    // Variables
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Task> tasks = new ArrayList<>();
    private ArrayList<TeamMember> teamMembers = new ArrayList<>();

    // Constructors
    public Project(String name, String description, String startDate, String endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Methods
    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void addTeamMember(TeamMember member) {
        teamMembers.add(member);
    }

    public void removeTeamMember(TeamMember member) {
        teamMembers.remove(member);
    }
}