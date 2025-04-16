// Import Scanner to take user input
import java.util.Scanner;

// Define the class
public class AgeClassifier {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Read the age

        // Check for valid input
        if (age < 0) {
            // Negative age is invalid
            System.out.println("Invalid age entered.");
        }
        else if (age <= 12) {
            // Age 0 to 12 = Child
            System.out.println("You are classified as a Child.");
        }
        else if (age <= 19) {
            // Age 13 to 19 = Teen
            System.out.println("You are classified as a Teen.");
        }
        else if (age <= 59) {
            // Age 20 to 59 = Adult
            System.out.println("You are classified as an Adult.");
        }
        else {
            // Age 60 and above = Senior
            System.out.println("You are classified as a Senior.");
        }

        // Close the scanner
        scanner.close();
    }
}
