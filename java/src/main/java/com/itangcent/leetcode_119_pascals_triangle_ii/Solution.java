package com.itangcent.leetcode_119_pascals_triangle_ii;


/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> firstLine = Collections.singletonList(1);
        if (rowIndex == 0) {
            return firstLine;
        }
        List<Integer> result = new ArrayList<>(firstLine);
        for (int i = 0; i < rowIndex; i++) {
            generateNext(result);
        }
        return result;
    }

    public void generateNext(List<Integer> row) {
        int pre = 0;
        for (int i = 0; i < row.size(); i++) {
            int cur = row.get(i);
            row.set(i, pre + cur);
            pre = cur;
        }
        row.add(1);
    }
}
// @lc code=end

