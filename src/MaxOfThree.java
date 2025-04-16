// Import the Scanner class to take input from the user
import java.util.Scanner;

// Define the class
public class MaxOfThree {

    // Main method - program starts here
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();  // Read first number

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();  // Read second number

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();  // Read third number

        // Initialize max with the first number
        int max = num1;

        // Compare max with second number
        if (num2 > max) {
            max = num2;  // Update max if second number is greater
        }

        // Compare max with third number
        if (num3 > max) {
            max = num3;  // Update max if third number is greater
        }

        // Output the maximum number
        System.out.println("The maximum number is: " + max);

        // Close the Scanner
        scanner.close();
    }
}
