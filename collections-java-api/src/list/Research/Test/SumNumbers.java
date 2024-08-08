package list.Research.Test;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
    // Atributte
    private List<Integer> numbers;

    //Constructor
    public SumNumbers() {
        this.numbers = new ArrayList<>();
    }
    public void addNumber(int number){
        this.numbers.add(number);
    }

    public int calculateSum() {
        int sum = 0;
        for (Integer number : numbers)
            sum += number;
        return sum;
    }
    public int findHigherNumber(){
        int highterNumber = Integer.MIN_VALUE;
        if(!numbers.isEmpty()) {
            for(Integer number : numbers){
                if (number >= highterNumber) {
                    highterNumber = number;
                }
            }
            return highterNumber;
        }else {
            throw new RuntimeException(("The list is empty!!"));
        }
    }
    public int findLowestNumber(){
        int lowestNumber = Integer.MAX_VALUE;
        if(!numbers.isEmpty()) {
            for(Integer number : numbers){
                if (number <= lowestNumber) {
                    lowestNumber = number;
                }
            }
            return lowestNumber;
        }else {
            throw new RuntimeException(("The list is empty!!"));
        }
    }

    public void showNumbers(){
        if (!numbers.isEmpty()){
            System.out.println(this.numbers);
        } else {
            System.out.println("The list is empty!!");
        }
    }
    public static void main(String[] args) {
        // Creating an instance of the SomaNumeros class
        SumNumbers sumNumbers = new SumNumbers();

        // Adding numbers to the list
        sumNumbers.addNumber(5);
        sumNumbers.addNumber(0);
        sumNumbers.addNumber(0);
        sumNumbers.addNumber(-2);
        sumNumbers.addNumber(10);

        // Displaying the list of added numbers
        System.out.println("Added numbers:");
        sumNumbers.showNumbers();

        // Calculating and displaying the sum of the numbers in the list
        System.out.println("Sum of numbers = " + sumNumbers.calculateSum());

        // Finding and displaying the largest number in the list
        System.out.println("Largest number = " + sumNumbers.findHigherNumber());

        // Finding and displaying the smallest number in the list
        System.out.println("Smallest number = " + sumNumbers.findLowestNumber());
    }


}
