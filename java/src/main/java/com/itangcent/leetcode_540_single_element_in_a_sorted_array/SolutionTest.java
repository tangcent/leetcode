package com.itangcent.leetcode_540_single_element_in_a_sorted_array;

/**
 * Test class for the solution to LeetCode problem #540: single-element-in-a-sorted-array
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #540: single-element-in-a-sorted-array");
        
        // Test case 1: Single element at beginning
        int[] nums1 = {1, 2, 2, 3, 3};
        int result1 = solution.singleNonDuplicate(nums1);
        if (result1 == 1) {
            System.out.println("Test case for single element at beginning: PASSED");
        } else {
            System.out.println("Test case for single element at beginning: FAILED");
            System.out.println("Expected: 1, Actual: " + result1);
        }
        
        // Test case 2: Single element at end
        int[] nums2 = {1, 1, 2, 2, 3};
        int result2 = solution.singleNonDuplicate(nums2);
        if (result2 == 3) {
            System.out.println("Test case for single element at end: PASSED");
        } else {
            System.out.println("Test case for single element at end: FAILED");
            System.out.println("Expected: 3, Actual: " + result2);
        }
        
        // Test case 3: Single element in middle
        int[] nums3 = {1, 1, 2, 3, 3, 4, 4};
        int result3 = solution.singleNonDuplicate(nums3);
        if (result3 == 2) {
            System.out.println("Test case for single element in middle: PASSED");
        } else {
            System.out.println("Test case for single element in middle: FAILED");
            System.out.println("Expected: 2, Actual: " + result3);
        }
        
        // Test case 4: Small array
        int[] nums4 = {1, 1, 2};
        int result4 = solution.singleNonDuplicate(nums4);
        if (result4 == 2) {
            System.out.println("Test case for small array: PASSED");
        } else {
            System.out.println("Test case for small array: FAILED");
            System.out.println("Expected: 2, Actual: " + result4);
        }
    }
}
