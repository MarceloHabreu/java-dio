import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter the first parameter:");
        int parameterOne = terminal.nextInt();
        System.out.println("Enter the second parameter:");
        int parameterTwo = terminal.nextInt();

        try {
            // Calling the method containing the counting logic
            count(parameterOne, parameterTwo);
        } catch (InvalidParametersException exception) {
            // Print the message: The second parameter must be greater than the first
            System.out.println(exception.getMessage());
        }
    }

    static void count(int parameterOne, int parameterTwo) throws InvalidParametersException {
        // Validate that parameterOne is GREATER than parameterTwo and throw the exception
        if (parameterOne > parameterTwo) {
            throw new InvalidParametersException("The second parameter must be greater than the first!");
        }

        int count = parameterTwo - parameterOne;

        // Perform the for loop to print the numbers based on the count variable
        for (int index = 1; index <= count; index++) {
            System.out.println("This is number: " + index);
        }
    }
}
