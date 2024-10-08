package Set.Research.Domain;

public class Task {
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }
   //Getters
    public String getDescription() {
        return description;
    }
    public boolean isCompleted() {
        return completed;
    }
    //Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return
                "description='" + description + '\'' +
                ", completed=" + completed + ""
                ;
    }
}
