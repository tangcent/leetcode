package com.itangcent.leetcode_118_pascals_triangle;


/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<Integer> firstLine = Collections.singletonList(1);
        if (numRows == 1) {
            return Collections.singletonList(firstLine);
        }
        List<List<Integer>> result = new ArrayList<>(numRows);
        result.add(firstLine);

        List<Integer> row = firstLine;
        for (int i = 1; i < numRows; i++) {
            row = generateNext(row);
            result.add(row);
        }
        return result;
    }

    public List<Integer> generateNext(List<Integer> row) {
        List<Integer> result = new ArrayList<>(row.size() + 1);
        int pre = 0;
        for (int i = 0; i < row.size(); i++) {
            int cur = row.get(i);
            result.add(pre + cur);
            pre = cur;
        }
        result.add(1);
        return result;
    }
}
// @lc code=end

