public class TeamDeveloper implements TeamMember {
    String name;
    String email;

    public TeamDeveloper() {}

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

    public void develop() { } // implementation here

}
