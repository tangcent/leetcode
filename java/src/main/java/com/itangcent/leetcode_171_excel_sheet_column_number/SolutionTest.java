package com.itangcent.leetcode_171_excel_sheet_column_number;

/**
 * Test class for the solution to LeetCode problem #171: excel-sheet-column-number
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #171: excel-sheet-column-number");
        
        // Test case 1: Single character
        String testCase1 = "A";
        int expected1 = 1;
        int actual1 = solution.titleToNumber(testCase1);
        System.out.println("Test case for A: " + (expected1 == actual1 ? "PASSED" : "FAILED"));
        if (expected1 != actual1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + actual1);
        }
        
        // Test case 2: Single character
        String testCase2 = "Z";
        int expected2 = 26;
        int actual2 = solution.titleToNumber(testCase2);
        System.out.println("Test case for Z: " + (expected2 == actual2 ? "PASSED" : "FAILED"));
        if (expected2 != actual2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + actual2);
        }
        
        // Test case 3: Double character
        String testCase3 = "AB";
        int expected3 = 28;
        int actual3 = solution.titleToNumber(testCase3);
        System.out.println("Test case for AB: " + (expected3 == actual3 ? "PASSED" : "FAILED"));
        if (expected3 != actual3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + actual3);
        }
        
        // Test case 4: Triple character
        String testCase4 = "ZY";
        int expected4 = 701;
        int actual4 = solution.titleToNumber(testCase4);
        System.out.println("Test case for ZY: " + (expected4 == actual4 ? "PASSED" : "FAILED"));
        if (expected4 != actual4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + actual4);
        }
        
        // Test case 5: Another example
        String testCase5 = "AAA";
        int expected5 = 703;
        int actual5 = solution.titleToNumber(testCase5);
        System.out.println("Test case for AAA: " + (expected5 == actual5 ? "PASSED" : "FAILED"));
        if (expected5 != actual5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + actual5);
        }
    }
}
