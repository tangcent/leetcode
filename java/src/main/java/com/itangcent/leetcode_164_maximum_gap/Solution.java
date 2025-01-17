package com.itangcent.leetcode_164_maximum_gap;


/*
 * @lc app=leetcode id=164 lang=java
 *
 * [164] Maximum Gap
 */

// @lc code=start
class Solution {
    public int maximumGap(int[] nums) {
        // Handle edge cases
        if (nums == null || nums.length < 2) {
            return 0;
        }
        
        // Sort the array
        java.util.Arrays.sort(nums);
        
        // Find maximum gap
        int maxGap = 0;
        for (int i = 1; i < nums.length; i++) {
            maxGap = Math.max(maxGap, nums[i] - nums[i-1]);
        }
        
        return maxGap;
    }
}
// @lc code=end

