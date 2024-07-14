public abstract class Member implements OnProject {
    protected String name;
    protected String email;
    
    public Member(String name, String email) {
        this.name = new String(name);
        this.email = new String(email);
    }
}
