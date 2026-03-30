class Solution {
    public int longestConsecutive(int[] nums) {
                if (nums == null || nums.length == 0) return 0;

        Arrays.sort(nums);   // Step 1: sort the array

        int longest = 1;
        int current = 1;

        for (int i = 1; i < nums.length; i++) {

            // Step 2: skip duplicates
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            // Step 3: check if consecutive
            if (nums[i] == nums[i - 1] + 1) {
                current++;   // extend the chain
            } else {
                longest = Math.max(longest, current);
                current = 1; // reset chain
            }
        }

        return Math.max(longest, current);
    }
}
