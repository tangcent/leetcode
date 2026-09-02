package com.itangcent.leetcode_130_surrounded_regions;


/*
 * @lc app=leetcode id=130 lang=java
 *
 * [130] Surrounded Regions
 */
// @lc code=start
class Solution {

    private static final char MARK = 'E';
    private static final char O = 'O';

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        // 1. DFS to mark the 'O's connected to the border
        int[] mEdges = new int[]{0, m - 1};
        int[] nEdges = new int[]{0, n - 1};
        for (int x : mEdges) {
            for (int j = 0; j < n; j++) {
                if (board[x][j] == O) {
                    dfs(board, x, j);
                }
            }
        }
        for (int y : nEdges) {
            for (int i = 0; i < m; i++) {
                if (board[i][y] == O) {
                    dfs(board, i, y);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == O) {
                    board[i][j] = 'X'; // 2. Change the surrounded 'O's to 'X's
                } else if (board[i][j] == MARK) {
                    board[i][j] = O; // 3. Change the marked 'O's back to 'O's
                }
            }
        }
    }

    private int[][] directions = new int[][]{
            {-1, 0}, // up
            {1, 0},  // down
            {0, -1}, // left
            {0, 1}   // right
    };

    private void dfs(char[][] board,
                     int i,
                     int j) {
        if (board[i][j] != O) {
            return;
        }
        board[i][j] = MARK;
        int m = board.length;
        int n = board[0].length;
        for (int[] direction : directions) {
            int x = i + direction[0];
            if (x < 0 || x >= m) {
                continue;
            }
            int y = j + direction[1];
            if (y < 0 || y >= n) {
                continue;
            }
            dfs(board, x, y);
        }
    }
}
// @lc code=end

