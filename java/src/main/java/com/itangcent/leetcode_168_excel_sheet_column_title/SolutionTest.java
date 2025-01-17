package com.itangcent.leetcode_168_excel_sheet_column_title;

/**
 * Test class for the solution to LeetCode problem #168: excel-sheet-column-title
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #168: excel-sheet-column-title");
        
        // Test case 1
        testConvertToTitle(solution, 1, "A");
        
        // Test case 2
        testConvertToTitle(solution, 28, "AB");
        
        // Test case 3
        testConvertToTitle(solution, 701, "ZY");
        
        // Test case 4
        testConvertToTitle(solution, 2147483647, "FXSHRXW");
        
        // Test case 5
        testConvertToTitle(solution, 52, "AZ");
        
        // Test case 6
        testConvertToTitle(solution, 26, "Z");
        
        // Test case 7
        testConvertToTitle(solution, 27, "AA");
    }
    
    private static void testConvertToTitle(Solution solution, int columnNumber, String expected) {
        String actual = solution.convertToTitle(columnNumber);
        boolean passed = expected.equals(actual);
        
        System.out.println("Test case for column number " + columnNumber + ": " + 
                (passed ? "PASSED" : "FAILED"));
        
        if (!passed) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + actual);
        }
    }
}
