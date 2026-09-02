package com.itangcent.leetcode_413_arithmetic_slices;


/*
 * @lc app=leetcode id=413 lang=java
 *
 * [413] Arithmetic Slices
 */

// @lc code=start
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        // If the array has less than 3 elements, there can be no arithmetic slices
        if (nums == null || nums.length < 3) {
            return 0;
        }

        int count = 0;
        int dp = 0; // dp[i] represents the number of arithmetic slices ending at index i

        // Start from the third element (index 2)
        for (int i = 2; i < nums.length; i++) {
            // Check if the current three elements form an arithmetic sequence
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                // If they do, we can form dp[i-1] + 1 new arithmetic slices
                dp = dp + 1;
                count += dp;
            } else {
                // If they don't, we reset dp for the current position
                dp = 0;
            }
        }
        
        return count;
    }
}
// @lc code=end

