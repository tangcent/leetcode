package com.itangcent.leetcode_201_bitwise_and_of_numbers_range;

/**
 * Test class for the solution to LeetCode problem #201: bitwise-and-of-numbers-range
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        testCase(solution, 5, 7, 4);
        testCase(solution, 0, 0, 0);
        testCase(solution, 1, 2147483647, 0);
        testCase(solution, 1, 1, 1);
        testCase(solution, 2, 6, 0);
        testCase(solution, 4, 7, 4);
        testCase(solution, 5, 5, 5);
        testCase(solution, 12, 15, 12);
    }
    
    private static void testCase(Solution solution, int left, int right, int expected) {
        int result = solution.rangeBitwiseAnd(left, right);
        boolean passed = result == expected;
        System.out.println("Test case for [" + left + ", " + right + "]: " + 
                           (passed ? "PASSED" : "FAILED"));
        
        if (!passed) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + result);
        }
    }
}
