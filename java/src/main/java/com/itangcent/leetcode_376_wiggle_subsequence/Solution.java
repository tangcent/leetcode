package com.itangcent.leetcode_376_wiggle_subsequence;

/*
 * @lc app=leetcode id=376 lang=java
 *
 * [376] Wiggle Subsequence
 */

// @lc code=start
class Solution {
    public int wiggleMaxLength(int[] nums) {
        // Handle edge cases: empty array or single element
        if (nums.length < 2) {
            return nums.length;
        }
        
        // Calculate initial difference between first two elements
        int prevDiff = nums[1] - nums[0];
        // Initialize count: 2 if different, 1 if same
        int count = prevDiff != 0 ? 2 : 1;
        
        // Iterate through the array starting from third element
        for (int i = 2; i < nums.length; i++) {
            // Calculate current difference between consecutive elements
            int diff = nums[i] - nums[i - 1];
            
            /*
             * Check for wiggle:
             * 1. If previous trend was flat or decreasing, and current is increasing
             * 2. Or if previous trend was flat or increasing, and current is decreasing
             * We only need to compare consecutive elements because:
             * - A wiggle sequence alternates between increasing and decreasing
             * - The trend between i and i-1 determines if we have a new peak/valley
             * - We don't need to look further back because prevDiff tracks the last valid trend
             */
            if ((diff > 0 && prevDiff <= 0) || (diff < 0 && prevDiff >= 0)) {
                count++;  // Found a new wiggle
                prevDiff = diff;  // Update the last valid trend
            }
            // Note: We skip equal consecutive elements as they don't affect the wiggle count
        }
        
        return count;
    }
}
// @lc code=end
