package com.itangcent.leetcode_48_rotate_image;
/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            transpose(matrix, i, i, n - i - 1);
        }
    }

    private void transpose(int[][] matrix, int row, int start, int end) {
        int n = matrix.length - 1;
        for (int i = start; i < end; i++) {
            int temp = matrix[row][i];
            matrix[row][i] = matrix[n - i][row];
            matrix[n - i][row] = matrix[n - row][n - i];
            matrix[n - row][n - i] = matrix[i][n - row];
            matrix[i][n - row] = temp;
        }
    }
}
// @lc code=end

