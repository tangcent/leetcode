package com.itangcent.leetcode_174_dungeon_game;


/*
 * @lc app=leetcode id=174 lang=java
 *
 * [174] Dungeon Game
 */

// @lc code=start
class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int h = dungeon.length;
        int w = dungeon[0].length;

        // dp[j] holds the minimum HP required when ENTERING cell (i, j),
        // such that the knight can survive from (i, j) to the bottom-right corner.
        //
        // Recurrence (filled bottom-right -> top-left):
        //   dp[i][j] = max(1, min(dp[i+1][j], dp[i][j+1]) - dungeon[i][j])
        //
        // Going backwards is essential: the requirement "HP never drops below 1"
        // couples the entry HP with everything that comes AFTER a cell, so the
        // state "cheapest entry HP for the remaining suffix" is position-only and
        // each cell is solved exactly once. A forward pass would need to carry the
        // running HP/min as part of the state, which is what caused the original
        // implementation to re-enumerate every path.
        final int INF = Integer.MAX_VALUE;
        int[] dp = new int[w + 1];
        java.util.Arrays.fill(dp, INF);

        for (int i = h - 1; i >= 0; i--) {
            for (int j = w - 1; j >= 0; j--) {
                if (i == h - 1 && j == w - 1) {
                    // Base case: entering the last cell itself.
                    dp[j] = Integer.max(1, 1 - dungeon[i][j]);
                } else {
                    // dp[j]   -> value from the row below (not yet overwritten)
                    // dp[j+1] -> value from the cell to the right (current row)
                    int bestNext = Integer.min(dp[j], dp[j + 1]);
                    dp[j] = Integer.max(1, bestNext - dungeon[i][j]);
                }
            }
        }
        return dp[0];
    }
}
// @lc code=end
