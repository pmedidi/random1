public abstract class TeamMember {
    private String name;
    private String email;
    private Notes currNotes;
    public TeamMember(String name, String email, Notes currNotes) {
        this.name = name;
        this.email = email;
        this.currNotes = currNotes;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setNotes(Notes note) {
        currNotes = note;
    }
}
