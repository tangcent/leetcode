package com.itangcent.leetcode_164_maximum_gap;

/**
 * Test class for the solution to LeetCode problem #164: maximum-gap
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Regular array
        int[] nums1 = {3, 6, 9, 1};
        int result1 = solution.maximumGap(nums1);
        System.out.println("Test case for regular array: " + (result1 == 3 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 3, Actual: " + result1);

        // Test case 2: Sorted array
        int[] nums2 = {1, 3, 6, 9};
        int result2 = solution.maximumGap(nums2);
        System.out.println("Test case for sorted array: " + (result2 == 3 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 3, Actual: " + result2);

        // Test case 3: Large gap
        int[] nums3 = {10, 1, 100};
        int result3 = solution.maximumGap(nums3);
        System.out.println("Test case for large gap: " + (result3 == 90 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 90, Actual: " + result3);

        // Test case 4: Single element
        int[] nums4 = {5};
        int result4 = solution.maximumGap(nums4);
        System.out.println("Test case for single element: " + (result4 == 0 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 0, Actual: " + result4);

        // Test case 5: Empty array
        int[] nums5 = {};
        int result5 = solution.maximumGap(nums5);
        System.out.println("Test case for empty array: " + (result5 == 0 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 0, Actual: " + result5);

        // Test case 6: Duplicate elements
        int[] nums6 = {1, 1, 1, 1};
        int result6 = solution.maximumGap(nums6);
        System.out.println("Test case for duplicate elements: " + (result6 == 0 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 0, Actual: " + result6);
    }
}
