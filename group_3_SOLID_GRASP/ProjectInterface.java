import java.util.Date;
import java.util.List;

public interface ProjectInterface {
  void addTask(TaskInterface task);
  boolean removeTask(TaskInterface task);
  void addMember(MemberInterface member);
  boolean removeMember(MemberInterface member);
  void setName(String name);
  String getName();
  void setDescription(String description);
  String getDescription();
  void setStartDate(Date startDate);
  Date getStartDate();
  void setEndDate(Date endDate);
  Date getEndDate();
  void setMembers(List<MemberInterface> members);
  List<MemberInterface> getMembers();
  void setTasks(List<TaskInterface> tasks);
  List<TaskInterface> getTasks();
}