package com.itangcent.leetcode_279_perfect_squares;


/*
 * @lc app=leetcode id=279 lang=java
 *
 * [279] Perfect Squares
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// @lc code=start
class Solution {
    private static final int[] squares = new int[100];
    private static final Map<Integer, Integer> cache = new HashMap<>();

    static {
        for (int i = 1; i <= 100; i++) {
            squares[i - 1] = i * i;
            cache.put(squares[i - 1], 1);
        }
    }

    public int numSquares(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int num = Integer.MAX_VALUE;
        for (int square : squares) {
            if (square > n) {
                break;
            }
            num = Math.min(num, 1 + numSquares(n - square));
        }
        cache.put(n, num);
        return num;
    }
}
// @lc code=end

