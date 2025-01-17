package com.itangcent.leetcode_525_contiguous_array;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Basic case
        int[] nums1 = {0, 1};
        int result1 = solution.findMaxLength(nums1);
        System.out.println("Test case for basic [0,1]: " +
            (result1 == 2 ? "PASSED" : "FAILED") +
            " (Expected: 2, Actual: " + result1 + ")");

        // Test case 2: Longer array
        int[] nums2 = {0, 1, 0};
        int result2 = solution.findMaxLength(nums2);
        System.out.println("Test case for [0,1,0]: " +
            (result2 == 2 ? "PASSED" : "FAILED") +
            " (Expected: 2, Actual: " + result2 + ")");

        // Test case 3: No valid subarray
        int[] nums3 = {0, 0, 0};
        int result3 = solution.findMaxLength(nums3);
        System.out.println("Test case for all 0s: " +
            (result3 == 0 ? "PASSED" : "FAILED") +
            " (Expected: 0, Actual: " + result3 + ")");

        // Test case 4: Complex case
        int[] nums4 = {0, 1, 1, 0, 1, 1, 1, 0};
        int result4 = solution.findMaxLength(nums4);
        System.out.println("Test case for complex array: " + 
            (result4 == 4 ? "PASSED" : "FAILED") + 
            " (Expected: 4, Actual: " + result4 + ")");
    }
}
