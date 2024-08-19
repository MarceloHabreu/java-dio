import java.util.*;
import java.util.stream.IntStream;

public class Challenges {
    public static void main(String[] args) {
        // Functions interface: Consumer, Supplier, Function, Predicate, BinaryOperator.

        // Challenge 1 - Show the list in numerical order:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);
        System.out.print("Challenge One: ");
        numbers.stream().sorted().forEach(number -> System.out.print("{" + number + "}"));
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

        // Challenge 7 - Find the second-largest number on the list:
        System.out.print("Challenge Seven: ");
        Optional<Integer> secondLargest = numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
        if (secondLargest.isPresent()){
            System.out.println("The second largest number on the list is: " + secondLargest.get());
        } else {
            System.out.println("There is no second largest number.");
        }

        // Challenge 8 - Add up the digits of all the numbers on the list:
        System.out.print("Challenge Eight: ");
        int sumAllNumbers = numbers.stream().reduce(0, Integer::sum);
        System.out.println("The sum of all numbers on the list is: "+ sumAllNumbers);

        // Challenge 9 - Check that all the numbers in the list are distinct (not repeated):
        System.out.print("Challenge Nine: ");
        long originalSize = numbers.size();
        long distinctSize = numbers.stream().distinct().count();
        boolean allNumbersAreDistinct = originalSize == distinctSize;
        System.out.println("Are all numbers distinct?: " + allNumbersAreDistinct  + "!");


        // Challenge 10 - Group the odd values multiple of 3 or 5:
        System.out.print("Challenge Ten: ");
        List<Integer> groupedNumbers = numbers.stream().filter(n -> n % 2 != 0).filter(n-> n % 3 == 0 || n % 5 == 0).toList();
        System.out.println("The odd numbers multiple of 3 or 5: " + groupedNumbers);

        // Challenge 11 - Find the sum of the squares of all the numbers in the list:
        System.out.print("Challenge Eleven: ");
        int sumAllSquares = numbers.stream().map(n -> n * n).reduce(0, Integer::sum);
        System.out.println("The sum of the squares of all numbers is: " + sumAllSquares);

        // Challenge 12 - Find the product of all the numbers on the list:
        System.out.print("Challenge Twelve: ");
        int productAllNumbers = numbers.stream().reduce(1,(subtotal, number) -> subtotal * number);
        System.out.println("The product of all the numbers is: " + productAllNumbers);

        // Challenge 13 - Filter the numbers that are within a range:
        System.out.print("Challenge Thirty: ");
        List<Integer> numbersRange = numbers.stream().filter(n -> n > 5 && n < 10).toList();
        System.out.println("Filtering Numbers Between 5 and 10 on the list: " + numbersRange);

        // Challenge 14 – Find the highest prime number on the list:
        System.out.print("Challenge Fourteen: ");
        int highestPrimeNumber = numbers.stream().filter(number -> number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0)).max(Integer::compareTo).orElse(-1);
        System.out.println("The highest prime number is: " + highestPrimeNumber);

        // Challenge 15 - Check that the list contains at least one negative number:
        System.out.print("Challenge Fifteen: ");
        boolean atLeastOneNegative = numbers.stream().anyMatch(n -> n < 0);
        System.out.println("There is at least one negative number?: " + atLeastOneNegative);

        // Challenge 16 - Group the numbers into odd and even:
        System.out.print("Challenge Sixteen: ");
        List<Integer> numbersEven = numbers.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> numbersOdd = numbers.stream().filter(n -> n % 2 != 0).toList();
        System.out.print("All even numbers on the list: " + numbersEven + ", and ");
        System.out.println("all odd numbers on the list: " + numbersOdd);

        // Challenge 17 - Filter the prime numbers from the list:
        System.out.print("Challenge Seventeen: ");
        List<Integer> primeNumbers = numbers.stream().filter(n -> n > 1 && IntStream.range(2, n).noneMatch(i -> n % i == 0)).toList();
        System.out.println("Prime numbers in the list: " + primeNumbers);

        // Challenge 18 - Check if all the numbers in the list are the same:
        System.out.print("Challenge Eighteen: ");
        boolean allNumbersEqual = numbers.stream().allMatch(n -> n.equals(numbers.getFirst()));
        System.out.println("Are all numbers equal? " + allNumbersEqual + "!");

        // Challenge 19 - Find the sum of the numbers divisible by 3 and 5:
        System.out.print("Challenge Nineteen: ");
        int sumNumbersDiByThreeAndFive = numbers.stream().filter(n -> n % 3 == 0 && n % 5 == 0).reduce(0, Integer::sum);
        System.out.println("The sum of the numbers divisible by 3 and 5 on the list is: " + sumNumbersDiByThreeAndFive);
    }


}


