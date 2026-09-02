package com.itangcent.leetcode_268_missing_number;

/**
 * Test class for the solution to LeetCode problem #268: missing-number
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #268: missing-number");
        
        // Test case 1: Example from LeetCode
        int[] nums1 = {3, 0, 1};
        int expected1 = 2;
        int result1 = solution.missingNumber(nums1);
        System.out.println("Test case for [3,0,1]: " + (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test case 2: Example from LeetCode
        int[] nums2 = {0, 1};
        int expected2 = 2;
        int result2 = solution.missingNumber(nums2);
        System.out.println("Test case for [0,1]: " + (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test case 3: Example from LeetCode
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int expected3 = 8;
        int result3 = solution.missingNumber(nums3);
        System.out.println("Test case for [9,6,4,2,3,5,7,0,1]: " + (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test case 4: Edge case - only one number
        int[] nums4 = {0};
        int expected4 = 1;
        int result4 = solution.missingNumber(nums4);
        System.out.println("Test case for [0]: " + (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }
        
        // Test case 5: Edge case - missing 0
        int[] nums5 = {1, 2};
        int expected5 = 0;
        int result5 = solution.missingNumber(nums5);
        System.out.println("Test case for [1,2]: " + (result5 == expected5 ? "PASSED" : "FAILED"));
        if (result5 != expected5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
        }
    }
}
