package com.itangcent.leetcode_334_increasing_triplet_subsequence;


/*
 * @lc app=leetcode id=334 lang=java
 *
 * [334] Increasing Triplet Subsequence
 */

// @lc code=start
class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        int minNum = nums[0];
        int[] minTwoNum = new int[]{minNum, Integer.MAX_VALUE};

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num > minTwoNum[1]) {
                return true;
            }

            if (num > minTwoNum[0]) {
                minTwoNum[1] = num;
            }

            if (num > minNum && num < minTwoNum[1]) {
                minTwoNum[0] = minNum;
                minTwoNum[1] = num;
            }

            if (num < minNum) {
                minNum = num;
            }
        }
        return false;
    }
}
// @lc code=end

