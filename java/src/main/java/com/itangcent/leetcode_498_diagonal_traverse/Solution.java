package com.itangcent.leetcode_498_diagonal_traverse;


/*
 * @lc app=leetcode id=498 lang=java
 *
 * [498] Diagonal Traverse
 */

// @lc code=start
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int index = 0;
        
        for (int i = 0; i < m + n - 1; i++) {
            if (i % 2 == 0) { // Moving up-right
                int row = Math.min(i, m - 1);
                int col = i - row;
                
                while (row >= 0 && col < n) {
                    result[index++] = mat[row--][col++];
                }
            } else { // Moving down-left
                int col = Math.min(i, n - 1);
                int row = i - col;
                
                while (col >= 0 && row < m) {
                    result[index++] = mat[row++][col--];
                }
            }
        }
        
        return result;
    }
}
// @lc code=end

