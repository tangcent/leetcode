package com.itangcent.leetcode_454_4_sum_ii;

/**
 * Test class for the solution to LeetCode problem #454: 4-sum-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #454: 4-sum-ii");
        
        // Test case 1: Basic case with matches
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};
        System.out.println("Test case 1: Expected: 2, Actual: " + solution.fourSumCount(nums1, nums2, nums3, nums4));

        // Test case 2: No matches
        int[] nums5 = {1, 1};
        int[] nums6 = {1, 1};
        int[] nums7 = {1, 1};
        int[] nums8 = {1, 1};
        System.out.println("Test case 2: Expected: 0, Actual: " + solution.fourSumCount(nums5, nums6, nums7, nums8));

        // Test case 3: Empty arrays
        int[] empty = {};
        System.out.println("Test case 3: Expected: 0, Actual: " + solution.fourSumCount(empty, empty, empty, empty));

        // Test case 4: All zeros
        int[] zeros = {0, 0};
        System.out.println("Test case 4: Expected: 16, Actual: " + solution.fourSumCount(zeros, zeros, zeros, zeros));

        // Test case 5: Mixed positive and negative numbers
        int[] nums9 = {-1, -1};
        int[] nums10 = {-1, 1};
        int[] nums11 = {-1, 1};
        int[] nums12 = {1, -1};
        System.out.println("Test case 5: Expected: 6, Actual: " + solution.fourSumCount(nums9, nums10, nums11, nums12));
    }
}
