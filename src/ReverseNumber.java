import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store the original number for later display (optional)
        int originalNumber = number;

        // Variable to store the reversed number
        int reversed = 0;

        // Loop until the number becomes 0
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;

            // Append the digit to the reversed number
            reversed = reversed * 10 + digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Display the result
        System.out.println("Reverse of " + originalNumber + " is: " + reversed);

        // Close the scanner
        scanner.close();
    }
}
