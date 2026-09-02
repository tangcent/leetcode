package com.itangcent.leetcode_198_house_robber;


/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int rob = 0;
        int notRob = 0;
        for (int num : nums) {
            int curRob = notRob + num;
            int curNotRob = Math.max(rob, notRob);

            rob = curRob;
            notRob = curNotRob;
        }

        return Math.max(rob, notRob);
    }
}
// @lc code=end

