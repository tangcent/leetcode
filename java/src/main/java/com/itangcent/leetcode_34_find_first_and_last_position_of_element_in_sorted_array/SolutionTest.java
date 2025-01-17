package com.itangcent.leetcode_34_find_first_and_last_position_of_element_in_sorted_array;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Target is present in the array
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = solution.searchRange(nums1, target1);
        System.out.println("Test case 1: " + Arrays.toString(result1)); // Expected: [3, 4]

        // Test case 2: Target is not present in the array
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = solution.searchRange(nums2, target2);
        System.out.println("Test case 2: " + Arrays.toString(result2)); // Expected: [-1, -1]

        // Test case 3: Array is empty
        int[] nums3 = {};
        int target3 = 0;
        int[] result3 = solution.searchRange(nums3, target3);
        System.out.println("Test case 3: " + Arrays.toString(result3)); // Expected: [-1, -1]

        // Test case 4: Single element array, target present
        int[] nums4 = {1};
        int target4 = 1;
        int[] result4 = solution.searchRange(nums4, target4);
        System.out.println("Test case 4: " + Arrays.toString(result4)); // Expected: [0, 0]

        // Test case 5: Single element array, target not present
        int[] nums5 = {1};
        int target5 = 0;
        int[] result5 = solution.searchRange(nums5, target5);
        System.out.println("Test case 5: " + Arrays.toString(result5)); // Expected: [-1, -1]
    }
} 