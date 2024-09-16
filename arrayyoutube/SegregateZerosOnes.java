package arrayyoutube;

public class SegregateZerosOnes {

    public static void main(String[] args) {
        // Input array containing 0s and 1s
        int arr[] = {0, 1, 0, 1, 1, 0, 1, 0, 1, 0};

        // Calling function to segregate 0s and 1s
        segregateZerosOnes(arr);

        // Output the result after segregation
        System.out.println("Array after segregation:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to segregate 0s and 1s in an array using two-pointer technique
     static void segregateZerosOnes(int arr[]) {
        // Initialize two pointers: left (starting from the beginning) and right (starting from the end)
        int left = 0, right = arr.length - 1;

        // Loop until left pointer crosses the right pointer
        while (left < right) {
            // Move the left pointer to the right while we encounter 0s, as we want to keep 0s on the left side
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // Move the right pointer to the left while we encounter 1s, as we want to keep 1s on the right side
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // If left is still less than right, it means we have encountered a 1 on the left and a 0 on the right
            // Swap arr[left] and arr[right] to place 0 on the left and 1 on the right
            if (left < right) {
                // Swap the values at left and right pointers
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                // After swapping, move both pointers inward
                left++;
                right--;
            }
        }
        
    }
}
