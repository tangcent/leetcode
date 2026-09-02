package com.itangcent.leetcode_69_sqrt_x;

/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        long target = (long) x;
        long left = 0, right = target;
        while (left < right) {
            long mid = left + (right - left + 1) / 2;
            long product = mid * mid;
            if (product > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        while (right * right > target) {
            --right;
        }
        return (int) right;
    }
}
// @lc code=end 