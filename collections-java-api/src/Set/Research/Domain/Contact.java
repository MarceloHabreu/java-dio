package Set.Research.Domain;

import java.util.Objects;

public class Contact {
    // attributes
    private String name;
    private int number;

    // Constructor
    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }
    // Getters
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
    // Set number
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "{" + name + "," + number + "}";
    }
}
