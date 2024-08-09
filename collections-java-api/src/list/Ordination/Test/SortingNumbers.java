package list.Ordination.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingNumbers {
    // Attribute
    private List<Integer> numbersList;
    // Constructor
    public SortingNumbers() {
        this.numbersList = new ArrayList<>();
    }
    // Methods
    public void addNumber(int number) {
        this.numbersList.add(number);
    }

    public List<Integer> sortAscendant() {
        List<Integer> numbersAsc = new ArrayList<>(this.numbersList);
        if (!numbersList.isEmpty()){
            Collections.sort(numbersAsc);
            return numbersAsc;
        } else {
            throw new RuntimeException("The list is empty!!");
        }
    }

    public List<Integer> sortDescendant() {
        List<Integer> numbersAsc = new ArrayList<>(numbersList);
        if(!numbersList.isEmpty()){
            numbersAsc.sort(Collections.reverseOrder());
            return numbersAsc;
        } else {
            throw new RuntimeException("The list is empty!!");
        }
    }

    public void showNumbers() {
        if (!numbersList.isEmpty()) {
            System.out.println(this.numbersList);
        } else {
            System.out.println("The list is empty!!");
        }
    }
    public static void main(String[] args) {
        // Creating an Instance of the NumberSorting Class
        SortingNumbers numbers = new SortingNumbers();

        // Adding Numbers to the Lis
        numbers.addNumber(23);
        numbers.addNumber(54);
        numbers.addNumber(41);
        numbers.addNumber(1000);
        numbers.addNumber(99);
        numbers.addNumber(-26);
        numbers.addNumber(-189);

        // Viewing the list of added numbers
        numbers.showNumbers();

        // Sorting and displaying in ascending order
        System.out.println(numbers.sortAscendant());

        // Viewing the list
        numbers.showNumbers();

        // Sorting and displaying in descending order
        System.out.println(numbers.sortDescendant());

        // Viewing the list
        numbers.showNumbers();
    }


}
