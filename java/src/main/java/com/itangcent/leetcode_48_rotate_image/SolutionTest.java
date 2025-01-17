package com.itangcent.leetcode_48_rotate_image;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: 2x2 matrix
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        System.out.println("Test case 1: 2x2 matrix");
        System.out.println("Before rotation:");
        printMatrix(matrix1);
        solution.rotate(matrix1);
        System.out.println("After rotation:");
        printMatrix(matrix1);
        System.out.println();

        // Test case 2: 3x3 matrix
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Test case 2: 3x3 matrix");
        System.out.println("Before rotation:");
        printMatrix(matrix2);
        solution.rotate(matrix2);
        System.out.println("After rotation:");
        printMatrix(matrix2);
        System.out.println();

        // Test case 3: 4x4 matrix
        int[][] matrix3 = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };
        System.out.println("Test case 3: 4x4 matrix");
        System.out.println("Before rotation:");
        printMatrix(matrix3);
        solution.rotate(matrix3);
        System.out.println("After rotation:");
        printMatrix(matrix3);
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