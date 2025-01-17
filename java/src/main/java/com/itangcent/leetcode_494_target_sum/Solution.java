package com.itangcent.leetcode_494_target_sum;


/*
 * @lc app=leetcode id=494 lang=java
 *
 * [494] Target Sum
 */

// @lc code=start
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        // If target is outside possible range or sum is odd and target is even (or vice versa)
        if (Math.abs(target) > sum || (sum + target) % 2 != 0) {
            return 0;
        }
        
        // Find subset with sum = (sum + target) / 2
        int subsetSum = (sum + target) / 2;
        
        // DP table where dp[j] = number of ways to get sum j
        int[] dp = new int[subsetSum + 1];
        dp[0] = 1; // Empty subset sums to 0
        
        for (int num : nums) {
            for (int j = subsetSum; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        
        return dp[subsetSum];
    }
}
// @lc code=end

