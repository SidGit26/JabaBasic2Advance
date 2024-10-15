package Recursion;

import java.util.Arrays;

public class Revaaray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 4, 5};
        reverseArray(arr, 0, arr.length - 1);  // Reversing the entire array
        System.out.println(Arrays.toString(arr));  // Printing the reversed array
    }

    static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;  // Base case: stop when the start index meets or exceeds the end index
        }
        // Swap elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recur with narrowed indices
        reverseArray(arr, start + 1, end - 1);
    }
}
