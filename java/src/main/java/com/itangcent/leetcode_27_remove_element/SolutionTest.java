package com.itangcent.leetcode_27_remove_element;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Basic case
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("Test case 1:");
        System.out.println("Input array: " + Arrays.toString(nums1));
        System.out.println("Value to remove: " + val1);
        System.out.println("New length: " + k1);
        System.out.println("First k elements: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, k1)));
        
        // Test case 2: All elements are the same
        int[] nums2 = {2, 2, 2, 2};
        int val2 = 2;
        int k2 = solution.removeElement(nums2, val2);
        System.out.println("\nTest case 2:");
        System.out.println("Input array: " + Arrays.toString(nums2));
        System.out.println("Value to remove: " + val2);
        System.out.println("New length: " + k2);
        System.out.println("First k elements: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, k2)));
        
        // Test case 3: Empty array
        int[] nums3 = {};
        int val3 = 1;
        int k3 = solution.removeElement(nums3, val3);
        System.out.println("\nTest case 3:");
        System.out.println("Input array: " + Arrays.toString(nums3));
        System.out.println("Value to remove: " + val3);
        System.out.println("New length: " + k3);

        // Test case 4: Single element to remove
        int[] nums4 = {1};
        int val4 = 1;
        int k4 = solution.removeElement(nums4, val4);
        System.out.println("\nTest case 4:");
        System.out.println("Input array: " + Arrays.toString(nums4));
        System.out.println("Value to remove: " + val4);
        System.out.println("New length: " + k4);
        System.out.println("First k elements: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, k4)));
    }
} 