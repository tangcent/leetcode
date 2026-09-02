package com.itangcent.leetcode_54_spiral_matrix;

import java.util.List;
import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
//
//        // Test case 1: [[1,2,3],[4,5,6],[7,8,9]]
//        System.out.println("Test case 1: [[1,2,3],[4,5,6],[7,8,9]]");
//        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
//        List<Integer> result1 = solution.spiralOrder(matrix1);
//        System.out.println("Result: " + result1);
//        System.out.println();

        // Test case 2: [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
        System.out.println("Test case 2: [[1,2,3,4],[5,6,7,8],[9,10,11,12]]");
        int[][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> result2 = solution.spiralOrder(matrix2);
        System.out.println("Result: " + result2);
        System.out.println();

        // Test case 3: [[1]]
        System.out.println("Test case 3: [[1]]");
        int[][] matrix3 = {{1}};
        List<Integer> result3 = solution.spiralOrder(matrix3);
        System.out.println("Result: " + result3);
        System.out.println();

        // Test case 4: [[1,2],[3,4]]
        System.out.println("Test case 4: [[1,2],[3,4]]");
        int[][] matrix4 = {{1,2},{3,4}};
        List<Integer> result4 = solution.spiralOrder(matrix4);
        System.out.println("Result: " + result4);
        System.out.println();
    }
} 