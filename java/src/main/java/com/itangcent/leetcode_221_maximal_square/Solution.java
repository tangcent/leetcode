package com.itangcent.leetcode_221_maximal_square;


/*
 * @lc app=leetcode id=221 lang=java
 *
 * [221] Maximal Square
 */

// @lc code=start
class Solution {
    public int maximalSquare(char[][] matrix) {
        // Handle edge cases
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        // dp[i][j] represents the side length of max square whose bottom right corner is the cell at position (i-1,j-1)
        // We use m+1 and n+1 to avoid boundary checks
        int[][] dp = new int[m + 1][n + 1];
        int maxSide = 0; // Keep track of the maximum side length found

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    // The key DP formula: consider the three adjacent squares (left, top, and top-left diagonal)
                    // The smallest of these three values determines how large a square we can make
                    // Adding 1 to include the current cell

                    // For example:
                    // [1, 1, 1]
                    // [1, 2, 2]
                    // [1, 2, 3]
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    maxSide = Math.max(maxSide, dp[i][j]); // Update the maximum side length
                }
            }
        }

        // Return the area of the largest square
        return maxSide * maxSide;
    }
}
// @lc code=end


