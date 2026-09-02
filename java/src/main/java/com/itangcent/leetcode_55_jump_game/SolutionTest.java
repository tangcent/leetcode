package com.itangcent.leetcode_55_jump_game;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: [2,3,1,1,4]
        System.out.println("Test case 1: [2,3,1,1,4]");
        int[] nums1 = {2,3,1,1,4};
        boolean result1 = solution.canJump(nums1);
        System.out.println("Result: " + result1);
        System.out.println();

        // Test case 2: [3,2,1,0,4]
        System.out.println("Test case 2: [3,2,1,0,4]");
        int[] nums2 = {3,2,1,0,4};
        boolean result2 = solution.canJump(nums2);
        System.out.println("Result: " + result2);
        System.out.println();

        // Test case 3: [0]
        System.out.println("Test case 3: [0]");
        int[] nums3 = {0};
        boolean result3 = solution.canJump(nums3);
        System.out.println("Result: " + result3);
        System.out.println();

        // Test case 4: [2,0]
        System.out.println("Test case 4: [2,0]");
        int[] nums4 = {2,0};
        boolean result4 = solution.canJump(nums4);
        System.out.println("Result: " + result4);
        System.out.println();

        // Test case 5: [1,2,3]
        System.out.println("Test case 5: [1,2,3]");
        int[] nums5 = {1,2,3};
        boolean result5 = solution.canJump(nums5);
        System.out.println("Result: " + result5);
        System.out.println();
    }
} 