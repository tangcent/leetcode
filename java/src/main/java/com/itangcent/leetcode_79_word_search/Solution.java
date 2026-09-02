package com.itangcent.leetcode_79_word_search;
/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            boolean[] rows = new boolean[n];
            visited[i] = rows;
            Arrays.fill(rows, false);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, visited, i, j, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private boolean dfs(char[][] board,
                        boolean[][] visited,
                        int row, int col,
                        String word,
                        int index
    ) {
        if (index == word.length()) return true;
        if (board[row][col] != word.charAt(index)) return false;
        if (index == word.length() - 1) return true;

        visited[row][col] = true;
        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length) {
                if (!visited[newRow][newCol] && dfs(board, visited, newRow, newCol, word, index + 1)) {
                    return true;
                }
            }
        }
        visited[row][col] = false;
        return false;
    }
}
// @lc code=end

