import java.time.LocalDate;

/**
 * CS 2340 - Week 9 Activity
 *
 * Team 8 memebers:
 * - Anastasia Kotova
 * - Joseph Jabbour
 * - Ben Monnig
 * - Mekho Carter
 * - Haruto Tanaka 
 * - Bailey Francis
 * 
 * @author team8
 * @version 3/5/24
 */
public class Task extends Project {
    private String title;
    private String description;
    private LocalDate dueDate;
    private String status;
    private int priority;

    // Constructors
    public Task(String title, String description, String dueDate, int priority) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = "No Status";
        this.priority = priority;
    }

    // Methods
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}