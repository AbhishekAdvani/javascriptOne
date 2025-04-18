// Import Scanner class to take input from user
import java.util.Scanner;

// Define the class
public class NumberSignCheck {

    // Main method - program starts here
    public static void main(String[] args) {

        // Create Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble(); // Accept input (can be int or decimal)

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            // If number is greater than 0
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            // If number is less than 0
            System.out.println(number + " is Negative.");
        } else {
            // If number is exactly 0
            System.out.println("The number is Zero.");
        }
        // Close the Scanner to free system resources
        scanner.close();
    }
}
