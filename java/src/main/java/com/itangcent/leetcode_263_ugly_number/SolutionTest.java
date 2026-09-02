package com.itangcent.leetcode_263_ugly_number;

/**
 * Test class for the solution to LeetCode problem #263: ugly-number
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #263: ugly-number");
        
        // Test cases
        testIsUgly(solution, 6, true);     // 6 = 2 × 3, so it's ugly
        testIsUgly(solution, 1, true);     // 1 is considered ugly by definition
        testIsUgly(solution, 14, false);   // 14 = 2 × 7, contains prime factor 7, so not ugly
        testIsUgly(solution, 8, true);     // 8 = 2³, so it's ugly
        testIsUgly(solution, 30, true);    // 30 = 2 × 3 × 5, so it's ugly
        testIsUgly(solution, 0, false);    // 0 is not a positive integer
        testIsUgly(solution, -6, false);   // Negative numbers are not ugly
        testIsUgly(solution, 25, true);    // 25 = 5², so it's ugly
        testIsUgly(solution, 22, false);   // 22 = 2 × 11, contains prime factor 11, so not ugly
        testIsUgly(solution, 150, true);   // 150 = 2 × 3 × 5², so it's ugly
    }
    
    private static void testIsUgly(Solution solution, int n, boolean expected) {
        boolean result = solution.isUgly(n);
        String testName = "n = " + n;
        
        if (result == expected) {
            System.out.println("Test case for " + testName + ": PASSED");
        } else {
            System.out.println("Test case for " + testName + ": FAILED");
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + result);
        }
    }
}
