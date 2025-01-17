package com.itangcent.leetcode_516_longest_palindromic_subsequence;

/*
 * @lc app=leetcode id=516 lang=java
 *
 * [516] Longest Palindromic Subsequence
 */

// @lc code=start
class Solution {
    public int longestPalindromeSubseq(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int n = s.length();
        int[][] dp = new int[n][n];

        // Fill DP table from bottom to top (i decreases)
        // and left to right (j increases) to ensure dependencies are computed first
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1; // Base case: single character is always palindrome of length 1
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    // When characters match, length is 2 + best subsequence inside
                    dp[i][j] = 2 + dp[i + 1][j - 1]; // dp[i+1][j-1] is already computed
                } else {
                    // When characters don't match, take max of excluding either character
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]); // Both are already computed
                }
            }
        }
        return dp[0][n - 1]; // Result for entire string
    }
}
// @lc code=end
