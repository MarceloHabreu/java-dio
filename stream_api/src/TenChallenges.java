import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class TenChallenges {
    public static void main(String[] args) {
        // Functions interface: Consumer, Supplier, Function, Predicate, BinaryOperator.

        // Challenge 1 - Show the list in numerical order:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.print("Challenge One: ");
        numbers.stream().sorted().forEach(number -> System.out.print(number + "-"));
        System.out.println();

        // Challenge 2 - Print the sum of the even numbers in the list:
        System.out.print("Challenge Two: ");
        Integer sumEvenNumbers = numbers.stream().filter(number -> number % 2 ==0).reduce(0, (subtotal, number) -> subtotal + number);
        System.out.print("Sum of all the even numbers: " + sumEvenNumbers);
        System.out.println();

        // Challenge 3 - Check if all the numbers on the list are positive:
        System.out.print("Challenge Three: ");
        boolean numbersPositive = numbers.stream().allMatch(number -> number > 0);
        System.out.println("Are all numbers positive? " + numbersPositive);

        // Challenge 4 - Remove all odd values
        System.out.print("Challenge Four: ");
        List<Integer> oddNumbers = numbers.stream().filter(number -> number % 2 == 0).toList();
        System.out.println("Removing All Odd Numbers of list: " + oddNumbers);

        // Challenge 5 - Calculate the average of the numbers greater than 5
        System.out.print("Challenge Five: ");
        OptionalDouble averageNumbersGreaterThanFive = numbers.stream().filter(number -> number > 5)
                .mapToInt(Integer::intValue)
                .average();
        if (averageNumbersGreaterThanFive.isPresent()){
            System.out.print("Average of numbers greater than five: " + averageNumbersGreaterThanFive.getAsDouble());
        } else {
            System.out.println("No numbers greater than five");
        }
        System.out.println();

        // Challenge 6 - Check if the list contains any number greater than 10:
        System.out.print("Challenge Six: ");
        boolean numbersGreaterThanTen = numbers.stream().anyMatch(number -> number > 10);
        System.out.println("Is there a number greater than ten?: " + numbersGreaterThanTen);
    }


}
