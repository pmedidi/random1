
public class EmailSender {
    public static void sendEmail(Email email){
        System.out.println("Email to: " + email.getCustomerEmail());
        System.out.println("Subject: " + email.getSubject());
        System.out.println("Body: " + email.getMessage());
    }
}
