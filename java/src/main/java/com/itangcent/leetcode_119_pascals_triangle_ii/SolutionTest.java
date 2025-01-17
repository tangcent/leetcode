package com.itangcent.leetcode_119_pascals_triangle_ii;

import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #119: pascals-triangle-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #119: pascals-triangle-ii");
        
        // Test case 1: rowIndex = 0 (first row)
        testCase(solution, 0, Arrays.asList(1));
        
        // Test case 2: rowIndex = 1 (second row)
        testCase(solution, 1, Arrays.asList(1, 1));
        
        // Test case 3: rowIndex = 2 (third row)
        testCase(solution, 2, Arrays.asList(1, 2, 1));
        
        // Test case 4: rowIndex = 3 (fourth row)
        testCase(solution, 3, Arrays.asList(1, 3, 3, 1));
        
        // Test case 5: rowIndex = 4 (fifth row)
        testCase(solution, 4, Arrays.asList(1, 4, 6, 4, 1));
        
        // Test case 6: rowIndex = 5 (sixth row)
        testCase(solution, 5, Arrays.asList(1, 5, 10, 10, 5, 1));
    }
    
    private static void testCase(Solution solution, int rowIndex, List<Integer> expected) {
        List<Integer> result = solution.getRow(rowIndex);
        boolean isCorrect = result.equals(expected);
        System.out.printf("Test case for rowIndex = %d: %s%n", rowIndex, isCorrect ? "PASSED" : "FAILED");
        if (!isCorrect) {
            System.out.printf("Expected: %s%n", expected);
            System.out.printf("Actual:   %s%n", result);
        }
    }
}
