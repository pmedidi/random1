public class EmailSender {
    // Updated method
    /* 
    * (4) DIVERGENT CHANGE
    */
    public static void sendEmail(EmailDetails details){
        System.out.println("Email to: " + details.getRecipient());
        System.out.println("Subject: " + details.getSubject());
        System.out.println("Body: " + details.getBody());
    }
}
