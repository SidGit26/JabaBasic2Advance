package arrayyoutube;

public class TWOSUM {
    public static void main(String[] args) {
        
    }
   
        public int[] twoSum(int[] nums, int target) {
            // Iterate through each element of the array
            for (int i = 0; i < nums.length; i++) {
                // For each element, iterate through the subsequent elements
                for (int j = i + 1; j < nums.length; j++) {
                    // If the sum of the two elements matches the target, return their indices
                    if (nums[i] + nums[j] == target) {
                        // Return an array containing the two indices
                        return new int[] {i, j};
                    }
                }
            }
            // If no solution is found, return an empty array or handle accordingly
            // In LeetCode's case, it's guaranteed that exactly one solution exists,
            // so we won't actually reach this line.
            return new int[] {-1, -1};  // This is just for safety; in practice, you can omit this line.
        }
    }

