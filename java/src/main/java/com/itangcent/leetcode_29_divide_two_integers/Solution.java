package com.itangcent.leetcode_29_divide_two_integers;
/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        // Handle special cases
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            return -dividend;
        }

        // Convert to long to handle MIN_VALUE case
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int sign = (dividend > 0) ^ (divisor > 0) ? -1 : 1;
        int result = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            long multiple = 1;

            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            dvd -= temp;
            result += multiple;
        }

        return sign * result;
    }
}
// @lc code=end

