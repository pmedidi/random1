public class Email {
    private String subject;
    private String message;
    private String customerEmail;

    public Email(String customerEmail, String subject, String message) {
        this.customerEmail = customerEmail;
        this.subject = subject;
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
