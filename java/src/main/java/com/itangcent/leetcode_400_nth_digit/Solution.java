package com.itangcent.leetcode_400_nth_digit;


/*
 * @lc app=leetcode id=400 lang=java
 *
 * [400] Nth Digit
 */

// @lc code=start
class Solution {
    public int findNthDigit(int n) {
        long base = 1;
        long length = 1;
        long numbers = 9;
        long digits = length * numbers;

        //1-9: 9
        //10-99: 90
        //100-999: 900
        long nLong = n;
        while (nLong > digits) {
            nLong -= digits;

            base *= 10;
            ++length;
            numbers *= 10;
            digits = length * numbers;
        }

        long offset = ((nLong - 1) / length);
        int index = (int)((nLong - 1) % length);
        return String.valueOf(base + offset).charAt(index) - '0';
    }
}
// @lc code=end

