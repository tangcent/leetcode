package com.itangcent.leetcode_137_single_number_ii;


/*
 * @lc app=leetcode id=137 lang=java
 *
 * [137] Single Number II
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int[] bitCounts = new int[32];

        // Count number of 1s at this bit position
        for (int num : nums) {
            int n = num;
            for (int i = 0; i < 32; i++) {
                bitCounts[i] += n & 1;
                n = n >> 1;
                if (n == 0) {
                    break; // No more bits to process
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 32; i++) {
            // If the count of 1s at this bit position is not a multiple of 3,
            // it means this bit is part of the single number
            if (bitCounts[i] % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}
// @lc code=end

