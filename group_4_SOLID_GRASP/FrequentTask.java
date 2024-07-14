public class FrequentTask extends Task{

    private int frequency;


    public FrequentTask(String title, String description, String dueDate, String status, int priority, int frequency){
        super(title, description, dueDate,status, priority);
        this.frequency = frequency;

    }
}
