package com.itangcent.leetcode_33_search_in_rotated_sorted_array;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Target is in the array
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println("Test case 1: " + (solution.search(nums1, target1) == 4)); // Expected: true

        // Test case 2: Target is not in the array
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println("Test case 2: " + (solution.search(nums2, target2) == -1)); // Expected: true

        // Test case 3: Array is not rotated
        int[] nums3 = {1, 2, 3, 4, 5, 6, 7};
        int target3 = 5;
        System.out.println("Test case 3: " + (solution.search(nums3, target3) == 4)); // Expected: true

        // Test case 4: Single element array
        int[] nums4 = {1};
        int target4 = 0;
        System.out.println("Test case 4: " + (solution.search(nums4, target4) == -1)); // Expected: true

        // Test case 5: Empty array
        int[] nums5 = {};
        int target5 = 1;
        System.out.println("Test case 5: " + (solution.search(nums5, target5) == -1)); // Expected: true

        // Test case 6: Target is the first element in a rotated array
        int[] nums6 = {5, 1, 3};
        int target6 = 5;
        System.out.println("Test case 6: " + (solution.search(nums6, target6) == 0)); // Expected: true
    }
} 