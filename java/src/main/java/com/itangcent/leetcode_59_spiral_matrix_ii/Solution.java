package com.itangcent.leetcode_59_spiral_matrix_ii;

/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;++i){
            matrix[i] = new int[n];
        }

        int size = n*n;
        int num = 0;

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        while(true){
            for(int i=left;i<=right;++i){
                matrix[top][i] = ++num;
            }
            if(num == size){
                break;
            }
            ++top;

            for(int i=top;i<=bottom;++i){
                matrix[i][right] = ++num;
            }
            if(num == size){
                break;
            }
            --right;

            for(int i=right;i>=left;--i){
                matrix[bottom][i] = ++num;
            }
            if(num == size){
                break;
            }
            --bottom;

            for(int i=bottom;i>=top;--i){
                matrix[i][left] = ++num;
            }
            if(num == size){
                break;
            }
            ++left;
        }

        return matrix;
    }
}
// @lc code=end 