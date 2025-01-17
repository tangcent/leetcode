package com.itangcent.leetcode_289_game_of_life;


/*
 * @lc app=leetcode id=289 lang=java
 *
 * [289] Game of Life
 */

// @lc code=start
class Solution {
    private static int DIE = 0;
    private static int LIVE = 1;
    private static int LIVE_LIVE = 2;
    private static int LIVE_DIE = 3;
    private static int DIE_LIVE = 4;
    private static int DIE_DIE = 5;

    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int lives = countLives(board, i, j);
                if (isLive(board[i][j])) {
                    if (lives < 2 || lives > 3) {
                        board[i][j] = toDie(board[i][j]);
                    } else {
                        board[i][j] = toLive(board[i][j]);
                    }
                } else {
                    if (lives == 3) {
                        board[i][j] = toLive(board[i][j]);
                    } else {
                        board[i][j] = toDie(board[i][j]);
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isStillLive(board[i][j])) {
                    board[i][j] = LIVE;
                } else {
                    board[i][j] = DIE;
                }
            }
        }
    }

    private final int[][] directions = new int[][]{
            new int[]{-1, -1},
            new int[]{-1, 0},
            new int[]{-1, 1},
            new int[]{0, 1},
            new int[]{0, -1},
            new int[]{1, -1},
            new int[]{1, 0},
            new int[]{1, 1},
    };

    private int countLives(int[][] board, int i, int j) {
        int num = 0;
        for (int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
                continue;
            }
            if (isLive(board[x][y])) {
                ++num;
            }
        }
        return num;
    }

    private boolean isLive(int val) {
        return val == LIVE || val == LIVE_LIVE || val == LIVE_DIE;
    }

    private int toLive(int val) {
        if (isLive(val)) {
            return LIVE_LIVE;
        } else {
            return DIE_LIVE;
        }
    }

    private int toDie(int val) {
        if (isLive(val)) {
            return LIVE_DIE;
        } else {
            return DIE_DIE;
        }
    }

    private boolean isStillLive(int val) {
        return val == DIE_LIVE || val == LIVE_LIVE;
    }
}
// @lc code=end

