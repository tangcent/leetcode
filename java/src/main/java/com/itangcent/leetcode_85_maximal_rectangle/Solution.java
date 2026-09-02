package com.itangcent.leetcode_85_maximal_rectangle;

/*
 * @lc app=leetcode id=85 lang=java
 *
 * [85] Maximal Rectangle
 */

// @lc code=start
class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int wL = matrix.length;
        int hL = matrix[0].length;
        int[][] heightMatrix = new int[wL][];
        for (int i = 0; i < wL; i++) {
            int[] heights = new int[hL];
            heightMatrix[i] = heights;
            int h = 0;
            for (int j = hL - 1; j >= 0; j--) {
                if (matrix[i][j] == '0') {
                    heightMatrix[i][j] = 0;
                    h = 0;
                } else {
                    heightMatrix[i][j] = ++h;
                }
            }
        }

        int maxArea = 0;
        for (int j = 0; j < hL; j++) {
            int preH = 0;
            for (int i = 0; i < wL; i++) {
                int h = heightMatrix[i][j];
                if (h <= preH) {
                    preH = h;
                    continue;
                }
                preH = h;
                maxArea = Math.max(maxArea, calculateMaxArea(heightMatrix, i, j));
            }
        }

        return maxArea;
    }


    private int calculateMaxArea(int[][] heightMatrix, int x, int y) {
        int maxHeight = heightMatrix[x][y];
        int maxArea = maxHeight;
        for (int i = x + 1; i < heightMatrix.length; i++) {
            int h = heightMatrix[i][y];
            if (h == 0) {
                break;
            }
            maxHeight = Math.min(maxHeight, h);
            maxArea = Math.max(maxHeight * (i - x + 1), maxArea);
        }
        return maxArea;
    }
}
// @lc code=end 