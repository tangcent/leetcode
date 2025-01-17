package com.itangcent.leetcode_152_maximum_product_subarray;

/**
 * Test class for the solution to LeetCode problem #152: maximum-product-subarray
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #152: maximum-product-subarray");
        
        // Test case 1: Example from LeetCode - [2,3,-2,4]
        int[] nums1 = {2, 3, -2, 4};
        int expected1 = 6;
        int result1 = solution.maxProduct(nums1);
        System.out.println("Test case for basic example: " + (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test case 2: Example from LeetCode - [-2,0,-1]
        int[] nums2 = {-2, 0, -1};
        int expected2 = 0;
        int result2 = solution.maxProduct(nums2);
        System.out.println("Test case for array with zero: " + (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test case 3: All negative numbers
        int[] nums3 = {-2, -3, -4};
        int expected3 = 12;  // -2 * -3 * -4 = -24, but -3 * -4 = 12
        int result3 = solution.maxProduct(nums3);
        System.out.println("Test case for all negative numbers: " + (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test case 4: Mixed positive and negative with optimal subarray in the middle
        int[] nums4 = {-2, 3, -4, 5, -2};
        int expected4 = 120;  // 3 * -4 * 5 * -2 = 120
        int result4 = solution.maxProduct(nums4);
        System.out.println("Test case for mixed numbers: " + (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }
        
        // Test case 5: Single element array
        int[] nums5 = {5};
        int expected5 = 5;
        int result5 = solution.maxProduct(nums5);
        System.out.println("Test case for single element array: " + (result5 == expected5 ? "PASSED" : "FAILED"));
        if (result5 != expected5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
        }
    }
}
