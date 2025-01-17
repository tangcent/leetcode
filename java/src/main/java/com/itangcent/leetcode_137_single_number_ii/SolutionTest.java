package com.itangcent.leetcode_137_single_number_ii;

/**
 * Test class for the solution to LeetCode problem #137: single-number-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #137: single-number-ii");
        
        // Test case 1: Single number is positive
        int[] nums1 = {2, 2, 3, 2};
        int expected1 = 3;
        int result1 = solution.singleNumber(nums1);
        System.out.println("Test case for positive single number: " + 
            (result1 == expected1 ? "PASSED" : "FAILED") + 
            " (Expected: " + expected1 + ", Actual: " + result1 + ")");
        
        // Test case 2: Single number is negative
        int[] nums2 = {0, 1, 0, 1, 0, 1, -99};
        int expected2 = -99;
        int result2 = solution.singleNumber(nums2);
        System.out.println("Test case for negative single number: " + 
            (result2 == expected2 ? "PASSED" : "FAILED") + 
            " (Expected: " + expected2 + ", Actual: " + result2 + ")");
        
        // Test case 3: Single number is zero
        int[] nums3 = {1, 1, 1, 0};
        int expected3 = 0;
        int result3 = solution.singleNumber(nums3);
        System.out.println("Test case for zero single number: " + 
            (result3 == expected3 ? "PASSED" : "FAILED") + 
            " (Expected: " + expected3 + ", Actual: " + result3 + ")");
        
        // Test case 4: Large array with single number
        int[] nums4 = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10};
        int expected4 = 10;
        int result4 = solution.singleNumber(nums4);
        System.out.println("Test case for large array: " + 
            (result4 == expected4 ? "PASSED" : "FAILED") + 
            " (Expected: " + expected4 + ", Actual: " + result4 + ")");
        
        // Test case 5: Single number with multiple duplicates
        int[] nums5 = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11};
        int expected5 = 11;
        int result5 = solution.singleNumber(nums5);
        System.out.println("Test case for multiple duplicates: " + 
            (result5 == expected5 ? "PASSED" : "FAILED") + 
            " (Expected: " + expected5 + ", Actual: " + result5 + ")");
    }
}
