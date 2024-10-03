import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        // Initialize the result list to store the triplets
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array to facilitate the two-pointer approach
        Arrays.sort(nums);

        // Iterate through the array, fixing one number and using two pointers to find the other two
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicates for the fixed element to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Initialize two pointers: left starts just after the fixed element, right starts at the end of the array
            int left = i + 1;
            int right = nums.length - 1;

            // While left is less than right, continue searching for a valid triplet
            while (left < right) {

                // Calculate the sum of the fixed element, left pointer, and right pointer
                int sum = nums[i] + nums[left] + nums[right];

                // If the sum is zero, we have found a valid triplet
                if (sum == 0) {
                    // Add the triplet to the result list
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for the left pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicates for the right pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers inward to search for new triplets
                    left++;
                    right--;
                } 
                // If the sum is less than zero, move the left pointer to the right to increase the sum
                else if (sum < 0) {
                    left++;
                } 
                // If the sum is greater than zero, move the right pointer to the left to decrease the sum
                else {
                    right--;
                }
            }
        }

        // Return the list of triplets
        return result;
    }
}
