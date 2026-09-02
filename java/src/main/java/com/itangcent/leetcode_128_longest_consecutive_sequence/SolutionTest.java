package com.itangcent.leetcode_128_longest_consecutive_sequence;

/**
 * Test class for the solution to LeetCode problem #128: longest-consecutive-sequence
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Empty array
        int[] nums1 = {};
        int result1 = solution.longestConsecutive(nums1);
        System.out.println("Test case for empty array: " + (result1 == 0 ? "PASSED" : "FAILED"));
        
        // Test case 2: Single element
        int[] nums2 = {1};
        int result2 = solution.longestConsecutive(nums2);
        System.out.println("Test case for single element: " + (result2 == 1 ? "PASSED" : "FAILED"));
        
        // Test case 3: Consecutive sequence
        int[] nums3 = {1, 2, 3, 4, 5};
        int result3 = solution.longestConsecutive(nums3);
        System.out.println("Test case for consecutive sequence: " + (result3 == 5 ? "PASSED" : "FAILED"));
        
        // Test case 4: Non-consecutive numbers
        int[] nums4 = {1, 3, 5, 7, 9};
        int result4 = solution.longestConsecutive(nums4);
        System.out.println("Test case for non-consecutive numbers: " + (result4 == 1 ? "PASSED" : "FAILED"));
        
        // Test case 5: Multiple sequences
        int[] nums5 = {100, 4, 200, 1, 3, 2};
        int result5 = solution.longestConsecutive(nums5);
        System.out.println("Test case for multiple sequences: " + (result5 == 4 ? "PASSED" : "FAILED"));
        
        // Test case 6: Duplicate numbers
        int[] nums6 = {0, 0, 1, 1, 2, 2, 3, 3};
        int result6 = solution.longestConsecutive(nums6);
        System.out.println("Test case for duplicate numbers: " + (result6 == 4 ? "PASSED" : "FAILED"));
        
        // Test case 7: Negative numbers
        int[] nums7 = {-1, -2, -3, 0, 1, 2};
        int result7 = solution.longestConsecutive(nums7);
        System.out.println("Test case for negative numbers: " + (result7 == 6 ? "PASSED" : "FAILED"));
    }
}
