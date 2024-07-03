public class TaskManager implements TeamMember {
    private String name;
    private String email;
    private Task task;

    public TaskManager(String name, String email, Task task) {
        this.name = name;
        this.email = email;
        this.task = task;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Task getTask() {
        return task;
    }
}
