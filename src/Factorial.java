import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number for which factorial needs to be calculated
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculate factorial
        long fac = 1;
        for (int i = 1; i <= number; i++) {
            fac *= i;
        }
        //Another way
        /*
        long fac = 1;
        for (int i = n; i >= 1; i--) {
            fac =fac* i;
        }

         */

        // Output: Display the result
        System.out.println("Factorial of " + number + " is: " + fac);

        // Close the scanner to prevent resource leak
        scanner.close();

        //OUTPUT
        //Enter a number to calculate its factorial: 4
        //Factorial of 4 is: 24
    }
}
