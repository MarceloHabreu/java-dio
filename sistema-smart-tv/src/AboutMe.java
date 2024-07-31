import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
    // Creating scanner object
    try{
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
  
      System.out.println("Enter your firstName:");
      String firstName = scanner.next();
  
      System.out.println("Enter your lastName:");
      String lastName = scanner.next();
  
      System.out.println("Enter your age:");
      int age = scanner.nextInt();
  
      System.out.println("Enter your height:");
      double height = scanner.nextDouble();
  
  
      //printing the data obtained by the user
          System.out.println("Hello, my name is " + firstName + " " + lastName);
          System.out.println("I am " + age + " years ");
          System.out.println("My height is " + height + "cm ");  
          scanner.close();
      }catch(InputMismatchException e) {
        System.out.println("The age and height fields must be numeric");
      }
    }
}
