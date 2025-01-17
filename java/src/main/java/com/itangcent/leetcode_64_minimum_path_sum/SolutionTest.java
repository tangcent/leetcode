package com.itangcent.leetcode_64_minimum_path_sum;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: [[1,3,1],[1,5,1],[4,2,1]]
        System.out.println("Test case 1: [[1,3,1],[1,5,1],[4,2,1]]");
        System.out.println("Expected: 7");
        System.out.println("Actual: " + solution.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
        System.out.println();

        // Test case 2: [[1,2,3],[4,5,6]]
        System.out.println("Test case 2: [[1,2,3],[4,5,6]]");
        System.out.println("Expected: 12");
        System.out.println("Actual: " + solution.minPathSum(new int[][]{{1,2,3},{4,5,6}}));
        System.out.println();

        // Test case 3: [[1]]
        System.out.println("Test case 3: [[1]]");
        System.out.println("Expected: 1");
        System.out.println("Actual: " + solution.minPathSum(new int[][]{{1}}));
        System.out.println();
    }
} 