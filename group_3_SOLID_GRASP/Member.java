public class Member implements MemberInterface {
  private String name;
  private String email;
  private final Role role;

  public Member(String name, String email, Role role) {
    this.name = name;
    this.email = email;
    this.role = role;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public Role getRole() {
    return role;
  }
}