package com.itangcent.leetcode_343_integer_break;


/*
 * @lc app=leetcode id=343 lang=java
 *
 * [343] Integer Break
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {

    private static Map<Integer, Integer> cache = new HashMap<>();

    static {
        cache.put(0, 1);
        cache.put(1, 1);
        cache.put(2, 1);
    }

    public int integerBreak(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        int max = n - 1;
        for (int i = 2; i < n; i++) {
            max = Math.max(max, (n - i) * integerBreakOrNot(i));
        }
        cache.put(n, max);
        return max;
    }

    public int integerBreakOrNot(int n) {
        return Math.max(integerBreak(n), n);
    }
}
// @lc code=end

