package com.itangcent.leetcode_190_reverse_bits;


/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {
    static int[] marks = new int[32];

    static {
        for (int i = 0; i < 32; i++) {
            marks[i] = (1 << i);
        }
    }

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & marks[i]) != 0) {
                result |= marks[31 - i];
            }
        }
        return result;
    }
}
// @lc code=end

