package com.itangcent.leetcode_509_fibonacci_number;

/**
 * Test class for the solution to LeetCode problem #509: fibonacci-number
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #509: fibonacci-number");
        
        // Base cases
        testCase(solution, 0, 0);
        testCase(solution, 1, 1);
        
        // Small positive numbers
        testCase(solution, 2, 1);
        testCase(solution, 3, 2);
        testCase(solution, 4, 3);
        testCase(solution, 5, 5);
        testCase(solution, 6, 8);
        
        // Larger numbers
        testCase(solution, 10, 55);
        testCase(solution, 15, 610);
        testCase(solution, 20, 6765);
    }
    
    private static void testCase(Solution solution, int input, int expected) {
        int actual = solution.fib(input);
        if (actual == expected) {
            System.out.println(String.format("Test case for input %d: PASSED", input));
        } else {
            System.out.println(String.format("Test case for input %d: FAILED", input));
            System.out.println(String.format("  Expected: %d", expected));
            System.out.println(String.format("  Actual: %d", actual));
        }
    }
}
