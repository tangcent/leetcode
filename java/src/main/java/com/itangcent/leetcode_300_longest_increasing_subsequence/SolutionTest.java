package com.itangcent.leetcode_300_longest_increasing_subsequence;

/**
 * Test class for the solution to LeetCode problem #300: longest-increasing-subsequence
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Running tests for LeetCode problem #300: longest-increasing-subsequence");

        // Test case 1: Single element
        testCase(solution, new int[]{5}, 1, "Single element");

        // Test case 3: Strictly increasing
        testCase(solution, new int[]{1, 2, 3, 4}, 4, "Strictly increasing");

        // Test case 4: Strictly decreasing
        testCase(solution, new int[]{4, 3, 2, 1}, 1, "Strictly decreasing");

        // Test case 5: Mixed sequence
        testCase(solution, new int[]{10, 9, 2, 5, 3, 7, 101, 18}, 4, "Mixed sequence");

        // Test case 5: All equal elements
        testCase(solution, new int[]{7, 7, 7, 7}, 1, "All equal elements");

        // Test case 6: Random sequence
        testCase(solution, new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9}, 4, "Random sequence");
    }

    private static void testCase(Solution solution, int[] nums, int expected, String caseName) {
        int actual = solution.lengthOfLIS(nums);
        String result = expected == actual ? "PASSED" : "FAILED";
        System.out.println("Test case for " + caseName + ": " + result);
        if (!result.equals("PASSED")) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + actual);
        }
    }
}
