package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        // Define an array of integers to be sorted
        int[] a = {5, 3, 4, 1, 2};
        
        // Call the bubble sort function to sort the array
        bubble(a);
        
        // Print the sorted array
        System.out.println(Arrays.toString(a));
    }

    // Bubble sort function that sorts the array in ascending order
    static void bubble(int[] a) {
        // Outer loop runs through the entire array
        for (int i = 0; i < a.length; i++) {
            // Inner loop compares adjacent elements and swaps them if needed
            // The range of the inner loop decreases with each pass as the largest
            // element is placed at the end of the array in each iteration
            for (int j = 1; j < a.length - i; j++) {
                // If the current element is smaller than the previous element, swap them
                if (a[j] < a[j - 1]) {
                    // Swap the elements
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }
}
