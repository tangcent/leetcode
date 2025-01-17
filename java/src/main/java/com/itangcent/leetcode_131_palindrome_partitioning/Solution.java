package com.itangcent.leetcode_131_palindrome_partitioning;


/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    public List<List<String>> partition(String s) {
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

        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();
        backtrack(dp, chars, 0, path, result);
        return result;
    }

    private void backtrack(int[][] dp,
                           char[] chars,
                           int start,
                           List<String> path,
                           List<List<String>> result) {
        if (start == chars.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < chars.length; i++) {
            if (dp[start][i] == 1) {
                path.add(new String(chars, start, i - start + 1));
                backtrack(dp, chars, i + 1, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

}
// @lc code=end

