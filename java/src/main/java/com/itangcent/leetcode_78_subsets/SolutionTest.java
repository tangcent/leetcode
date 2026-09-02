package com.itangcent.leetcode_78_subsets;

import java.util.*;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1: Standard case
        test(solution, new int[]{1,2,3});
        
        // Test Case 2: Empty array
        test(solution, new int[]{});
        
        // Test Case 3: Single element
        test(solution, new int[]{1});
        
        // Test Case 4: Two elements
        test(solution, new int[]{1,2});
        
        // Test Case 5: Array with negative numbers
        test(solution, new int[]{-1,0,1});
        
        // Test Case 6: Larger array
        test(solution, new int[]{1,2,3,4});
    }

    private static void test(Solution solution, int[] nums) {
        System.out.println("Input: nums = " + Arrays.toString(nums));
        List<List<Integer>> result = solution.subsets(nums);
        System.out.println("Output: " + result);
        System.out.println("Number of subsets: " + result.size());
        System.out.println();
    }
} 