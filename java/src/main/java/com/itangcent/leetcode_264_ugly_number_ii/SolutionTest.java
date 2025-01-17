package com.itangcent.leetcode_264_ugly_number_ii;

/**
 * Test class for the solution to LeetCode problem #264: ugly-number-ii
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * The task is to find the nth ugly number in the sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, ...
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #264: ugly-number-ii");
        
        // Test cases
        testNthUglyNumber(solution, 1, 1);   // 1st ugly number is 1
        testNthUglyNumber(solution, 2, 2);   // 2nd ugly number is 2
        testNthUglyNumber(solution, 3, 3);   // 3rd ugly number is 3
        testNthUglyNumber(solution, 4, 4);   // 4th ugly number is 4 (2×2)
        testNthUglyNumber(solution, 5, 5);   // 5th ugly number is 5
        testNthUglyNumber(solution, 6, 6);   // 6th ugly number is 6 (2×3)
        testNthUglyNumber(solution, 7, 8);   // 7th ugly number is 8 (2×2×2)
        testNthUglyNumber(solution, 8, 9);   // 8th ugly number is 9 (3×3)
        testNthUglyNumber(solution, 9, 10);  // 9th ugly number is 10 (2×5)
        testNthUglyNumber(solution, 10, 12); // 10th ugly number is 12 (2×2×3)
        testNthUglyNumber(solution, 11, 15); // 11th ugly number is 15 (3×5)
        testNthUglyNumber(solution, 150, 5832); // 150th ugly number
        testNthUglyNumber(solution, 0, 0);   // Edge case - invalid input
    }
    
    private static void testNthUglyNumber(Solution solution, int n, int expected) {
        int result = solution.nthUglyNumber(n);
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
