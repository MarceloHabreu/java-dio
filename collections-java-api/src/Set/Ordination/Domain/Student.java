package Set.Ordination.Domain;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    // Attributes
    private String name;
    private long registration;
    private double average;

    // Constructor
    public Student(String name, long registration, double average) {
        this.name = name;
        this.registration = registration;
        this.average = average;
    }

    // Getters
    public String getName() {
        return name;
    }

    public long getRegistration() {
        return registration;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return registration == student.registration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registration);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", registration=" + registration +
                ", average=" + average +
                '}';
    }

}
