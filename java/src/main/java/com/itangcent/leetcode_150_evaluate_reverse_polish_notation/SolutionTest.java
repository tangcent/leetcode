package com.itangcent.leetcode_150_evaluate_reverse_polish_notation;

/**
 * Test class for the solution to LeetCode problem #150: evaluate-reverse-polish-notation
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #150: evaluate-reverse-polish-notation");
        
        // Test Case 1: Basic addition and multiplication
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        int expected1 = 9;  // (2 + 1) * 3 = 9
        int result1 = solution.evalRPN(tokens1);
        System.out.println("Test case for basic operations: " + (expected1 == result1 ? "PASSED" : "FAILED"));
        if (expected1 != result1) {
            System.out.println("Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test Case 2: More complex example with division
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        int expected2 = 6;  // 4 + (13 / 5) = 4 + 2 = 6
        int result2 = solution.evalRPN(tokens2);
        System.out.println("Test case for division: " + (expected2 == result2 ? "PASSED" : "FAILED"));
        if (expected2 != result2) {
            System.out.println("Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test Case 3: Complex example with multiple operations
        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int expected3 = 22;  // ((10 * (6 / ((9 + 3) * -11))) + 17) + 5 = 22
        int result3 = solution.evalRPN(tokens3);
        System.out.println("Test case for complex operations: " + (expected3 == result3 ? "PASSED" : "FAILED"));
        if (expected3 != result3) {
            System.out.println("Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test Case 4: Single number
        String[] tokens4 = {"42"};
        int expected4 = 42;
        int result4 = solution.evalRPN(tokens4);
        System.out.println("Test case for single number: " + (expected4 == result4 ? "PASSED" : "FAILED"));
        if (expected4 != result4) {
            System.out.println("Expected: " + expected4 + ", Actual: " + result4);
        }
        
        // Test Case 5: Subtraction
        String[] tokens5 = {"5", "3", "-"};
        int expected5 = 2;  // 5 - 3 = 2
        int result5 = solution.evalRPN(tokens5);
        System.out.println("Test case for subtraction: " + (expected5 == result5 ? "PASSED" : "FAILED"));
        if (expected5 != result5) {
            System.out.println("Expected: " + expected5 + ", Actual: " + result5);
        }
    }
}
