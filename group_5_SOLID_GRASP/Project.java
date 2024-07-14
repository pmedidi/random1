import java.util.*;

public class Project {
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private List<Workable> members;
    private PriorityQueue<Task> tasks;

    public Project(String name, String description, Date startDate, Date endDate,
                   List<Workable> members, List<Task> tasks) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.members = new ArrayList<>(members);
        this.tasks = new PriorityQueue<>((t1, t2) -> t1.getPriority() - t2.getPriority());
        for (Task t : tasks) {
            addTask(t);
        }
    }

    public void addMember(Workable member) {
        members.add(member);
    }

    public boolean removeMember(Workable member) {
        return members.remove(member);
    }

    public void addTask(Task t) {
        tasks.add(t);
    }

    public boolean removeTask(Task t) {
        return tasks.remove(t);
    }

    public void finishProject() {
        // Process tasks based on their priority
        // Select a random worker to complete the task
        Random rand = new Random();
        while (!tasks.isEmpty()) {
            System.out.println("=".repeat(10));
            Task currentTask = tasks.poll();
            Workable worker = members.get(rand.nextInt(members.size()));
            currentTask.process(worker);
            currentTask.setStatus("Finished");
        }
    }
}
