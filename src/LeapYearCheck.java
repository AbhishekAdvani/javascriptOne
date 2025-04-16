// Import Scanner class to take input from the user
import java.util.Scanner;

// Define the class
public class LeapYearCheck {

    // Main method - execution starts here
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();  // Read year from user

        // Apply leap year logic
        // Rule:
        // 1. Year divisible by 4 is a leap year
        // 2. BUT if divisible by 100, it must also be divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            // If the condition is true, it's a leap year
            System.out.println(year + " is a Leap Year.");
        } else {
            // Otherwise, it's not a leap year
            System.out.println(year + " is NOT a Leap Year.");
        }

        // Close the scanner
        scanner.close();
    }
}
