// Import Scanner class for user input
import java.util.Scanner;

// Define the class
public class Calculator {

    // Main method - execution starts here
    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Display the calculator menu
        System.out.println("=== Simple Calculator ===");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");

        // Ask the user to choose an operation
        System.out.print("Choose an operation (1-5): ");
        int choice = scanner.nextInt(); // Read the user's menu choice

        // Ask for two numbers to perform the operation
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble(); // Read first number

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble(); // Read second number

        // Perform the operation using switch
        switch (choice) {
            case 1:
                // Addition
                System.out.println("Result: " + (num1 + num2));
                break;

            case 2:
                // Subtraction
                System.out.println("Result: " + (num1 - num2));
                break;

            case 3:
                // Multiplication
                System.out.println("Result: " + (num1 * num2));
                break;

            case 4:
                // Division with zero check
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;

            case 5:
                // Modulus with zero check
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 % num2));
                } else {
                    System.out.println("Error: Cannot perform modulus by zero.");
                }
                break;

            default:
                // If user chooses an invalid option
                System.out.println("Invalid choice! Please select between 1 to 5.");
        }

        // Close the Scanner to release resources
        scanner.close();
    }
}
