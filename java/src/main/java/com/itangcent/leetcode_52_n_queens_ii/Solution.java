package com.itangcent.leetcode_52_n_queens_ii;

/*
 * @lc app=leetcode id=52 lang=java
 *
 * [52] N-Queens II
 */

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// @lc code=start
class Solution {
    public int totalNQueens(int n) {
        AtomicInteger count = new AtomicInteger(0);

        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        Set<Integer> lDiagonals = new HashSet<>();
        Set<Integer> rDiagonals = new HashSet<>();

        int[] qIndexes = new int[n];
        backtrack(count, qIndexes, rows, cols, lDiagonals, rDiagonals, 0, n);
        return count.get();
    }

    private void backtrack(
            AtomicInteger result,
            int[] qIndexes,
            Set<Integer> rows,
            Set<Integer> cols,
            Set<Integer> lDiagonals,
            Set<Integer> rDiagonals,
            int row,
            int n) {
        if (row == n) {
            result.incrementAndGet();
            return;
        }

        for (int col = 0; col < n; col++) {
            if (rows.contains(row) || cols.contains(col) || lDiagonals.contains(row - col) || rDiagonals.contains(row + col)) {
                continue;
            }

            qIndexes[row] = col;
            rows.add(row);
            cols.add(col);
            lDiagonals.add(row - col);
            rDiagonals.add(row + col);

            backtrack(result, qIndexes, rows, cols, lDiagonals, rDiagonals, row + 1, n);

            rows.remove(row);
            cols.remove(col);
            lDiagonals.remove(row - col);
            rDiagonals.remove(row + col);
        }
    }
}
// @lc code=end 