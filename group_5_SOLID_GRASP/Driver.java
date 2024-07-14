import java.util.Arrays;
import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Ken", "ken@test.com");
        Programmer p2 = new Programmer("Ken 2", "ken2@test.com");
        Programmer p3 = new Programmer("Ken 3", null);
        Manager m = new Manager("Ken 4", "ken4@test.com",
                new TeamMember[] {
                        p1, p3
                });

        Workable[] workers = new Workable[] {
                p1, p2, p3, m
        };

        Task[] tasks = new Task[] {
                new RegularTask("Task 1", "Desc 1", new Date(), "Not started", 4),
                new RecurringTask("Task 2", "Desc 2", new Date(), "Not started", 1, 3),
                new RegularTask("Task 3", "Desc 3", new Date(), "Not started", 2)
        };

        Project project = new Project("Project", "Desc Project", new Date(), new Date(),
                Arrays.asList(workers), Arrays.asList(tasks));
        project.finishProject();
    }
}
