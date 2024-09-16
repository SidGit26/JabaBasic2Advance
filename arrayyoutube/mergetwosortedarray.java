package arrayyoutube;



public class mergetwosortedarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 6};
        int[] arr2 = {0, 7, 8, 9};
        int[] result = merge(arr1, arr2);

        // Print the merged and sorted array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    // Function to merge two sorted arrays
    public static int[] merge(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;

        // Create a new array with a size equal to the sum of arr1 and arr2
        int[] result = new int[size1 + size2];
        int i = 0, j = 0, k = 0;

        // Merge the arrays until one of them is fully traversed
        while (i < size1 && j < size2) {
            // Compare and merge the elements in sorted order
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy any remaining elements from arr1
        while (i < size1) {
            result[k++] = arr1[i++];
        }

        // Copy any remaining elements from arr2
        while (j < size2) {
            result[k++] = arr2[j++];
        }

        return result; // Return the merged sorted array
    }
}
