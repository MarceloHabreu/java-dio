import java.util.Arrays;
import java.util.List;

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
        System.out.print(sumEvenNumbers);
        System.out.println();

        // Challenge 3 - Check if all the numbers on the list are positive:
        System.out.print("Challenge Three: ");
        Boolean numbersPositive = numbers.stream().allMatch(number -> number > 0);
        System.out.println("Are all numbers positive? " + numbersPositive);
    }


}
