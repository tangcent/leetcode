package com.itangcent.leetcode_397_integer_replacement;


/*
 * @lc app=leetcode id=397 lang=java
 *
 * [397] Integer Replacement
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {
    private static Map<Long, Integer> cache = new HashMap<>();

    static {
        cache.put(1L, 0);
    }

    public int integerReplacement(int n) {
        return integerReplacement((long) n);
    }

    public int integerReplacement(long n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int res;
        if ((n & 1) == 1) {
            res = Math.min(integerReplacement(n + 1), integerReplacement(n - 1)) + 1;
        } else {
            res = integerReplacement(n >> 1) + 1;
        }
        cache.put(n, res);
        return res;
    }
}
// @lc code=end

