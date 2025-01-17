package com.itangcent.leetcode_154_find_minimum_in_rotated_sorted_array_ii;

/**
 * Test class for the solution to LeetCode problem #154: find-minimum-in-rotated-sorted-array-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #154: find-minimum-in-rotated-sorted-array-ii");
        
        // Test case 1: Standard rotated array with duplicates
        int[] nums1 = {3, 3, 1, 3};
        testFindMin(solution, nums1, 1);
        
        // Test case 2: Another rotated array with duplicates
        int[] nums2 = {2, 2, 2, 0, 1};
        testFindMin(solution, nums2, 0);
        
        // Test case 3: Not rotated array with duplicates
        int[] nums3 = {1, 1, 2, 2, 3, 3};
        testFindMin(solution, nums3, 1);
        
        // Test case 4: All elements are the same
        int[] nums4 = {5, 5, 5, 5, 5};
        testFindMin(solution, nums4, 5);
        
        // Test case 5: Rotated array with many duplicates
        int[] nums5 = {4, 5, 6, 7, 0, 1, 1, 2, 2, 2, 4, 4};
        testFindMin(solution, nums5, 0);
        
        // Test case 6: Array with only one element
        int[] nums6 = {7};
        testFindMin(solution, nums6, 7);
        
        // Test case 7: Complex rotation with duplicates at pivot
        int[] nums7 = {10, 10, 10, 1, 10};
        testFindMin(solution, nums7, 1);
    }
    
    private static void testFindMin(Solution solution, int[] nums, int expected) {
        int actual = solution.findMin(nums);
        boolean passed = actual == expected;
        
        System.out.print("Test case for array [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]: ");
        
        if (passed) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + actual);
        }
    }
}
