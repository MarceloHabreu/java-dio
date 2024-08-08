package list.BasicOperations.test;

import list.BasicOperations.domain.TaskList;

public class Task {
    // Attribute
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        System.out.println("The total number of elements in the list is: " + taskList.getTotalTasks());

        taskList.addTask("First Task!");
        taskList.addTask("Second Task!");
        taskList.addTask("Third Task!");
        System.out.println("The total number of elements in the list is: " + taskList.getTotalTasks());

        taskList.removeTask("Second Task!");
        taskList.removeTask("First Task!");
        System.out.println("The total number of elements in the list is: " + taskList.getTotalTasks());

        taskList.getDescriptionsTasks();
    }
}
