// Import Scanner class to take user input
import java.util.Scanner;

public class FactorialExample {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt(); // Read the number entered by the user

        // Variable to store the result, initialized to 1
        long factorial = 1;

        // Check if the number is negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Loop from 1 to the given number
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by i in each iteration
            }

            // Display the result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        // Close the scanner object to prevent memory leak
        scanner.close();
    }
}
