package com.itangcent.leetcode_440_k_th_smallest_in_lexicographical_order;


/*
 * @lc app=leetcode id=440 lang=java
 *
 * [440] K-th Smallest in Lexicographical Order
 */

// @lc code=start
class Solution {
    public int findKthNumber(int n, int k) {
        long curr = 1;
        k--;

        while (k > 0) {
            long steps = calculateSteps(n, curr);
            if (steps <= k) {
                curr += 1;
                k -= steps;
            } else {
                curr *= 10;
                k--;
            }
        }

        return (int) curr;
    }

    private long calculateSteps(long n, long curr) {
        long next = curr + 1;
        long steps = 0;
        while (curr <= n) {
            steps += Math.min(n + 1, next) - curr;
            curr *= 10;
            next *= 10;
        }
        return steps;
    }
}
// @lc code=end
