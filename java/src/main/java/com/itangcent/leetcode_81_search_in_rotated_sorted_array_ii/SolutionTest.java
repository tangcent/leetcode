package com.itangcent.leetcode_81_search_in_rotated_sorted_array_ii;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1: Example from LeetCode
        int[] nums1 = {2,5,6,0,0,1,2};
        int target1 = 0;
        System.out.println("Test Case 1: " + solution.search(nums1, target1)); // Expected: true
        
        // Test Case 2: Example from LeetCode
        int[] nums2 = {2,5,6,0,0,1,2};
        int target2 = 3;
        System.out.println("Test Case 2: " + solution.search(nums2, target2)); // Expected: false

        // Test Case 3: Array with duplicates at rotation point
        int[] nums3 = {1,0,1,1,1};
        int target3 = 0;
        System.out.println("Test Case 3: " + solution.search(nums3, target3)); // Expected: true

        // Test Case 4: Single element array
        int[] nums4 = {1};
        int target4 = 1;
        System.out.println("Test Case 4: " + solution.search(nums4, target4)); // Expected: true

        // Test Case 5: Empty array
        int[] nums5 = {};
        int target5 = 5;
        System.out.println("Test Case 5: " + solution.search(nums5, target5)); // Expected: false
    }
} 