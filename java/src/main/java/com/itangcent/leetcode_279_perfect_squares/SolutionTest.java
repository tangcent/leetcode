package com.itangcent.leetcode_279_perfect_squares;

/**
 * Test class for the solution to LeetCode problem #279: perfect-squares
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Running tests for LeetCode problem #279: perfect-squares");

        // Test case 1: n = 1 (perfect square itself)
        int result1 = solution.numSquares(1);
        System.out.println("Test case for n=1: " + (result1 == 1 ? "PASSED" : "FAILED") +
                " (Expected: 1, Actual: " + result1 + ")");

        // Test case 2: n = 4 (perfect square itself)
        int result2 = solution.numSquares(4);
        System.out.println("Test case for n=4: " + (result2 == 1 ? "PASSED" : "FAILED") +
                " (Expected: 1, Actual: " + result2 + ")");

        // Test case 3: n = 12 (requires multiple squares: 4+4+4)
        int result3 = solution.numSquares(12);
        System.out.println("Test case for n=12: " + (result3 == 3 ? "PASSED" : "FAILED") +
                " (Expected: 3, Actual: " + result3 + ")");

        // Test case 4: n = 13 (requires multiple squares: 9+4)
        int result4 = solution.numSquares(13);
        System.out.println("Test case for n=13: " + (result4 == 2 ? "PASSED" : "FAILED") +
                " (Expected: 2, Actual: " + result4 + ")");

        // Test case 5: n = 43 (requires multiple squares: 36+4+1+1+1)
        int result5 = solution.numSquares(43);
        System.out.println("Test case for n=43: " + (result5 == 5 ? "PASSED" : "FAILED") +
                " (Expected: 5, Actual: " + result5 + ")");
    }
}
