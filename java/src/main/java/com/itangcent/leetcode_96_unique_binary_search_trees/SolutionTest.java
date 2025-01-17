package com.itangcent.leetcode_96_unique_binary_search_trees;

/**
 * Test class for the solution to LeetCode problem #96: unique-binary-search-trees
 */
public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("Running tests for LeetCode problem #96: unique-binary-search-trees");

        // Test case 1: n = 1
        System.out.println("Test case 1: n = 1");
        System.out.println("Expected: 1, Actual: " + new Solution().numTrees(1));

        // Test case 2: n = 2
        System.out.println("Test case 2: n = 2");
        System.out.println("Expected: 2, Actual: " + new Solution().numTrees(2));

        // Test case 3: n = 3
        System.out.println("Test case 3: n = 3");
        System.out.println("Expected: 5, Actual: " + new Solution().numTrees(3));

        // Test case 4: n = 4
        System.out.println("Test case 4: n = 4");
        System.out.println("Expected: 14, Actual: " + new Solution().numTrees(4));

        // Test case 5: n = 5
        System.out.println("Test case 5: n = 5");
        System.out.println("Expected: 42, Actual: " + new Solution().numTrees(5));
    }
}
