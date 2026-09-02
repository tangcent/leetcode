package com.itangcent.leetcode_70_climbing_stairs;

/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {

    private static final Map<Integer, Integer> cache = new HashMap<>();

    static {
        cache.put(0, 1);
        cache.put(1, 1);
    }

    public int climbStairs(int n) {
        Integer result = cache.get(n);
        if (result != null) return result;
        result = climbStairs(n - 1) + climbStairs(n - 2);
        cache.put(n, result);
        return result;
    }
}
// @lc code=end 