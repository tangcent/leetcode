package com.itangcent.leetcode_343_integer_break;

/**
 * Test class for the solution to LeetCode problem #343: integer-break
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #343: integer-break");
//
//        // Test case 1: n = 2
//        testIntegerBreak(solution, 2, 1);
//
//        // Test case 2: n = 3
//        testIntegerBreak(solution, 3, 2);
//
//        // Test case 3: n = 4
//        testIntegerBreak(solution, 4, 4);
//
//        // Test case 4: n = 5
//        testIntegerBreak(solution, 5, 6);
//
//        // Test case 5: n = 6
//        testIntegerBreak(solution, 6, 9);
//
//        // Test case 6: n = 7
//        testIntegerBreak(solution, 7, 12);
//
//        // Test case 7: n = 8
//        testIntegerBreak(solution, 8, 18);
//
//        // Test case 8: n = 10
//        testIntegerBreak(solution, 10, 36);
//
//        // Test case 9: n = 15
//        testIntegerBreak(solution, 15, 243);
        
        // Test case 10: n = 29
        testIntegerBreak(solution, 29, 39366);
    }
    
    private static void testIntegerBreak(Solution solution, int n, int expected) {
        int actual = solution.integerBreak(n);
        boolean passed = actual == expected;
        
        System.out.println("Test case for n=" + n + ": " + (passed ? "PASSED" : "FAILED"));
        
        if (!passed) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + actual);
        }
    }
}
