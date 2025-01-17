package com.itangcent.leetcode_498_diagonal_traverse;

import java.util.Arrays;

/**
 * Test class for the solution to LeetCode problem #498: diagonal-traverse
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #498: diagonal-traverse");
        
        // Test case 1: 3x3 matrix
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[] expected1 = {1, 2, 4, 7, 5, 3, 6, 8, 9};
        int[] result1 = solution.findDiagonalOrder(matrix1);
        
        System.out.println("Test case for 3x3 matrix: " + 
                           (Arrays.equals(result1, expected1) ? "PASSED" : "FAILED"));
        if (!Arrays.equals(result1, expected1)) {
            System.out.println("  Expected: " + Arrays.toString(expected1));
            System.out.println("  Actual: " + Arrays.toString(result1));
        }
        
        // Test case 2: 1x1 matrix
        int[][] matrix2 = {{1}};
        int[] expected2 = {1};
        int[] result2 = solution.findDiagonalOrder(matrix2);
        
        System.out.println("Test case for 1x1 matrix: " + 
                           (Arrays.equals(result2, expected2) ? "PASSED" : "FAILED"));
        
        // Test case 3: Non-square matrix
        int[][] matrix3 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[] expected3 = {1, 2, 4, 5, 3, 6};
        int[] result3 = solution.findDiagonalOrder(matrix3);
        
        System.out.println("Test case for 2x3 matrix: " + 
                           (Arrays.equals(result3, expected3) ? "PASSED" : "FAILED"));
        if (!Arrays.equals(result3, expected3)) {
            System.out.println("  Expected: " + Arrays.toString(expected3));
            System.out.println("  Actual: " + Arrays.toString(result3));
        }
        
        // Test case 4: Single column matrix
        int[][] matrix4 = {{1}, {2}, {3}, {4}};
        int[] expected4 = {1, 2, 3, 4};
        testDiagonalTraverse(solution, matrix4, expected4, "Single column matrix");
        
        // Test case 5: Rectangle matrix (not square)
        int[][] matrix5 = {{1, 2, 3}, {4, 5, 6}};
        int[] expected5 = {1, 2, 4, 5, 3, 6};
        testDiagonalTraverse(solution, matrix5, expected5, "Rectangle matrix 2x3");
    }
    
    private static void testDiagonalTraverse(Solution solution, int[][] matrix, int[] expected, String caseName) {
        int[] result = solution.findDiagonalOrder(matrix);
        boolean success = Arrays.equals(expected, result);
        
        System.out.println("Test case for " + caseName + ": " + (success ? "PASSED" : "FAILED"));
        
        if (!success) {
            System.out.println("  Expected: " + Arrays.toString(expected));
            System.out.println("  Actual: " + Arrays.toString(result));
        }
    }
}
