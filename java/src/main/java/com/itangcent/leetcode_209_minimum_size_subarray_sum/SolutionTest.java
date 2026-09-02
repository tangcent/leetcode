package com.itangcent.leetcode_209_minimum_size_subarray_sum;

/**
 * Test class for the solution to LeetCode problem #209: minimum-size-subarray-sum
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #209: minimum-size-subarray-sum");
        
        // Test case 1 - Example from LeetCode
        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int expected1 = 2; // The subarray [4,3] has the minimal length under the problem constraint
        int result1 = solution.minSubArrayLen(target1, nums1);
        System.out.println("Test case for Example 1: " + (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test case 2 - Example from LeetCode
        int target2 = 4;
        int[] nums2 = {1, 4, 4};
        int expected2 = 1; // The subarray [4] has the minimal length
        int result2 = solution.minSubArrayLen(target2, nums2);
        System.out.println("Test case for Example 2: " + (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test case 3 - Example from LeetCode
        int target3 = 11;
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        int expected3 = 0; // No subarray sum is >= 11
        int result3 = solution.minSubArrayLen(target3, nums3);
        System.out.println("Test case for Example 3: " + (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test case 4 - Edge case with empty array
        int target4 = 100;
        int[] nums4 = {};
        int expected4 = 0; // Empty array case
        int result4 = solution.minSubArrayLen(target4, nums4);
        System.out.println("Test case for Empty array: " + (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }
        
        // Test case 5 - Edge case with target = 0
        int target5 = 0;
        int[] nums5 = {1, 2, 3, 4, 5};
        int expected5 = 0; // Any subarray with sum >= 0 has length 0
        int result5 = solution.minSubArrayLen(target5, nums5);
        System.out.println("Test case for Target = 0: " + (result5 == expected5 ? "PASSED" : "FAILED"));
        if (result5 != expected5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
        }
        
        // Test case 6 - Single element array that meets target
        int target6 = 5;
        int[] nums6 = {5};
        int expected6 = 1; // The array [5] meets the target
        int result6 = solution.minSubArrayLen(target6, nums6);
        System.out.println("Test case for Single element: " + (result6 == expected6 ? "PASSED" : "FAILED"));
        if (result6 != expected6) {
            System.out.println("  Expected: " + expected6 + ", Actual: " + result6);
        }
    }
}
