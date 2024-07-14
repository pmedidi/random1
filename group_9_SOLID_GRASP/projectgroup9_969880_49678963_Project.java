package project;

import task.Task;
import teammember.TeamMember;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<Task> tasks = new ArrayList<>();
    private List<TeamMember> teamMembers = new ArrayList<>();

    // Constructor
    public Project(String name, String description, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Add a task to the project
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Remove a task from the project
    public void removeTask(Task task) {
        tasks.remove(task);
    }

    // Add a team member to the project
    public void addTeamMember(TeamMember user) {
        teamMembers.add(user);
    }

    // Remove a team member from the project
    public void removeTeamMember(TeamMember user) {
        teamMembers.remove(user);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    public List<TeamMember> getTeamMembers() {
        return new ArrayList<>(teamMembers);
    }
}
