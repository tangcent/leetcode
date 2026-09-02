package com.itangcent.leetcode_50_pow_x_n;
/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

import java.util.Stack;

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        if(x == 1.0){
            return 1.0;
        }

        if (n == Integer.MIN_VALUE) {
            return 1.0 / (myPow(x, Integer.MAX_VALUE) * x);
        }
        
        if (n < 0) {
            return 1.0 / myPow(x, -n);
        }

        if (n == 0) {
            return 1.0;
        }

        Stack<Integer> stack = new Stack<>();
        while (n > 1) {
            stack.push(n % 2);
            n /= 2;
        }

        double res = x;
        while (!stack.isEmpty()) {
            res *= res;
            int bit = stack.pop();
            if (bit == 1) {
                res *= x;
            }
        }
        return res;
    }
}
// @lc code=end