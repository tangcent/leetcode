package com.itangcent.leetcode_54_spiral_matrix;

/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int size = matrix.length * matrix[0].length;
        List<Integer> result = new ArrayList<>(size);
        while (true) {
            for (int i = left; i <= right; ++i) {
                result.add(matrix[top][i]);
            }
            if (result.size() == size) {
                break;
            }
            ++top;
            for (int i = top; i <= bottom; ++i) {
                result.add(matrix[i][right]);
            }
            if (result.size() == size) {
                break;
            }
            --right;
            for (int i = right; i >= left; --i) {
                result.add(matrix[bottom][i]);
            }
            if (result.size() == size) {
                break;
            }
            --bottom;
            for (int i = bottom; i >= top; --i) {
                result.add(matrix[i][left]);
            }
            if (result.size() == size) {
                break;
            }
            ++left;
        }
        return result;
    }
}
// @lc code=end

