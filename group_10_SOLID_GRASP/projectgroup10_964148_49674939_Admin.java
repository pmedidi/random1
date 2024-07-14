public class Admin extends Member {
    public Admin(String name, String email) {
        super(name, email);
    }

    @Override
    public boolean joinProject() {
        // Functionality of join project specific to admin
        return true;
    }

    @Override
    public boolean leaveProject() {
        // Functionality of leave project specific to admin
        return true;
    }

    public void givePermission() {
        // Functionality for giving permission
    }
}
