import java.time.LocalDate;

public class DesignerTask extends Task {
    private String designerDescription;

    public DesignerTask(String title, String description, LocalDate dueDate, String status, String priority,
                        String designerDescription) {
        super(title, description, dueDate, status, priority);
        this.designerDescription = designerDescription;
    }

}
