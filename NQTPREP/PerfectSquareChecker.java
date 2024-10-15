package NQTPREP;
import java.util.Scanner;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 3: Check if the number is a perfect square
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is a perfect square
    public static boolean isPerfectSquare(int num) {
        // Calculate the square root of the number
        double sqrt = Math.sqrt(num);

        // Cast the square root to an integer
        int sqrtInt = (int) sqrt;

        // Check if the square of the integer part of the square root is equal to the original number
        return (sqrtInt * sqrtInt == num);
    }
}
