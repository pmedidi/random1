public interface TeamMember {

    default void joinProject(Project project) {
        project.addTeamMember(this);
    }

    default void leaveProject(Project project) {
        project.addTeamMember(this);
    }

    // mandates name attribute

    void setName(String name);

    String getName();

    // mandates email attribute

    void setEmailAddress(String email);

    String getEmailAddress();

}
