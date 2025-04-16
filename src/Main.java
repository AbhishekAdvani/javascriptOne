// Import the Scanner class to read input from the user
import java.util.Scanner;

// Define the main class
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create vowel or constant

        // Enter character terminal
        System.out.println("Enter an alphabet:");

        // read first char
        char alphabet = scanner.next().charAt(0);

        //convert to lower case
        alphabet = Character.toLowerCase(alphabet);

        // check if alphabet is vowel using if els
        if ((alphabet >= 'a' && alphabet <= 'z')) {
            // Check if character is a vowel using if-else
            if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
                System.out.println(alphabet + " is a Vowel.");
            } else {
                System.out.println(alphabet + " is a Consonant.");
            }

        }else{
            System.out.println("invalid");
        }
    }
}