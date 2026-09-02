package com.itangcent.leetcode_201_bitwise_and_of_numbers_range;


/*
 * @lc app=leetcode id=201 lang=java
 *
 * [201] Bitwise AND of Numbers Range
 */

// @lc code=start
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        // Find the common prefix
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        // Left shift back by the number of shifts we made
        return left << shift;
    }
}
// @lc code=end

