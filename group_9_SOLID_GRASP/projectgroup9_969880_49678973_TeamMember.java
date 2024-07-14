package teammember;

import project.Project;

import java.util.HashSet;
import java.util.Set;

public class TeamMember {

    private String name;
    private String email;
    private Set<Project> projects = new HashSet<>();
    private String role;

    // Constructor
    public TeamMember(String name, String email) {
        this.name = name;
        this.email = email;
        this.role = "Member"; // Default role
    }

    // Join a project
    public void joinProject(Project project) {
        projects.add(project);
        project.addTeamMember(this); // Add this team member to the project's team
    }

    // Leave a project
    public void leaveProject(Project project) {
        projects.remove(project);
        project.removeTeamMember(this); // Remove this team member from the project's team
    }

    // Assign a role to the team member
    public void assignRole(String role) {
        this.role = role;
    }

    // Check if the team member is a project overseer
    public boolean isProjectOverseer() {
        return "Overseer".equals(this.role);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Project> getProjects() {
        return new HashSet<>(projects);
    }

    public String getRole() {
        return role;
    }
}
