import java.time.LocalDate;

public class DeveloperTask extends Task {
    String techStack;
    String codeRequirements;

    public DeveloperTask(String title, String description, LocalDate dueDate, String status, String priority,
                         String techStack, String codeRequirements) {
        super(title, description, dueDate, status, priority);
        this.techStack = techStack;
        this.codeRequirements = codeRequirements;
    }
}
