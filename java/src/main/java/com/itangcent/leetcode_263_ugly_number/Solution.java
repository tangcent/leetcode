package com.itangcent.leetcode_263_ugly_number;


/*
 * @lc app=leetcode id=263 lang=java
 *
 * [263] Ugly Number
 */

// @lc code=start
class Solution {
    private static int[] factors = {2, 3, 5};

    public boolean isUgly(int n) {
        for (int factor : factors) {
            while (n!=0 && n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
// @lc code=end

