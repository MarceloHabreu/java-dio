package br.com.dio.challenge.dominio;

public class Course extends Content{
    //Attributes
    private int workload;

    //Constructor
    public Course() {
    }

    // Method
    @Override
    public double calculateXp() {
        return XP_PATTERN + workload;
    }

    //Getters and Setters
    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }
}
