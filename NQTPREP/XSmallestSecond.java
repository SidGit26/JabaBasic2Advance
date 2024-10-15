package NQTPREP;
import java.util.Arrays;

public class XSmallestSecond {
    public static void main(String[] args) {
        int arr[] = {12, 3, 4, 5, 6, 7, 8};
        
        // Sort the array
        Arrays.sort(arr);
        
        // Call the functions to get the second smallest and second largest elements
        int secondSmallest = findSecondSmallest(arr);
        int secondLargest = findSecondLargest(arr);
        
        // Print the results
        System.out.println("Second smallest element: " + secondSmallest);
        System.out.println("Second largest element: " + secondLargest);
    }

    // Function to find the second smallest element
    public static int findSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        return arr[1]; // Second smallest element in a sorted array
    }

    // Function to find the second largest element
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        return arr[arr.length - 2]; // Second largest element in a sorted array
    }
}
