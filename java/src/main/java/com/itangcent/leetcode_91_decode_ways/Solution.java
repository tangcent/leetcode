package com.itangcent.leetcode_91_decode_ways;

/*
 * @lc app=leetcode id=91 lang=java
 *
 * [91] Decode Ways
 */

// @lc code=start
class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0 || s.charAt(0) == '0') {
            return 0; // If the string is empty or starts with '0', no valid decoding
        }
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: empty string can be decoded in one way
        dp[1] = 1; // Single character (not '0') can be decoded in one way
        for (int i = 2; i <= n; i++) {
            char c = s.charAt(i - 1);
            char preChar = s.charAt(i - 2);
            if (c == '0') {
                if (preChar == '1' || preChar == '2') {
                    dp[i] = dp[i - 2]; // Valid two-digit decoding
                    continue;
                } else {
                    return 0; // Invalid decoding if '0' is not part of '10' or '20'
                }
            }

            if (preChar == '1' || (preChar == '2' && c <= '6')) {
                dp[i] = dp[i - 1] + dp[i - 2]; // Valid two-digit decoding
            } else {
                dp[i] = dp[i - 1]; // Only single character decoding is valid
            }
        }
        return dp[n];
    }
}
// @lc code=end

