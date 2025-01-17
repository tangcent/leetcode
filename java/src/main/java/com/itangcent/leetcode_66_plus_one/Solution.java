package com.itangcent.leetcode_66_plus_one;

/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            int digit = digits[i];
            int sum = digit + 1;
            if (sum == 10) {
                digits[i] = 0;
            } else {
                digits[i] = sum;
                break;
            }
        }
        if (digits[0] == 0) {
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1;
            System.arraycopy(digits, 0, newDigits, 1, n);
            return newDigits;
        }
        return digits;
    }
}
// @lc code=end 