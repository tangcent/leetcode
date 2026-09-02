package com.itangcent.leetcode_300_longest_increasing_subsequence;


/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        // index(count) -> latest_num
        int[] counts = new int[nums.length + 1];
        int maxCount = 1;
        counts[0] = Integer.MIN_VALUE;
        counts[1] = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            int num = nums[i];
            if (num > counts[maxCount]) {
                counts[maxCount + 1] = num;
                ++maxCount;
            }
            for (int count = maxCount - 1; count >= 0; count--) {
                if (num > counts[count] && counts[count + 1] > num) {
                    counts[count + 1] = num;
                }
            }
        }

        return maxCount;
    }
}
// @lc code=end

