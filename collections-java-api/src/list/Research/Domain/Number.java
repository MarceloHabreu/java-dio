package list.Research.Domain;

public class Number {
    // Attribute
    private int number;

    //Constructor
    public Number(int number) {
        this.number = number;
    }

    // get
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}
