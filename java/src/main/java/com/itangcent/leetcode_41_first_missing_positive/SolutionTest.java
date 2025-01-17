package com.itangcent.leetcode_41_first_missing_positive;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Array with positive and negative numbers
        int[] nums1 = {3, 4, -1, 1};
        int result1 = solution.firstMissingPositive(nums1);
        System.out.println("Test case 1: " + result1); // Expected: 2

        // Test case 2: Array with consecutive positive and negative numbers
        int[] nums2 = {1, 2, 0, -3};
        int result2 = solution.firstMissingPositive(nums2);
        System.out.println("Test case 2: " + result2); // Expected: 3

        // Test case 3: Array with all negative numbers
        int[] nums3 = {-3, -2, -1};
        int result3 = solution.firstMissingPositive(nums3);
        System.out.println("Test case 3: " + result3); // Expected: 1

        // Test case 4: Array with large positive and negative numbers
        int[] nums4 = {100, -101, 102};
        int result4 = solution.firstMissingPositive(nums4);
        System.out.println("Test case 4: " + result4); // Expected: 1

        // Test case 5: Larger array with mixed positive and negative numbers
        int[] nums5 = {7, -8, 9, 11, -12, 1, 2, 3, 4, 5, 6};
        int result5 = solution.firstMissingPositive(nums5);
        System.out.println("Test case 5: " + result5); // Expected: 8

        // Test case 6: Larger array with duplicates and negative numbers
        int[] nums6 = {1, -1, 2, -2, 3, -3, 4, -4, 5, -5};
        int result6 = solution.firstMissingPositive(nums6);
        System.out.println("Test case 6: " + result6); // Expected: 6

        // Test case 7: Array with duplicates of the smallest positive number
        int[] nums7 = {1, 1};
        int result7 = solution.firstMissingPositive(nums7);
        System.out.println("Test case 7: " + result7); // Expected: 2
    }
} 