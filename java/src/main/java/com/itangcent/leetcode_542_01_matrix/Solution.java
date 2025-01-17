package com.itangcent.leetcode_542_01_matrix;


/*
 * @lc app=leetcode id=542 lang=java
 *
 * [542] 01 Matrix
 */

// @lc code=start
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    res[i][j] = 0;
                } else {
                    res[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] == 0) {
                    dfs(res, i, j);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] == Integer.MAX_VALUE) {
                    res[i][j] = 1;
                }
            }
        }

        return res;
    }

    private static final int[][] directions = new int[][]{
            new int[]{0, -1},
            new int[]{0, 1},
            new int[]{1, 0},
            new int[]{-1, 0}
    };

    private void dfs(int[][] mat, int i, int j) {
        int nextDistance = mat[i][j] + 1;
        for (int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            if (x < 0 || x >= mat.length || y < 0 || y >= mat[0].length) {
                continue;
            }
            int val = mat[x][y];
            if (val > nextDistance) {
                mat[x][y] = nextDistance;
                dfs(mat, x, y);
            }
        }
    }
}
// @lc code=end

