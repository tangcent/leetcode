package com.itangcent.leetcode_198_house_robber;

/**
 * Test class for the solution to LeetCode problem #198: house-robber
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #198: house-robber");
        
        // Test case 1: Example from LeetCode
        int[] nums1 = {1, 2, 3, 1};
        int expected1 = 4; // Rob house 1 (1) and 3 (3)
        int result1 = solution.rob(nums1);
        System.out.println("Test case for example 1: " + (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test case 2: Example from LeetCode
        int[] nums2 = {2, 7, 9, 3, 1};
        int expected2 = 12; // Rob house 1 (2), 3 (9), and 5 (1)
        int result2 = solution.rob(nums2);
        System.out.println("Test case for example 2: " + (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test case 3: Empty array
        int[] nums3 = {};
        int expected3 = 0;
        int result3 = solution.rob(nums3);
        System.out.println("Test case for empty array: " + (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test case 4: Single house
        int[] nums4 = {5};
        int expected4 = 5;
        int result4 = solution.rob(nums4);
        System.out.println("Test case for single house: " + (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }
        
        // Test case 5: Two houses
        int[] nums5 = {2, 1};
        int expected5 = 2;
        int result5 = solution.rob(nums5);
        System.out.println("Test case for two houses: " + (result5 == expected5 ? "PASSED" : "FAILED"));
        if (result5 != expected5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
        }
        
        // Test case 6: Large values
        int[] nums6 = {100, 1, 200, 1, 300};
        int expected6 = 600; // Rob house 1 (100), 3 (200), and 5 (300)
        int result6 = solution.rob(nums6);
        System.out.println("Test case for large values: " + (result6 == expected6 ? "PASSED" : "FAILED"));
        if (result6 != expected6) {
            System.out.println("  Expected: " + expected6 + ", Actual: " + result6);
        }
    }
}
