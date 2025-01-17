package com.itangcent.leetcode_221_maximal_square;

/**
 * Test class for the solution to LeetCode problem #221: maximal-square
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Running tests for LeetCode problem #221: maximal-square");

        // Test case 1: 2x2 square
        char[][] matrix1 = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        int result1 = solution.maximalSquare(matrix1);
        System.out.println("Test case for 2x2 square: " + (result1 == 4 ? "PASSED" : "FAILED"));
        if (result1 != 4) {
            System.out.println("Expected: 4, Actual: " + result1);
        }

        // Test case 2: Only has 1x1 squares
        char[][] matrix2 = {
                {'0', '1'},
                {'1', '0'}
        };
        int result2 = solution.maximalSquare(matrix2);
        System.out.println("Test case for 1x1 square: " + (result2 == 1 ? "PASSED" : "FAILED"));
        if (result2 != 1) {
            System.out.println("Expected: 1, Actual: " + result2);
        }

        // Test case 3: No squares (all zeros)
        char[][] matrix3 = {
                {'0', '0'},
                {'0', '0'}
        };
        int result3 = solution.maximalSquare(matrix3);
        System.out.println("Test case for no squares: " + (result3 == 0 ? "PASSED" : "FAILED"));
        if (result3 != 0) {
            System.out.println("Expected: 0, Actual: " + result3);
        }

        // Test case 4: 3x3 square
        char[][] matrix4 = {
                {'1', '1', '1', '1'},
                {'1', '1', '1', '1'},
                {'1', '1', '1', '1'}
        };
        int result4 = solution.maximalSquare(matrix4);
        System.out.println("Test case for 3x3 square: " + (result4 == 9 ? "PASSED" : "FAILED"));
        if (result4 != 9) {
            System.out.println("Expected: 9, Actual: " + result4);
        }

        // Test case 5: Empty matrix
        char[][] matrix5 = {};
        int result5 = solution.maximalSquare(matrix5);
        System.out.println("Test case for empty matrix: " + (result5 == 0 ? "PASSED" : "FAILED"));
        if (result5 != 0) {
            System.out.println("Expected: 0, Actual: " + result5);
        }
    }
}
