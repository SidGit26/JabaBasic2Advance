package Sorting;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {

        // Initialize an array with values
        int arr[] = { 2, 3, 4, 5, 1 };
        
        // Call the insertion sort method
        insertionsort(arr);
        
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Insertion sort implementation
    static void insertionsort(int[] arr) {
        // Start from the first unsorted element and move it to its correct position
        for (int i = 0; i < arr.length - 1; i++) {
            
            // Iterate backwards through the sorted portion of the array
            for (int j = i + 1; j > 0; j--) {
                
                // Check if the current element is smaller than the previous one
                if (arr[j] < arr[j - 1]) {
                    
                    // Swap if the condition is true
                    swap(arr, j, j - 1);
                    
                } else {
                    // If no swap is needed, the current element is in the correct position
                    break;
                }
            }
        }
    }

    // Method to swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        // Temporary storage for swapping
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
