package com.itangcent.leetcode_59_spiral_matrix_ii;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: n = 3
        System.out.println("Test case 1: n = 3");
        int[][] result1 = solution.generateMatrix(3);
        System.out.println("Result: " + Arrays.deepToString(result1));
        System.out.println();

        // Test case 2: n = 1
        System.out.println("Test case 2: n = 1");
        int[][] result2 = solution.generateMatrix(1);
        System.out.println("Result: " + Arrays.deepToString(result2));
        System.out.println();

        // Test case 3: n = 4
        System.out.println("Test case 3: n = 4");
        int[][] result3 = solution.generateMatrix(4);
        System.out.println("Result: " + Arrays.deepToString(result3));
        System.out.println();
    }
} 