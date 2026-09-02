package com.itangcent.leetcode_74_search_a_2d_matrix;

public class SolutionTest {
    static Solution solution = new Solution();

    public static void main(String[] args) {
        // Test case 1: Basic case - target exists
        test(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3, true);

        // Test case 2: Basic case - target does not exist
        test(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 13, false);

        // Test case 3: Single row matrix
        test(new int[][]{{1,3,5,7}}, 3, true);

        // Test case 4: Single column matrix
        test(new int[][]{{1},{3},{5}}, 5, true);

        // Test case 5: Single element matrix
        test(new int[][]{{1}}, 1, true);

        // Test case 6: Target smaller than smallest element
        test(new int[][]{{1,3,5,7},{10,11,16,20}}, 0, false);

        // Test case 7: Target larger than largest element
        test(new int[][]{{1,3,5,7},{10,11,16,20}}, 21, false);

        System.out.println("All tests passed!");
    }
    
    private static void test(int[][] matrix, int target, boolean expected) {
        // Create a copy of input matrix for comparison
        int[][] input = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            input[i] = matrix[i].clone();
        }
        
        boolean result = solution.searchMatrix(matrix, target);
        
        // Compare result with expected
        if (result != expected) {
            System.err.println("Test failed!");
            System.err.println("Input matrix:");
            printMatrix(input);
            System.err.println("Target: " + target);
            System.err.println("Expected: " + expected);
            System.err.println("Got: " + result);
            System.exit(1);
        }
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