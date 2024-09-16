class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // Place nums[i] at its correct position (nums[i] - 1) if it's not already there
            while (nums[i] != nums[nums[i] - 1]) {
                // Swap nums[i] and nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Collect duplicates
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // If the number is not in its correct position, it's a duplicate
            if (nums[i] != i + 1) {
                res.add(nums[i]);
            }
        }

        return res;
    }
}
