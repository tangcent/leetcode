package com.itangcent.leetcode_213_house_robber_ii;


/*
 * @lc app=leetcode id=213 lang=java
 *
 * [213] House Robber II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        // Since houses are in a circle, we need to handle two cases:
        // 1. Rob houses from 0 to n-2 (excluding the last house)
        // 2. Rob houses from 1 to n-1 (excluding the first house)
        // Take the maximum of these two cases
        return Math.max(robRange(nums, 0, nums.length - 2), 
                         robRange(nums, 1, nums.length - 1));
    }
    
    // Helper function to calculate max money when robbing houses in a range
    private int robRange(int[] nums, int start, int end) {
        int rob = 0;       // Max money if we rob current house
        int notRob = 0;    // Max money if we don't rob current house
        
        for (int i = start; i <= end; i++) {
            int currRob = notRob + nums[i];    // If we rob this house
            int currNotRob = Math.max(rob, notRob);  // If we don't rob this house
            
            rob = currRob;
            notRob = currNotRob;
        }
        
        return Math.max(rob, notRob);
    }
}
// @lc code=end

