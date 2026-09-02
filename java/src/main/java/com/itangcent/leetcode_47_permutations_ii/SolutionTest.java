package com.itangcent.leetcode_47_permutations_ii;

import java.util.List;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
//
//        // Test case 1: [1,1,2]
//        int[] nums1 = {1,1,2};
//        System.out.println("Test case 1: [1,1,2]");
//        System.out.println("Expected: [[1,1,2],[1,2,1],[2,1,1]]");
//        System.out.println("Actual: " + solution.permuteUnique(nums1));
//        System.out.println();
//
//        // Test case 2: [1,2,3]
//        int[] nums2 = {1,2,3};
//        System.out.println("Test case 2: [1,2,3]");
//        System.out.println("Expected: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]");
//        System.out.println("Actual: " + solution.permuteUnique(nums2));
//        System.out.println();
//
//        // Test case 3: [1,1,1]
//        int[] nums3 = {1,1,1};
//        System.out.println("Test case 3: [1,1,1]");
//        System.out.println("Expected: [[1,1,1]]");
//        System.out.println("Actual: " + solution.permuteUnique(nums3));
//        System.out.println();
//
        // Test case 4: [1,2,2,2]
        int[] nums4 = {1,2,2,2};
        System.out.println("Test case 4: [1,2,2,2]");
        System.out.println("Expected: 4 permutations");
        List<List<Integer>> result4 = solution.permuteUnique(nums4);
        System.out.println("Actual number of permutations: " + result4.size());
        System.out.println("All permutations: " + result4);
    }
} 