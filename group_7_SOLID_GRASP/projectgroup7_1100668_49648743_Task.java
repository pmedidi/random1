public interface Task {
    public String title = null;
    public String description = null;
    public String dueDate = null;
    public boolean completed = false;
    public int priority = 0;

    protected void setPriority(int priority);

    protected void setStatus(boolean status);
}
