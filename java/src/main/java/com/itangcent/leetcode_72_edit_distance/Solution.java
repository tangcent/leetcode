package com.itangcent.leetcode_72_edit_distance;

/*
 * @lc app=leetcode id=72 lang=java
 *
 * [72] Edit Distance
 */

// @lc code=start
class Solution {
    public int minDistance(String word1, String word2) {
        if (word1.length() == 0) {
            return word2.length();
        } else if (word2.length() == 0) {
            return word1.length();
        }

        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        // delete all characters in word1
        for (int i = 0; i <= word1.length(); i++) {
            dp[i][0] = i;
        }

        // insert all characters in word2
        for (int j = 0; j <= word2.length(); j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int delete = dp[i - 1][j] + 1;      // Delete from word1
                    int insert = dp[i][j - 1] + 1;      // Insert into word1
                    int replace = dp[i - 1][j - 1] + 1; // Replace character
                    dp[i][j] = Math.min(insert, Math.min(delete, replace));
                }
            }
        }

        return dp[word1.length()][word2.length()];
    }
}
// @lc code=end 