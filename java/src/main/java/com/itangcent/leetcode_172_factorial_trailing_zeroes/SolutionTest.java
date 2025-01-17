package com.itangcent.leetcode_172_factorial_trailing_zeroes;

/**
 * Test class for the solution to LeetCode problem #172: factorial-trailing-zeroes
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #172: factorial-trailing-zeroes");
        
        // Test case 1: n = 3 (3! = 6, no trailing zeros)
        int n1 = 3;
        int expected1 = 0;
        int result1 = solution.trailingZeroes(n1);
        System.out.println("Test case for n = " + n1 + ": " + (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test case 2: n = 5 (5! = 120, one trailing zero)
        int n2 = 5;
        int expected2 = 1;
        int result2 = solution.trailingZeroes(n2);
        System.out.println("Test case for n = " + n2 + ": " + (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test case 3: n = 10 (10! = 3628800, two trailing zeros)
        int n3 = 10;
        int expected3 = 2;
        int result3 = solution.trailingZeroes(n3);
        System.out.println("Test case for n = " + n3 + ": " + (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test case 4: n = 25 (25! has 6 trailing zeros)
        int n4 = 25;
        int expected4 = 6;
        int result4 = solution.trailingZeroes(n4);
        System.out.println("Test case for n = " + n4 + ": " + (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }
        
        // Test case 5: n = 0 (0! = 1, no trailing zeros)
        int n5 = 0;
        int expected5 = 0;
        int result5 = solution.trailingZeroes(n5);
        System.out.println("Test case for n = " + n5 + ": " + (result5 == expected5 ? "PASSED" : "FAILED"));
        if (result5 != expected5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
        }
    }
}
