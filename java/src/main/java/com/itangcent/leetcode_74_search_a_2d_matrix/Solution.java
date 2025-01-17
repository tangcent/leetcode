/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

package com.itangcent.leetcode_74_search_a_2d_matrix;

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) {
            return false;
        }
        int n = matrix[0].length;
        if (n == 0) {
            return false;
        }

        int lRow = 0;
        int hRow = m - 1;
        while (lRow < hRow) {
            int mid = (lRow + hRow + 1) / 2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] > target) {
                hRow = mid - 1;
            } else if (lRow == mid) {
                break;
            } else {
                lRow = mid;
            }
        }
        int[] row = matrix[lRow];
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (row[mid] == target) {
                return true;
            } else if (row[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return row[left] == target;
    }
}
// @lc code=end 