package com.itangcent.leetcode_80_remove_duplicates_from_sorted_array_ii;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1: Standard case
        test(solution, new int[]{1,1,1,2,2,3});

        // Test Case 2: All duplicates
        test(solution, new int[]{1,1,1,1,1,1});

        // Test Case 3: No duplicates
        test(solution, new int[]{1,2,3,4,5});

        // Test Case 4: Empty array
        test(solution, new int[]{});

        // Test Case 5: Array with exactly two duplicates
        test(solution, new int[]{1,1,2,2,3,3});
    }

    private static void test(Solution solution, int[] nums) {
        System.out.println("Input: nums = [");
        for (int num : nums) {
            System.out.print(num + ",");
        }
        System.out.println("]");
        
        int k = solution.removeDuplicates(nums);
        
        System.out.println("Output: k = " + k);
        System.out.print("nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println("]");
        System.out.println();
    }
} 