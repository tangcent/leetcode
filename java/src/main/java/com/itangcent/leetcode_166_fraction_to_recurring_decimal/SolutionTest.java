package com.itangcent.leetcode_166_fraction_to_recurring_decimal;

/**
 * Test class for the solution to LeetCode problem #166: fraction-to-recurring-decimal
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        testCase(solution, 1, 2, "0.5");
        testCase(solution, 2, 1, "2");
        testCase(solution, 2, 3, "0.(6)");
        testCase(solution, 4, 333, "0.(012)");
        testCase(solution, 1, 6, "0.1(6)");
        testCase(solution, 1, 333, "0.(003)");
        testCase(solution, -1, -2147483648, "0.0000000004656612873077392578125");
        testCase(solution, -2147483648, -1, "2147483648");
        testCase(solution, 0, 5, "0");
    }

    private static void testCase(Solution solution, int numerator, int denominator, String expected) {
        String result = solution.fractionToDecimal(numerator, denominator);
        boolean passed = result.equals(expected);

        System.out.println("Test case for " + numerator + "/" + denominator + ": " +
                (passed ? "PASSED" : "FAILED"));

        if (!passed) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + result);
        }
    }
}
