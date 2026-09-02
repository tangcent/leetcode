package com.itangcent.leetcode_90_subsets_ii;

import java.util.List;
import java.util.Arrays;

/**
 * Test class for the solution to LeetCode problem #90: subsets-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #90: subsets-ii");
        
        // Test case 1: [1,2,2]
        int[] nums1 = {1, 2, 2};
        System.out.println("\nTest case 1: [1,2,2]");
        List<List<Integer>> result1 = solution.subsetsWithDup(nums1);
        System.out.println("Result: " + result1);
        
        // Test case 2: [0]
        int[] nums2 = {0};
        System.out.println("\nTest case 2: [0]");
        List<List<Integer>> result2 = solution.subsetsWithDup(nums2);
        System.out.println("Result: " + result2);
        
        // Test case 3: [1,1,2,2]
        int[] nums3 = {1, 1, 2, 2};
        System.out.println("\nTest case 3: [1,1,2,2]");
        List<List<Integer>> result3 = solution.subsetsWithDup(nums3);
        System.out.println("Result: " + result3);
    }
}
