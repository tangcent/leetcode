package com.itangcent.leetcode_357_count_numbers_with_unique_digits;


/*
 * @lc app=leetcode id=357 lang=java
 *
 * [357] Count Numbers with Unique Digits
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {
    private static Map<Integer, Integer> cache = new HashMap<>();

    static {
        cache.put(0, 1);
        cache.put(1, 10);
    }

    public int countNumbersWithUniqueDigits(int n) {
        if (cache.containsKey(n)) return cache.get(n);

        if (n > 10) {
            return countNumbersWithUniqueDigits(10);
        }

        int res = 9;
        for (int i = 1; i < n; i++) {
            res *= 10 - i;
        }
        res += countNumbersWithUniqueDigits(n - 1);
        cache.put(n, res);
        return res;
    }
}
// @lc code=end

