package com.itangcent.leetcode_268_missing_number;


/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a ^= nums[i];
            a ^= i;
        }
        a ^= nums.length;
        return a;
    }
}
// @lc code=end

