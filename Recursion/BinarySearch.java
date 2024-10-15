public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 6, 8, 9, 55, 92};
        int target = 55;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int arr[], int target, int start, int end) {
        // Base case: If start crosses end, target is not found
        if (start > end) {
            return -1;
        }

        // Calculate the mid index to avoid overflow
        int mid = start + (end - start) / 2;

        // Check if the mid element is the target
        if (arr[mid] == target) {
            return mid;
        }

        // If the target is smaller, search in the left half
        if (target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        }

        // If the target is larger, search in the right half
        return search(arr, target, mid + 1, end);
    }
}
