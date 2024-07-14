public class GeneralMember extends Member {
    public GeneralMember(String name, String email) {
        super(name, email);
    }

    @Override
    public boolean joinProject() {
        // Functionality of join project specific to General Member
        return true;
    }

    @Override
    public boolean leaveProject() {
        // Functionality of leave project specific to General Member
        return true;
    }

    public void reqestPermission() {
        // Functionality for requesting permission
    }

}
