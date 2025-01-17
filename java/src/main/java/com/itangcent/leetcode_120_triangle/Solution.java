package com.itangcent.leetcode_120_triangle;


/*
 * @lc app=leetcode id=120 lang=java
 *
 * [120] Triangle
 */

import java.util.List;

// @lc code=start
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        for (int i = 1; i < size; i++) {
            List<Integer> preRow = triangle.get(i - 1);
            List<Integer> row = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                row.set(j, row.get(j) + Math.min(
                        j > 0 ? preRow.get(j - 1) : Integer.MAX_VALUE,
                        j != i ? preRow.get(j) : Integer.MAX_VALUE
                ));
            }
        }

        List<Integer> lastRow = triangle.get(size - 1);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            min = Math.min(min, lastRow.get(i));
        }
        return min;
    }
}
// @lc code=end

