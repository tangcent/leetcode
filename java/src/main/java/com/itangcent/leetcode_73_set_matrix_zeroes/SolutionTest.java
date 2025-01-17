package com.itangcent.leetcode_73_set_matrix_zeroes;

public class SolutionTest {
    static Solution solution = new Solution();

    public static void main(String[] args) {
        // Test case 1: Basic case
        test(new int[][]{{1,1,1},{1,0,1},{1,1,1}}, new int[][]{{1,0,1},{0,0,0},{1,0,1}});

        // Test case 2: Multiple zeros
        test(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}}, new int[][]{{0,0,0,0},{0,4,5,0},{0,3,1,0}});

        // Test case 3: Single element matrix
        test(new int[][]{{1}}, new int[][]{{1}});

        // Test case 4: Matrix with all zeros
        test(new int[][]{{0,0},{0,0}}, new int[][]{{0,0},{0,0}});

        // Test case 5: No zeros
        test(new int[][]{{1,2},{3,4}}, new int[][]{{1,2},{3,4}});

        // Test case 6: Single row with zero
        test(new int[][]{{1,0}}, new int[][]{{0,0}});

        System.out.println("All tests passed!");
    }
    
    private static void test(int[][] matrix, int[][] expected) {
        // Create a copy of input matrix for comparison
        int[][] input = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            input[i] = matrix[i].clone();
        }
        
        solution.setZeroes(matrix);
        
        // Compare result with expected
        if (!compareMatrices(matrix, expected)) {
            System.err.println("Test failed!");
            System.err.println("Input matrix:");
            printMatrix(input);
            System.err.println("Expected matrix:");
            printMatrix(expected);
            System.err.println("Got matrix:");
            printMatrix(matrix);
            System.exit(1);
        }
    }
    
    private static boolean compareMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false;
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
} 