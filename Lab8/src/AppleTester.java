// AppleTester.java
import java.util.Scanner;

public class AppleTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Apple tester!!!");

        // Create the first apple object using the default constructor
        System.out.println("Creating the first apple!");
        Apple firstApple = new Apple();
        System.out.println("Default values of the first apple object:");
        firstApple.writeOutput();

        // Create the second apple object using the parameterized constructor
        System.out.println("\nEnter the type of the second apple object:");
        String type = scanner.nextLine();

        System.out.println("Enter the weight of the second apple object:");
        double weight = scanner.nextDouble();

        System.out.println("Enter the price of the second apple object:");
        double price = scanner.nextDouble();

        Apple secondApple = new Apple(type, weight, price);
        System.out.println("Creating the second apple object!");
        System.out.println("Values of the second apple object:");
        secondApple.writeOutput();

        scanner.close();
    }
}
