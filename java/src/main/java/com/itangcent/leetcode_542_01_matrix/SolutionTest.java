package com.itangcent.leetcode_542_01_matrix;

/**
 * Test class for the solution to LeetCode problem #542: 01-matrix
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test 1: Simple 2x2 matrix
        int[][] input1 = {{0,1},{1,0}};
        int[][] expected1 = {{0,1},{1,0}};
        int[][] result1 = solution.updateMatrix(input1);
        System.out.println("Test case for simple 2x2 matrix: " +
            (compareMatrices(result1, expected1) ? "PASSED" : "FAILED"));

        // Test 2: All zeros matrix
        int[][] input2 = {{0,0,0},{0,0,0}};
        int[][] expected2 = {{0,0,0},{0,0,0}};
        int[][] result2 = solution.updateMatrix(input2);
        System.out.println("Test case for all zeros matrix: " +
            (compareMatrices(result2, expected2) ? "PASSED" : "FAILED"));

        // Test 3: All ones matrix (except diagonal)
        int[][] input3 = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] expected3 = {{2,1,2},{1,0,1},{2,1,2}};
        validateInputMatrix(input3);
        int[][] result3 = solution.updateMatrix(input3);
        System.out.println("Test case for all ones matrix with center 0: " + 
            (compareMatrices(result3, expected3) ? "PASSED" : "FAILED"));
        
        // Test 4: Larger matrix with mixed 0s and 1s
        int[][] input4 = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] expected4 = {{0,0,0},{0,1,0},{1,2,1}};
        int[][] result4 = solution.updateMatrix(input4);
        System.out.println("Test case for larger mixed matrix: " + 
            (compareMatrices(result4, expected4) ? "PASSED" : "FAILED"));
        
        // Test 5: Single row matrix
        int[][] input5 = {{0,1,0,1,1}};
        int[][] expected5 = {{0,1,0,1,2}};
        int[][] result5 = solution.updateMatrix(input5);
        System.out.println("Test case for single row matrix: " + 
            (compareMatrices(result5, expected5) ? "PASSED" : "FAILED"));
    }
    
    private static boolean compareMatrices(int[][] actual, int[][] expected) {
        if (actual.length != expected.length) return false;
        for (int i = 0; i < actual.length; i++) {
            if (actual[i].length != expected[i].length) return false;
            for (int j = 0; j < actual[i].length; j++) {
                if (actual[i][j] != expected[i][j]) {
                    System.out.println("Mismatch at [" + i + "][" + j + "]: Expected " + 
                        expected[i][j] + ", Actual " + actual[i][j]);
                    return false;
                }
            }
        }
        return true;
    }

    private static void validateInputMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != 0 && mat[i][j] != 1) {
                    throw new IllegalArgumentException(
                        "Invalid matrix value at [" + i + "][" + j + "]: " + mat[i][j] + 
                        ". Only 0 and 1 are allowed.");
                }
            }
        }
    }
}
