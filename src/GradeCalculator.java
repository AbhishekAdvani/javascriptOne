// Import Scanner class to take input
import java.util.Scanner;

// Define the class
public class GradeCalculator {

    // Main method - program execution begins here
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter marks
        System.out.print("Enter your marks (0 - 100): ");
        int marks = scanner.nextInt(); // Read marks as integer

        // Validate the input
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter between 0 and 100.");
        } else {
            // Using if-else to calculate grade
            char grade;

            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 80) {
                grade = 'B';
            } else if (marks >= 70) {
                grade = 'C';
            } else if (marks >= 60) {
                grade = 'D';
            } else if (marks >= 40) {
                grade = 'E';
            } else {
                grade = 'F';
            }

            // Output grade from if-else
            System.out.println("Grade (using if-else): " + grade);

            // Using switch to give a description for each grade
            // Convert char to string for switch compatibility
            switch (grade) {
                case 'A':
                    System.out.println("Excellent performance.");
                    break;
                case 'B':
                    System.out.println("Very Good.");
                    break;
                case 'C':
                    System.out.println("Good.");
                    break;
                case 'D':
                    System.out.println("Average.");
                    break;
                case 'E':
                    System.out.println("Needs Improvement.");
                    break;
                case 'F':
                    System.out.println("Fail. Better luck next time.");
                    break;
                default:
                    System.out.println("Unknown grade.");
            }
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
