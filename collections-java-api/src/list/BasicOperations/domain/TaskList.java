package list.BasicOperations.domain;

import list.BasicOperations.test.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    // Attribute
    private List<Task> listTask;

    public TaskList() {
        this.listTask = new ArrayList<>();
    }

    public void addTask(String description){
        listTask.add(new Task(description));
    }

    public void removeTask(String description){
        List<Task> tasksToRemove = new ArrayList<>();
        for(Task t : listTask){
            if(t.getDescription().equalsIgnoreCase(description)){
                tasksToRemove.add(t);
            }

        }
        listTask.removeAll(tasksToRemove);
    }

    public int getTotalTasks(){
        return listTask.size();
    }

    public void getDescriptionsTasks(){
        System.out.println(listTask);
    }


}
