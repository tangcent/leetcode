package com.itangcent.leetcode_209_minimum_size_subarray_sum;


/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        while (right < len) {
            sum += nums[right++];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left);
                int nextIndex = left++;
                if (nextIndex == len) {
                    break;
                }
                sum -= nums[nextIndex];
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
// @lc code=end

