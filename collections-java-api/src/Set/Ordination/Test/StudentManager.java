package Set.Ordination.Test;

import Set.Ordination.Domain.Student;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {
    // Attribute
    private Set<Student> studentList;

    public StudentManager() {
        this.studentList = new HashSet<>();
    }

    // Methods
    public void addStudent(String name, long registration, double average) {
        studentList.add(new Student(name, registration, average));
    }

    public void removeStudent(long registration) {
        Student studentForToRemove = null;
        if (!studentList.isEmpty()) {
            for (Student s : studentList) {
                if (s.getRegistration() == registration) {
                    studentForToRemove = s;
                    break;
                }
            }
            if (studentForToRemove != null) {
                studentList.remove(studentForToRemove);
            } else {
                throw new RuntimeException("Registration not found in the list!");
            }
        } else {
            throw new RuntimeException("The list is empty!");
        }
    }

    public void showStudentsByName() {
        Set<Student> studentsByName = new TreeSet<>(studentList); // TreeSet ordena por nome com base no compareTo da classe Student
        if (!studentsByName.isEmpty()) {
            System.out.println(studentsByName);
        } else {
            System.out.println("The list is empty!");
        }
    }

    public static class ComparatorGrade implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Double.compare(s1.getAverage(), s2.getAverage());
        }
    }
    public void showStudentByGrade() {
        Set<Student> studentsByGrade = new TreeSet<>(new ComparatorGrade());
        if (!studentList.isEmpty()) {
            studentsByGrade.addAll(studentList);
            System.out.println(studentsByGrade);
        } else {
            System.out.println("The list is empty!");
        }
    }

    public void showStudents() {
        if (!studentList.isEmpty()) {
            System.out.println(studentList);
        } else {
            System.out.println("There are no students on the list!");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of StudentManager
        StudentManager studentManager = new StudentManager();

        // Adding students to the manager
        studentManager.addStudent("John", 123456L, 7.5);
        studentManager.addStudent("Mary", 123457L, 9.0);
        studentManager.addStudent("Charles", 123458L, 5.0);
        studentManager.addStudent("Anna", 123459L, 6.8);

        // Displaying all students in the manager
        System.out.println("Students in the manager:");
        studentManager.showStudents();

        // Removing a student by registration number
        studentManager.removeStudent(123456L);
        studentManager.removeStudent(123457L);

        System.out.println("After removals:");
        studentManager.showStudents();

        // Displaying students ordered by name
        System.out.println("Students ordered by name:");
        studentManager.showStudentsByName();

        // Displaying students ordered by grade
        System.out.println("Students ordered by grade:");
        studentManager.showStudentByGrade();
    }
}
