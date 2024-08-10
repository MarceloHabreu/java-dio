package Set.Research.Test;

import Set.Research.Domain.Task;

import java.util.HashSet;
import java.util.Set;

public class ListTasks {
    private Set<Task> taskSet;

    public ListTasks() {
        this.taskSet = new HashSet<>();
    }

    // Methods
    public void addTask(String description){
        taskSet.add(new Task (description));
    }

    public void removeTask(String description){
        Task taskToRemove = null;
        if(!taskSet.isEmpty()){
           for (Task t : taskSet){
               if(t.getDescription().equalsIgnoreCase(description)){
                   taskToRemove = t;
                   break;
               }
           }
           taskSet.remove(taskToRemove);
        } else {
            System.out.println("Description not found in the set!");
        }
    }

    public void showTasks() {
        if(!taskSet.isEmpty()){
            System.out.println(taskSet);
        } else {
            System.out.println("There is no task, add one!");
        }
    }

    public int countTasks(){
        return taskSet.size();
    }

    public Set<Task> getTasksCompleted() {
        Set<Task> tasksCompleted = new HashSet<>();
        for(Task t : taskSet) {
            if (t.isCompleted()){
                tasksCompleted.add(t);
            }
        }
        return tasksCompleted;
    }

    public Set<Task> getTasksPending() {
        Set<Task> tasksNotCompleted = new HashSet<>();
        for (Task t : taskSet) {
            if (!t.isCompleted()){
                tasksNotCompleted.add(t);
            }
        }
        return tasksNotCompleted;
    }

    public void checkTaskCompleted(String description){
        for (Task t : taskSet){
            if(t.getDescription().equalsIgnoreCase(description)){
                if (!t.isCompleted()) {
                    t.setCompleted(true);
                    System.out.println("Task marked as completed: " + description);
                } else {
                    System.out.println("Task is already completed: " + description);
                }
                return;
            }
        }
        System.out.println("Task not found: " + description);
    }


    public void markTaskPending(String description){
        for(Task t : taskSet){
            if(t.getDescription().equalsIgnoreCase(description)){
                if (t.isCompleted()) {
                    t.setCompleted(false);
                    System.out.println("Task marked as pending: " + description);
                } else {
                    System.out.println("Task is already pending: " + description);
                }
                return;
            }
        }
        System.out.println("Task not found in list: " + description);
    }


    public void clearTaskList() {
        if(taskSet.isEmpty()){
            System.out.println("The list already is empty!");
        } else {
            taskSet.clear();
        }
    }

    public static void main(String[] args) {
        // Creating an Instance of the TaskList Class
        ListTasks listTasks = new ListTasks();

        // Adding the tasks to the list
        listTasks.addTask("Studying Java");
        listTasks.addTask("Train Typescript with react");
        listTasks.addTask("Improving database knowledge");
        listTasks.addTask("Read more books");

        // Viewing the tasks in the list
        listTasks.showTasks();

        // Removing a task
        listTasks.removeTask("Studying Java");
        listTasks.showTasks();

        //  Counting the number of tasks in the list
        System.out.println("The total of tasks to the list: " + listTasks.countTasks());

        // Getting To Do Tasks
        System.out.println("Tasks pending: " + listTasks.getTasksPending());

        // Marking tasks as complete
        listTasks.checkTaskCompleted("Read more books");
        listTasks.checkTaskCompleted("Improving database knowledge");

        // Getting Tasks Completed
        System.out.println(listTasks.getTasksCompleted());

        // Marking tasks as pendent
        listTasks.markTaskPending("Train Typescript with react");
        listTasks.showTasks();

        // Clearing the Task List
        listTasks.clearTaskList();
        listTasks.showTasks();
    }
}
