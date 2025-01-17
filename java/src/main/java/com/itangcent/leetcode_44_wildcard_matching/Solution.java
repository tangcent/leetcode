package com.itangcent.leetcode_44_wildcard_matching;
/*
 * @lc app=leetcode id=44 lang=java
 *
 * [44] Wildcard Matching
 */

// @lc code=start
class Solution {
    //acc | a*c
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int j = 0; j < n; j++) {
            if (p.charAt(j) == '*') {
                dp[0][j + 1] = dp[0][j];
            } else {
                break;
            }
        }

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                //System.out.println("i: " + i + "(" + s.charAt(i) + ")" + " j: " + j + "(" + p.charAt(j) + ")");
                if (p.charAt(j) == '*') {
                    dp[i + 1][j + 1] = dp[i][j] || dp[i + 1][j] || dp[i][j + 1];
                } else if (p.charAt(j) == '?' || s.charAt(i) == p.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j];
                }
            }
        }
        return dp[m][n];
    }
}
// @lc code=end 