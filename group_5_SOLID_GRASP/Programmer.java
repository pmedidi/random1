public class Programmer extends TeamMember {

    public Programmer(String name, String emailAddress) {
        super(name, emailAddress);
    }

    @Override
    public void work() {
        System.out.printf("%s is programming...\n", getName());
    }
}