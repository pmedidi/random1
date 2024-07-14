public class TeamDesigner implements TeamMember {
    String name;
    String email;

    public TeamDesigner() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmailAddress(String email) {
        this.email = email;
    }

    public String getEmailAddress() {
        return email;
    }

    public void design() { } // implementation here

}
