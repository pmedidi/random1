public class Manager extends TeamMember {
    private TeamMember[] membersUnderManage;

    public Manager(String name, String emailAddress, TeamMember[] membersUnderManage) {
        super(name, emailAddress);
        this.membersUnderManage = membersUnderManage;
    }

    @Override
    public void work() {
        System.out.printf("%s is working as manager...\n" ,getName());
        manage();
    }

    public void manage() {
        System.out.printf("%s managing...\n" ,getName());
        for (TeamMember t : membersUnderManage) {
            if (t.getName() == null || t.getEmailAddress() == null) {
                System.out.println("Detected an abnormal team member.");
            }
        }
    }
}