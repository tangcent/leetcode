package com.itangcent.leetcode_65_valid_number;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Valid number test cases
        System.out.println("=== Valid Number Test Cases ===");
        
        testCase(solution, 1, "2", true);
        testCase(solution, 2, "0089", true);
        testCase(solution, 3, "-0.1", true);
        testCase(solution, 4, "+3.14", true);
        testCase(solution, 5, "4.", true);
        testCase(solution, 6, "-.9", true);
        testCase(solution, 7, "2e10", true);
        testCase(solution, 8, "-90E3", true);
        testCase(solution, 9, "3e+7", true);
        testCase(solution, 10, "+6e-1", true);
        testCase(solution, 11, "53.5e93", true);
        testCase(solution, 12, "-123.456e789", true);

        System.out.println("\n=== Invalid Number Test Cases ===");

        testCase(solution, 13, "abc", false);
        testCase(solution, 14, "1a", false);
        testCase(solution, 15, "1e", false);
        testCase(solution, 16, "e3", false);
        testCase(solution, 17, "99e2.5", false);
        testCase(solution, 18, "--6", false);
        testCase(solution, 19, "-+3", false);
        testCase(solution, 20, "95a54e53", false);
        testCase(solution, 21, "", false);
    }

    private static void testCase(Solution solution, int caseNumber, String input, boolean expected) {
        System.out.println("Test case " + caseNumber + ": \"" + input + "\"");
        System.out.println("Expected: " + expected);
        boolean actual = solution.isNumber(input);
        System.out.println("Actual: " + actual);
        System.out.println("Result: " + (expected == actual ? "PASS" : "FAIL"));
        System.out.println();
    }
} 