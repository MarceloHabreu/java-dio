package list.Ordination.Domain;

import java.util.Comparator;

public class Number implements Comparable<Number> {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    // Comparable
    @Override
    public int compareTo(Number n) {
        return 0;
    }

    // View
    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}
