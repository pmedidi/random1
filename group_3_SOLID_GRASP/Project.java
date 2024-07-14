import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Project implements ProjectInterface {
  String name;
  String description;
  Date startDate;
  Date endDate;
  List<MemberInterface> members;
  List<TaskInterface> tasks;

  public Project(String name, String description, Date startDate,
                 Date endDate, List<MemberInterface> members, List<TaskInterface> tasks) {
    this.name = name;
    this.description = description;
    this.startDate = new Date(startDate.getTime());
    this.endDate = new Date(endDate.getTime());
    this.members = new ArrayList<>(members);
    this.tasks = new ArrayList<>(tasks);
  }

  public void addTask(TaskInterface task) {
    tasks.add(task);
  }
  
  public boolean removeTask(TaskInterface task) {
    return tasks.remove(task);
  }
  
  public void addMember(MemberInterface member) {
    members.add(member);
  }

  public boolean removeMember(MemberInterface member) {
    return members.remove(member);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void setStartDate(Date startDate) {
    this.startDate = new Date(startDate.getTime());
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setEndDate(Date endDate) {
    this.startDate = new Date(endDate.getTime());
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setMembers(List<MemberInterface> members) {
    this.members = new ArrayList<>(members);
  }

  public List<MemberInterface> getMembers() {
    return members;
  }

  public void setTasks(List<TaskInterface> tasks) {
    this.tasks = new ArrayList<>(tasks);
  }

  public List<TaskInterface> getTasks() {
    return tasks;
  }
}