package com.itangcent.leetcode_396_rotate_function;

/**
 * Test class for the solution to LeetCode problem #396: rotate-function
 * <p>
 * Problem Description:
 * You are given an integer array nums of length n.
 * Let's define a function F(k) as the sum of the elements of nums after rotating
 * the array k times to the right. Formally, F(k) = nums[0] * 0 + nums[1] * 1 + ... + nums[n-1] * (n-1)
 * after k rotations.
 * Return the maximum value of F(k) for any valid k in the range [0, n-1].
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Running tests for LeetCode problem #396: rotate-function");

        // Test case 1: Example from LeetCode
        int[] nums1 = {4, 3, 2, 6};
        int expected1 = 26;
        int result1 = solution.maxRotateFunction(nums1);
        System.out.println("Test case for [4,3,2,6]: " + (expected1 == result1 ? "PASSED" : "FAILED"));
        if (expected1 != result1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }

        // Test case 2: Single element array
        int[] nums2 = {1};
        int expected2 = 0;
        int result2 = solution.maxRotateFunction(nums2);
        System.out.println("Test case for [1]: " + (expected2 == result2 ? "PASSED" : "FAILED"));
        if (expected2 != result2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }

        // Test case 3: Two elements array
        int[] nums3 = {2, 4};
        int expected3 = 4;
        int result3 = solution.maxRotateFunction(nums3);
        System.out.println("Test case for [2,4]: " + (expected3 == result3 ? "PASSED" : "FAILED"));
        if (expected3 != result3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }

        // Test case 4: Larger array
        int[] nums4 = {1, 2, 3, 4, 5};
        int expected4 = 40;
        int result4 = solution.maxRotateFunction(nums4);
        System.out.println("Test case for [1,2,3,4,5]: " + (expected4 == result4 ? "PASSED" : "FAILED"));
        if (expected4 != result4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }

        // Test case 5: Negative numbers
        int[] nums5 = {-2, -3, -1};
        int expected5 = -5;
        int result5 = solution.maxRotateFunction(nums5);
        System.out.println("Test case for [-2,-3,-1]: " + (expected5 == result5 ? "PASSED" : "FAILED"));
        if (expected5 != result5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
        }
    }
}
