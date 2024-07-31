import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your name:");
        String name = scanner.next();

        System.out.println("Enter your branch number:");
        String branchNumber = scanner.next();

        System.out.println("Enter your account number:");
        int accountNumber = scanner.nextInt();

        System.out.println("Finally, enter the balance you want to withdraw:");
        float balance = scanner.nextFloat();

        // Printing the data obtained by the user!!
        String message = String.format("Hello %s, thank you for creating an account at our bank. Your branch number is %s, account number is %d, and your balance %.2f is available for withdrawal.", name, branchNumber, accountNumber, balance);
        System.out.println(message);
    }
}
