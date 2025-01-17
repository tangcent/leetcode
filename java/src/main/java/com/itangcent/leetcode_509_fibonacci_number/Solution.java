package com.itangcent.leetcode_509_fibonacci_number;


/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {
    private static Map<Integer, Integer> cache = new HashMap<>();

    static {
        cache.put(0, 0);
        cache.put(1, 1);
    }

    public int fib(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int num = fib(n - 1) + fib(n - 2);
        cache.put(n, num);
        return num;
    }
}
// @lc code=end

