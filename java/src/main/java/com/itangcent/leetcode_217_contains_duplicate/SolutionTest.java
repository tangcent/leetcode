package com.itangcent.leetcode_217_contains_duplicate;

/**
 * Test class for the solution to LeetCode problem #217: contains-duplicate
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #217: contains-duplicate");
        
        // Test case 1: Array with duplicates
        int[] nums1 = {1, 2, 3, 1};
        boolean result1 = solution.containsDuplicate(nums1);
        System.out.println("Test case for array with duplicates: " + (result1 ? "PASSED" : "FAILED"));
        System.out.println("Expected: true, Actual: " + result1);
        
        // Test case 2: Array without duplicates
        int[] nums2 = {1, 2, 3, 4};
        boolean result2 = solution.containsDuplicate(nums2);
        System.out.println("Test case for array without duplicates: " + (!result2 ? "PASSED" : "FAILED"));
        System.out.println("Expected: false, Actual: " + result2);
        
        // Test case 3: Array with duplicates not adjacent
        int[] nums3 = {1, 2, 3, 4, 2, 5};
        boolean result3 = solution.containsDuplicate(nums3);
        System.out.println("Test case for array with non-adjacent duplicates: " + (result3 ? "PASSED" : "FAILED"));
        System.out.println("Expected: true, Actual: " + result3);
        
        // Test case 4: Empty array
        int[] nums4 = {};
        boolean result4 = solution.containsDuplicate(nums4);
        System.out.println("Test case for empty array: " + (!result4 ? "PASSED" : "FAILED"));
        System.out.println("Expected: false, Actual: " + result4);
        
        // Test case 5: Array with a single element
        int[] nums5 = {1};
        boolean result5 = solution.containsDuplicate(nums5);
        System.out.println("Test case for single element array: " + (!result5 ? "PASSED" : "FAILED"));
        System.out.println("Expected: false, Actual: " + result5);
        
        // Test case 6: Array with multiple duplicates
        int[] nums6 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result6 = solution.containsDuplicate(nums6);
        System.out.println("Test case for array with multiple duplicates: " + (result6 ? "PASSED" : "FAILED"));
        System.out.println("Expected: true, Actual: " + result6);
    }
}
