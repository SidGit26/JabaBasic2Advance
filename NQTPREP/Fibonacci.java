package NQTPREP;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: nth term
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        // Special cases for n = 1 or n = 2
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (n == 1) {
            System.out.println("Fibonacci sequence up to 1 term: ");
            System.out.println(0);
        } else {
            // Print Fibonacci sequence up to nth term
            System.out.println("Fibonacci sequence up to " + n + " terms: ");
            int first = 0, second = 1;
            System.out.print(first + " " + second); // Print the first two terms

            for (int i = 3; i <= n; i++) {
                int next = first + second;  // Calculate next Fibonacci number
                System.out.print(" " + next);  // Print the next term
                first = second;  // Update first
                second = next;  // Update second
            }
            System.out.println();  // Print new line after the sequence
        }

        sc.close();
    }
}
