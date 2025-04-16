// Import the Scanner class to read input from the user
import java.util.Scanner;

// Define the main class
public class OddEven {

    // Main method - the entry point of any Java application
    public static void main(String[] args) {

        // Create a Scanner object to take input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // Read the entered integer and store it in the 'number' variable
        int number = scanner.nextInt();

        // Check if the number is divisible by 2 (i.e., even)
        if (number % 2 == 0) {
            // If true, print that the number is even
            System.out.println(number + " is Even.");
        } else {
            // Otherwise, print that the number is odd
            System.out.println(number + " is Odd.");
        }

        // Close the Scanner to free up resources
        scanner.close();
    }
}
