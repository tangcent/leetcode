package com.itangcent.leetcode_45_jump_game_ii;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: [2,3,1,1,4]
        int[] nums1 = {2,3,1,1,4};
        System.out.println("Test case 1: [2,3,1,1,4]");
        System.out.println("Expected: 2");
        System.out.println("Actual: " + solution.jump(nums1));
        System.out.println();
        
        // Test case 2: [2,3,0,1,4]
        int[] nums2 = {2,3,0,1,4};
        System.out.println("Test case 2: [2,3,0,1,4]");
        System.out.println("Expected: 2");
        System.out.println("Actual: " + solution.jump(nums2));
        System.out.println();
        
        // Test case 3: [1]
        int[] nums3 = {1};
        System.out.println("Test case 3: [1]");
        System.out.println("Expected: 0");
        System.out.println("Actual: " + solution.jump(nums3));
        System.out.println();
        
        // Test case 4: [1,2,3]
        int[] nums4 = {1,2,3};
        System.out.println("Test case 4: [1,2,3]");
        System.out.println("Expected: 2");
        System.out.println("Actual: " + solution.jump(nums4));
    }
} 