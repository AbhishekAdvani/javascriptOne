// Import Scanner class to take input from the user
import java.util.Scanner;

// Define the class
public class MultiplicationTable {

    // Main method - program execution starts here
    public static void main(String[] args) {

    // Enter a number to print its multiplication table: 7
    // Enter the limit up to which table should be printed (e.g. 10): 5
    //Multiplication Table of 7:
    //7 x 1 = 7
    //7 x 2 = 14
    //7 x 3 = 21
    //7 x 4 = 28
    //7 x 5 = 35

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to print its multiplication table:");
        int multiplationTableNumber = sc.nextInt();

        System.out.println("Enter the limit up to which table should be printed (e.g. 10)");
        int multiplationLimitNumber = sc.nextInt();

        for(int i = 1; i <= multiplationLimitNumber; i++){
            System.out.println(multiplationTableNumber * i);
        }
    }
}
