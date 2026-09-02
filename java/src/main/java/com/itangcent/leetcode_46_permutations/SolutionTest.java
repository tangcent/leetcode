package com.itangcent.leetcode_46_permutations;

import java.util.List;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: [1,2,3]
        int[] nums1 = {1,2,3};
        System.out.println("Test case 1: [1,2,3]");
        System.out.println("Expected: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]");
        System.out.println("Actual: " + solution.permute(nums1));
        System.out.println();
        
        // Test case 2: [0,1]
        int[] nums2 = {0,1};
        System.out.println("Test case 2: [0,1]");
        System.out.println("Expected: [[0,1],[1,0]]");
        System.out.println("Actual: " + solution.permute(nums2));
        System.out.println();
        
        // Test case 3: [1]
        int[] nums3 = {1};
        System.out.println("Test case 3: [1]");
        System.out.println("Expected: [[1]]");
        System.out.println("Actual: " + solution.permute(nums3));
        System.out.println();
        
        // Test case 4: [1,2,3,4]
        int[] nums4 = {1,2,3,4};
        System.out.println("Test case 4: [1,2,3,4]");
        System.out.println("Expected: 24 permutations");
        List<List<Integer>> result4 = solution.permute(nums4);
        System.out.println("Actual number of permutations: " + result4.size());
        System.out.println("First few permutations: " + result4.subList(0, 3));
    }
} 