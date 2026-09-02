package com.itangcent.leetcode_63_unique_paths_ii;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: [[0,0,0],[0,1,0],[0,0,0]]
        System.out.println("Test case 1: [[0,0,0],[0,1,0],[0,0,0]]");
        System.out.println("Expected: 2");
        System.out.println("Actual: " + solution.uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
        System.out.println();

        // Test case 2: [[0,1],[0,0]]
        System.out.println("Test case 2: [[0,1],[0,0]]");
        System.out.println("Expected: 1");
        System.out.println("Actual: " + solution.uniquePathsWithObstacles(new int[][]{{0,1},{0,0}}));
        System.out.println();

        // Test case 3: [[1,0]]
        System.out.println("Test case 3: [[1,0]]");
        System.out.println("Expected: 0");
        System.out.println("Actual: " + solution.uniquePathsWithObstacles(new int[][]{{1,0}}));
        System.out.println();

        // Test case 4: [[0,0],[0,1]]
        System.out.println("Test case 4: [[0,0],[0,1]]");
        System.out.println("Expected: 0");
        System.out.println("Actual: " + solution.uniquePathsWithObstacles(new int[][]{{0,0},{0,1}}));
        System.out.println();
    }
} 