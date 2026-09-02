package com.itangcent.leetcode_62_unique_paths;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: m = 3, n = 7
        System.out.println("Test case 1: m = 3, n = 7");
        System.out.println("Expected: 28");
        System.out.println("Actual: " + solution.uniquePaths(3, 7));
        System.out.println();

        // Test case 2: m = 3, n = 2
        System.out.println("Test case 2: m = 3, n = 2");
        System.out.println("Expected: 3");
        System.out.println("Actual: " + solution.uniquePaths(3, 2));
        System.out.println();

        // Test case 3: m = 7, n = 3
        System.out.println("Test case 3: m = 7, n = 3");
        System.out.println("Expected: 28");
        System.out.println("Actual: " + solution.uniquePaths(7, 3));
        System.out.println();

        // Test case 4: m = 3, n = 3
        System.out.println("Test case 4: m = 3, n = 3");
        System.out.println("Expected: 6");
        System.out.println("Actual: " + solution.uniquePaths(3, 3));
        System.out.println();
    }
} 