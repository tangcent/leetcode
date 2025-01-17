package com.itangcent.leetcode_132_palindrome_partitioning_ii;


/*
 * @lc app=leetcode id=132 lang=java
 *
 * [132] Palindrome Partitioning II
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {
    public int minCut(String s) {
        if (s.isEmpty()) return 0;

        cache.clear();

        char[] chars = s.toCharArray();
        int length = chars.length;
        int[][] dp = new int[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = 1;
        }
        for (int i = 0; i < length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                dp[i][i + 1] = 1;
            }
        }
        for (int i = length - 2; i >= 0; i--) {
            for (int j = i + 2; j < length; j++) {
                if (chars[i] == chars[j]) {
                    dp[i][j] = dp[i + 1][j - 1];
                }
            }
        }

        return backtrack(dp, chars, 0) - 1;
    }

    private final Map<Integer, Integer> cache = new HashMap<>();

    private int backtrack(int[][] dp,
                          char[] chars,
                          int start) {
        if (start == chars.length) {
            return 0;
        }
        if (cache.containsKey(start)) {
            return cache.get(start);
        }
        int min = Integer.MAX_VALUE;
        for (int i = start; i < chars.length; i++) {
            if (dp[start][i] == 1) {
                min = Math.min(min, backtrack(dp, chars, i + 1));
            }
        }
        int splits = min + 1;
        cache.put(start, splits);
        return splits;
    }
}
// @lc code=end

