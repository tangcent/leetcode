package com.itangcent.leetcode_413_arithmetic_slices;

/**
 * Test class for the solution to LeetCode problem #413: arithmetic-slices
 * 
 * Problem: A sequence of numbers is called arithmetic if it consists of at least three elements and if
 * the difference between any two consecutive elements is the same.
 * 
 * For example, [1, 3, 5, 7, 9], [7, 7, 7, 7], and [3, -1, -5, -9] are arithmetic sequences.
 * Given an integer array nums, return the number of arithmetic subarrays of nums.
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #413: arithmetic-slices");
        
        // Test case 1: [1,2,3,4]
        int[] nums1 = {1, 2, 3, 4};
        int expected1 = 3; // [1,2,3], [2,3,4], [1,2,3,4]
        int result1 = solution.numberOfArithmeticSlices(nums1);
        System.out.println("Test case for nums=[1,2,3,4]: " + (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test case 2: [1]
        int[] nums2 = {1};
        int expected2 = 0; // No arithmetic slices with less than 3 elements
        int result2 = solution.numberOfArithmeticSlices(nums2);
        System.out.println("Test case for nums=[1]: " + (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test case 3: [7,7,7,7]
        int[] nums3 = {7, 7, 7, 7};
        int expected3 = 3; // [7,7,7], [7,7,7], [7,7,7,7]
        int result3 = solution.numberOfArithmeticSlices(nums3);
        System.out.println("Test case for nums=[7,7,7,7]: " + (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test case 4: [1,3,5,7,9]
        int[] nums4 = {1, 3, 5, 7, 9};
        int expected4 = 6; // [1,3,5], [3,5,7], [5,7,9], [1,3,5,7], [3,5,7,9], [1,3,5,7,9]
        int result4 = solution.numberOfArithmeticSlices(nums4);
        System.out.println("Test case for nums=[1,3,5,7,9]: " + (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }
        
        // Test case 5: [3,-1,-5,-9]
        int[] nums5 = {3, -1, -5, -9};
        int expected5 = 3; // [3,-1,-5], [-1,-5,-9], [3,-1,-5,-9]
        int result5 = solution.numberOfArithmeticSlices(nums5);
        System.out.println("Test case for nums=[3,-1,-5,-9]: " + (result5 == expected5 ? "PASSED" : "FAILED"));
        if (result5 != expected5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
        }
        
        // Test case 6: [1,2,3,8,9,10]
        int[] nums6 = {1, 2, 3, 8, 9, 10};
        int expected6 = 2; // [1,2,3], [8,9,10]
        int result6 = solution.numberOfArithmeticSlices(nums6);
        System.out.println("Test case for nums=[1,2,3,8,9,10]: " + (result6 == expected6 ? "PASSED" : "FAILED"));
        if (result6 != expected6) {
            System.out.println("  Expected: " + expected6 + ", Actual: " + result6);
        }
        
        // Test case 7: [1,2,3,5,8,9,10]
        int[] nums7 = {1, 2, 3, 5, 8, 9, 10};
        int expected7 = 2; // [1,2,3], [8,9,10]
        int result7 = solution.numberOfArithmeticSlices(nums7);
        System.out.println("Test case for nums=[1,2,3,5,8,9,10]: " + (result7 == expected7 ? "PASSED" : "FAILED"));
        if (result7 != expected7) {
            System.out.println("  Expected: " + expected7 + ", Actual: " + result7);
        }
    }
}
