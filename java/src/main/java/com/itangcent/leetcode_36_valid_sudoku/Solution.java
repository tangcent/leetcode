package com.itangcent.leetcode_36_valid_sudoku;

/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] row = new int[9];
        int[] col = new int[9];
        int[] box = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    int index = (i / 3) * 3 + j / 3;
                    if ((row[i] & (1 << num)) != 0 || (col[j] & (1 << num)) != 0 || (box[index] & (1 << num)) != 0) {
                        return false;
                    }
                    row[i] |= 1 << num;
                    col[j] |= 1 << num;
                    box[index] |= 1 << num;
                }
            }
        }
        return true;
    }
}
// @lc code=end

