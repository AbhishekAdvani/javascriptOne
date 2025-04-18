// Import Scanner class for user input
import java.util.Scanner;

// Define the class
public class PrintOneToN {

    // Main method - execution starts here
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the value of N
        System.out.print("Enter a number (N): ");
        int n = scanner.nextInt(); // Read the number N

        // Validate the input
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Use a for loop to print numbers from 1 to N
            System.out.println("Numbers from 1 to " + n + ":");

            for (int i = 1; i <= n; i++) {
                // Print current number with a space
                System.out.print(i + " ");
            }
        }

        // Close the scanner to release system resources
        scanner.close();
    }
}
