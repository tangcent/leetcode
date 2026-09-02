package com.itangcent.leetcode_202_happy_number;


/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

import java.util.HashSet;

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> tempNums = new HashSet<>();
        while (tempNums.add(n)) {
            n = calculate(n);
            if (n == 1) return true;
        }
        return false;
    }

    private int calculate(int num) {
        int res = 0;
        while (num > 0) {
            int ret = num % 10;
            if (ret != 0) {
                res += ret * ret;
            }
            num = num / 10;
        }
        return res;
    }
}
// @lc code=end

