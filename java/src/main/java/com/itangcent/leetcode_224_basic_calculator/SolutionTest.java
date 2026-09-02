package com.itangcent.leetcode_224_basic_calculator;

/**
 * Test class for the solution to LeetCode problem #224: basic-calculator
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        testCase("1 + 1", 2, solution);
        testCase("2-1 + 2", 3, solution);
        testCase("(1+(4+5+2)-3)+(6+8)", 23, solution);
        testCase("1 + (2 + 3)", 6, solution);
        testCase("2 - (1 + 2)", -1, solution);
        testCase("  -2 + 1", -1, solution);
        testCase("-2-2", -4, solution);
        testCase("1-(     -2)", 3, solution);
        testCase("- (3 + (4 + 5))", -12, solution);
    }
    
    private static void testCase(String expression, int expected, Solution solution) {
        int result = solution.calculate(expression);
        String status = result == expected ? "PASSED" : "FAILED";
        System.out.println("Test case for \"" + expression + "\": " + status);
        
        if (result != expected) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + result);
        }
    }
}
