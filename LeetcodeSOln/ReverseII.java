package LeetcodeSOln;

import java.util.Scanner;

class Solution {
    // Function to reverse the characters between index i and j
    public void rev(char[] arr, int i, int j) {
        // Swap characters from index i to j to reverse the order
        while (i < j) {
            char temp = arr[i];  // Store the character at index i
            arr[i] = arr[j];     // Assign the character at index j to index i
            arr[j] = temp;       // Assign the stored character to index j
            i++;                 // Move the left pointer forward
            j--;                 // Move the right pointer backward
        }
    }

    // Function to reverse every first k characters of each 2k chunk in the string
    public String reverseStr(String s, int k) {
        // Convert the string into a character array for easy manipulation
        char[] arr = s.toCharArray();

        int i = 0;  // Initialize index to start processing the array
        int n = arr.length;  // Store the length of the array

        // Loop through the array, processing chunks of 2k at a time
        while (i < n) {
            // Calculate the ending index for the reversal, ensure it doesn't exceed the array bounds
            int j = Math.min(i + k - 1, n - 1); // n is the length of array(converted)
            // Reverse the characters between index i and j (first k characters of the chunk)
            rev(arr, i, j);
            // Move the index forward by 2k, skipping the next k characters
            i = i + 2 * k;
        }

        // Convert the modified character array back to a string and return it
        return new String(arr);
    }

    // Main method to run the solution
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Take the input string from the user
        System.out.println("Enter the string:");
        String s = scanner.nextLine();

        // Take the integer k from the user
        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();

        // Create an instance of the Solution class and call the reverseStr method
        Solution solution = new Solution();
        String result = solution.reverseStr(s, k);

        // Output the result
        System.out.println("Reversed string: " + result);

        // Close the scanner
        scanner.close();
    }
}
