package com.itangcent.leetcode_227_basic_calculator_ii;

/**
 * Test class for the solution to LeetCode problem #227: basic-calculator-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Basic operations
        String s1 = "3+2*2";
        int expected1 = 7;
        int result1 = solution.calculate(s1);
        System.out.println("Test case for basic operations: " +
                (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }

        // Test case 2: With spaces
        String s2 = " 3/2 ";
        int expected2 = 1;
        int result2 = solution.calculate(s2);
        System.out.println("Test case for division with spaces: " +
                (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }

        // Test case 3: Complex expression
        String s3 = " 3+5 / 2 ";
        int expected3 = 5;
        int result3 = solution.calculate(s3);
        System.out.println("Test case for complex expression: " +
                (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }

        // Test case 4: Multiple operations with precedence
        String s4 = "14-3/2*2+7*4";
        int expected4 = 40;
        int result4 = solution.calculate(s4);
        System.out.println("Test case for multiple operations: " +
                (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }

        // Test case 5: Integer MIN_VALUE edge case
        String s5 = "0-2147483647";
        int expected5 = -2147483647;
        int result5 = solution.calculate(s5);
        System.out.println("Test case for Integer.MIN_VALUE edge case: " +
                (result5 == expected5 ? "PASSED" : "FAILED"));
        if (result5 != expected5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
        }
    }
}
