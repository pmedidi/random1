public class Email {
  private String customerEmail;
  private String subject;
  private String message;

  public Email(String customerEmail, String subject, String message) {
    this.customerEmail = customerEmail;
    this.subject = subject;
    this.message = message;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public String getSubject() {
    return subject;
  }

  public String getMessage() {
    return message;
  }
}