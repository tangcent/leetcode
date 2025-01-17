package com.itangcent.leetcode_377_combination_sum_iv;

/**
 * Test class for the solution to LeetCode problem #377: combination-sum-iv
 * <p>
 * Problem #377: Combination Sum IV
 * Given an array of distinct integers nums and a target integer target,
 * return the number of possible combinations that add up to target.
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Running tests for LeetCode problem #377: combination-sum-iv");

        // Test case 1: Example from LeetCode
        // nums = [1,2,3], target = 4
        // The possible combination ways are:
        // (1, 1, 1, 1)
        // (1, 1, 2)
        // (1, 2, 1)
        // (1, 3)
        // (2, 1, 1)
        // (2, 2)
        // (3, 1)
        // Note that different sequences are counted as different combinations.
        int[] nums1 = {1, 2, 3};
        int target1 = 4;
        int expected1 = 7;
        int result1 = solution.combinationSum4(nums1, target1);
        System.out.println("Test case for nums=[1,2,3], target=4: " +
                (result1 == expected1 ? "PASSED" : "FAILED") +
                " (Expected: " + expected1 + ", Actual: " + result1 + ")");

        // Test case 2: Second example from LeetCode
        // nums = [9], target = 3
        // There are no combinations that add up to target, so return 0.
        int[] nums2 = {9};
        int target2 = 3;
        int expected2 = 0;
        int result2 = solution.combinationSum4(nums2, target2);
        System.out.println("Test case for nums=[9], target=3: " +
                (result2 == expected2 ? "PASSED" : "FAILED") +
                " (Expected: " + expected2 + ", Actual: " + result2 + ")");

        // Test case 3: Empty array
        int[] nums3 = {};
        int target3 = 1;
        int expected3 = 0;
        int result3 = solution.combinationSum4(nums3, target3);
        System.out.println("Test case for nums=[], target=1: " +
                (result3 == expected3 ? "PASSED" : "FAILED") +
                " (Expected: " + expected3 + ", Actual: " + result3 + ")");

        // Test case 4: Larger target
        int[] nums4 = {1, 2, 5};
        int target4 = 10;
        int expected4 = 128;
        int result4 = solution.combinationSum4(nums4, target4);
        System.out.println("Test case for nums=[1,2,5], target=10: " +
                (result4 == expected4 ? "PASSED" : "FAILED") +
                " (Expected: " + expected4 + ", Actual: " + result4 + ")");
    }
}
