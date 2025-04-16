// Import Scanner to get user input
import java.util.Scanner;

// Define the class
public class VowelOrConsonant {

    // Main method - execution starts here
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a character
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);  // Read the first character input

        // Convert to lowercase to simplify comparison
        ch = Character.toLowerCase(ch);

        // Check if input is an alphabet letter
        if ((ch >= 'a' && ch <= 'z')) {

            // Check if character is a vowel using if-else
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }

        } else {
            // If input is not an alphabet letter
            System.out.println("Invalid input! Please enter an English alphabet letter.");
        }

        // Close the scanner to free system resources
        scanner.close();
    }
}
