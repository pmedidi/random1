public abstract class TeamMember implements Workable {
    private String name;
    private String emailAddress;

    public TeamMember(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
