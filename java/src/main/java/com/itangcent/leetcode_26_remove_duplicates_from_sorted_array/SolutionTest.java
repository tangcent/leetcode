package com.itangcent.leetcode_26_remove_duplicates_from_sorted_array;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Normal case with duplicates
        int[] nums1 = {1, 1, 2, 2, 3, 4, 4};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Test case 1:");
        System.out.println("Input array: " + Arrays.toString(nums1));
        System.out.println("Length of unique elements: " + k1);
        System.out.println("First " + k1 + " elements: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, k1)));

        // Test case 2: Array with no duplicates
        int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("\nTest case 2:");
        System.out.println("Input array: " + Arrays.toString(nums2));
        System.out.println("Length of unique elements: " + k2);
        System.out.println("First " + k2 + " elements: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, k2)));

        // Test case 3: Array with all duplicates
        int[] nums3 = {1, 1, 1, 1, 1};
        int k3 = solution.removeDuplicates(nums3);
        System.out.println("\nTest case 3:");
        System.out.println("Input array: " + Arrays.toString(nums3));
        System.out.println("Length of unique elements: " + k3);
        System.out.println("First " + k3 + " elements: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, k3)));

        // Test case 4: Empty array
        int[] nums4 = {};
        int k4 = solution.removeDuplicates(nums4);
        System.out.println("\nTest case 4:");
        System.out.println("Input array: " + Arrays.toString(nums4));
        System.out.println("Length of unique elements: " + k4);

        // Test case 5: Single element array
        int[] nums5 = {1};
        int k5 = solution.removeDuplicates(nums5);
        System.out.println("\nTest case 5:");
        System.out.println("Input array: " + Arrays.toString(nums5));
        System.out.println("Length of unique elements: " + k5);
        System.out.println("First " + k5 + " elements: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, k5)));
    }
} 