package com.itangcent.leetcode_63_unique_paths_ii;

/*
 * @lc app=leetcode id=63 lang=java
 *
 * [63] Unique Paths II
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        for (int i = 0; i < m; ++i) {
            if (obstacleGrid[i][0] != 1) {
                obstacleGrid[i][0] = -1;
            } else {
                break;
            }
        }

        for (int i = 0; i < n; ++i) {
            if (obstacleGrid[0][i] != 1) {
                obstacleGrid[0][i] = -1;
            } else {
                break;
            }
        }

        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                if (obstacleGrid[i][j] == 1) {
                    continue;
                }
                obstacleGrid[i][j] = raw(obstacleGrid[i - 1][j]) + raw(obstacleGrid[i][j - 1]);
            }
        }

        return -raw(obstacleGrid[m - 1][n - 1]);
    }

    private int raw(int a) {
        return a == 1 ? 0 : a;
    }
}
// @lc code=end 