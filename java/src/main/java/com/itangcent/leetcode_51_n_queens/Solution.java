package com.itangcent.leetcode_51_n_queens;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode id=51 lang=java
 *
 * [51] N-Queens
 */

// @lc code=start
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        Set<Integer> lDiagonals = new HashSet<>();
        Set<Integer> rDiagonals = new HashSet<>();

        int[] qIndexes = new int[n];
        backtrack(result, qIndexes, rows, cols, lDiagonals, rDiagonals, 0, n);
        return result;
    }

    private void backtrack(
            List<List<String>> result,
            int[] qIndexes,
            Set<Integer> rows,
            Set<Integer> cols,
            Set<Integer> lDiagonals,
            Set<Integer> rDiagonals,
            int row,
            int n) {
        if (row == n) {
            result.add(toString(qIndexes, n));
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

    private List<String> toString(int[] indexes, int n) {
        List<String> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int index = indexes[i];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j == index) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            result.add(sb.toString());
        }
        return result;
    }
}
// @lc code=end 