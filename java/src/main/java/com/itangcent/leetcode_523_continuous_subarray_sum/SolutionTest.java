package com.itangcent.leetcode_523_continuous_subarray_sum;

/**
 * Test class for the solution to LeetCode problem #523: continuous-subarray-sum
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Basic case with valid subarray
        int[] nums1 = {23, 2, 4, 6, 7};
        int k1 = 6;
        boolean result1 = solution.checkSubarraySum(nums1, k1);
        System.out.println("Test case for basic valid subarray: " +
                (result1 ? "PASSED" : "FAILED") + " (Expected: true)");

        // Test case 2: No valid subarray exists
        int[] nums2 = {23, 2, 6, 4, 7};
        int k2 = 13;
        boolean result2 = solution.checkSubarraySum(nums2, k2);
        System.out.println("Test case for no valid subarray: " +
                (result2 ? "FAILED" : "PASSED") + " (Expected: false)");

        // Test case 3: Edge case with small array
        int[] nums3 = {0, 0};
        int k3 = 1;
        boolean result3 = solution.checkSubarraySum(nums3, k3);
        System.out.println("Test case for edge case [0,0]: " +
                (result3 ? "PASSED" : "FAILED") + " (Expected: true)");

        // Test case 4: Specific case from user
        int[] nums4 = {23, 2, 4, 6, 6};
        int k4 = 7;
        boolean result4 = solution.checkSubarraySum(nums4, k4);
        System.out.println("Test case for [23,2,4,6,6] k=7: " +
                (result4 ? "PASSED" : "FAILED") + " (Expected: true)");

        // Test case 5: Large array case
        int[] nums5 = new int[100000];
        java.util.Arrays.fill(nums5, 1);
        nums5[50000] = 23;
        nums5[50001] = 2;
        int k5 = 25;
        boolean result5 = solution.checkSubarraySum(nums5, k5);
        System.out.println("Test case for large array: " +
                (result5 ? "PASSED" : "FAILED") + " (Expected: true)");

        // Test case 6: Single large value case (added per user request)
        int[] nums6 = {1000000000};
        int k6 = 1000000000;
        boolean result6 = solution.checkSubarraySum(nums6, k6);
        System.out.println("Test case for [1000000000] k=1000000000: " +
                (result6 ? "FAILED" : "PASSED") + " (Expected: false)");
    }
}
