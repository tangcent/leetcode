package com.itangcent.leetcode_136_single_number;

/**
 * Test class for the solution to LeetCode problem #136: single-number
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Running tests for LeetCode problem #136: single-number");

        // Test case 1: Single element in array
        int[] nums1 = {1};
        int expected1 = 1;
        int result1 = solution.singleNumber(nums1);
        System.out.println("Test case for single element: " + (result1 == expected1 ? "PASSED" : "FAILED"));

        // Test case 2: Single number at the beginning
        int[] nums2 = {4, 1, 2, 1, 2};
        int expected2 = 4;
        int result2 = solution.singleNumber(nums2);
        System.out.println("Test case for single number at beginning: " + (result2 == expected2 ? "PASSED" : "FAILED"));

        // Test case 3: Single number in the middle
        int[] nums3 = {2, 2, 1, 3, 3};
        int expected3 = 1;
        int result3 = solution.singleNumber(nums3);
        System.out.println("Test case for single number in middle: " + (result3 == expected3 ? "PASSED" : "FAILED"));

        // Test case 4: Single number at the end
        int[] nums4 = {1, 1, 2, 2, 3};
        int expected4 = 3;
        int result4 = solution.singleNumber(nums4);
        System.out.println("Test case for single number at end: " + (result4 == expected4 ? "PASSED" : "FAILED"));

        // Test case 5: Negative numbers
        int[] nums5 = {-1, -1, -2, -2, -3};
        int expected5 = -3;
        int result5 = solution.singleNumber(nums5);
        System.out.println("Test case for negative numbers: " + (result5 == expected5 ? "PASSED" : "FAILED"));

        // Test case 6: Mixed positive and negative numbers
        int[] nums6 = {-1, -1, 2, 2, -3};
        int expected6 = -3;
        int result6 = solution.singleNumber(nums6);
        System.out.println("Test case for mixed positive and negative numbers: " + (result6 == expected6 ? "PASSED" : "FAILED"));
    }
}
