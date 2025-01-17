package com.itangcent.leetcode_167_two_sum_ii_input_array_is_sorted;

import java.util.Arrays;

/**
 * Test class for the solution to LeetCode problem #167: two-sum-ii-input-array-is-sorted
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {1, 2};
        int[] result1 = solution.twoSum(numbers1, target1);
        System.out.println("Test case for numbers=[2,7,11,15], target=9: " + 
                (Arrays.equals(result1, expected1) ? "PASSED" : "FAILED"));
        if (!Arrays.equals(result1, expected1)) {
            System.out.println("  Expected: " + Arrays.toString(expected1));
            System.out.println("  Actual: " + Arrays.toString(result1));
        }
        
        // Test case 2
        int[] numbers2 = {2, 3, 4};
        int target2 = 6;
        int[] expected2 = {1, 3};
        int[] result2 = solution.twoSum(numbers2, target2);
        System.out.println("Test case for numbers=[2,3,4], target=6: " + 
                (Arrays.equals(result2, expected2) ? "PASSED" : "FAILED"));
        if (!Arrays.equals(result2, expected2)) {
            System.out.println("  Expected: " + Arrays.toString(expected2));
            System.out.println("  Actual: " + Arrays.toString(result2));
        }
        
        // Test case 3
        int[] numbers3 = {-1, 0};
        int target3 = -1;
        int[] expected3 = {1, 2};
        int[] result3 = solution.twoSum(numbers3, target3);
        System.out.println("Test case for numbers=[-1,0], target=-1: " + 
                (Arrays.equals(result3, expected3) ? "PASSED" : "FAILED"));
        if (!Arrays.equals(result3, expected3)) {
            System.out.println("  Expected: " + Arrays.toString(expected3));
            System.out.println("  Actual: " + Arrays.toString(result3));
        }
    }
}
