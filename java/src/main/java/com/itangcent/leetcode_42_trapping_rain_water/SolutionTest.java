package com.itangcent.leetcode_42_trapping_rain_water;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Simple case
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result1 = solution.trap(height1);
        System.out.println("Test case 1: " + result1); // Expected: 6

        // Test case 2: No trapping
        int[] height2 = {1,2,3,4,5};
        int result2 = solution.trap(height2);
        System.out.println("Test case 2: " + result2); // Expected: 0

        // Test case 3: All same height
        int[] height3 = {3,3,3,3};
        int result3 = solution.trap(height3);
        System.out.println("Test case 3: " + result3); // Expected: 0
    }
} 