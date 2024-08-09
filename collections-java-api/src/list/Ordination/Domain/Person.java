package list.Ordination.Domain;

import java.util.Comparator;

public class Person implements Comparable<Person>{
    //Atributes
    private String name;
    private int age;
    private double height;

    //Contructores
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Comparable
    @Override
    public int compareTo(Person p) {
        return Integer.compare(age, p.getAge());
    }
    //Getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    //View
    @Override
    public String toString() {
        return
                "name= '" + name + '\'' +
                ", Age= " + age +
                ", height= " + height +
                '}';
    }

    // Using the Comparator
    public static class ComparatorByHeight implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Double.compare(p1.getHeight(), p2.getHeight());
        }
    }
}
