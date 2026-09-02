package com.itangcent.leetcode_274_h_index;

/**
 * Test class for the solution to LeetCode problem #274: h-index
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] citations1 = {3, 0, 6, 1, 5};
        int result1 = solution.hIndex(citations1);
        System.out.println("Test case for example 1: " + (result1 == 3 ? "PASSED" : "FAILED"));
        if (result1 != 3) {
            System.out.println("Expected: 3, Actual: " + result1);
        }
        
        // Test case 2
        int[] citations2 = {1, 3, 1};
        int result2 = solution.hIndex(citations2);
        System.out.println("Test case for example 2: " + (result2 == 1 ? "PASSED" : "FAILED"));
        if (result2 != 1) {
            System.out.println("Expected: 1, Actual: " + result2);
        }
        
        // Edge case: Empty array
        int[] citations3 = {};
        int result3 = solution.hIndex(citations3);
        System.out.println("Test case for empty array: " + (result3 == 0 ? "PASSED" : "FAILED"));
        if (result3 != 0) {
            System.out.println("Expected: 0, Actual: " + result3);
        }
        
        // Edge case: All zeros
        int[] citations4 = {0, 0, 0};
        int result4 = solution.hIndex(citations4);
        System.out.println("Test case for all zeros: " + (result4 == 0 ? "PASSED" : "FAILED"));
        if (result4 != 0) {
            System.out.println("Expected: 0, Actual: " + result4);
        }
    }
}
