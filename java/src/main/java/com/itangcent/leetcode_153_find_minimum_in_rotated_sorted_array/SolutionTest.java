package com.itangcent.leetcode_153_find_minimum_in_rotated_sorted_array;

/**
 * Test class for the solution to LeetCode problem #153: find-minimum-in-rotated-sorted-array
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #153: Find Minimum in Rotated Sorted Array");
        
        // Test case 1: Standard rotated array
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        testFindMin(solution, nums1, 0);
        
        // Test case 2: Another rotated array
        int[] nums2 = {3, 4, 5, 1, 2};
        testFindMin(solution, nums2, 1);
        
        // Test case 3: Not rotated (minimum at the beginning)
        int[] nums3 = {1, 2, 3, 4, 5};
        testFindMin(solution, nums3, 1);
        
        // Test case 4: Rotated by n-1 (minimum at the end)
        int[] nums4 = {2, 3, 4, 5, 1};
        testFindMin(solution, nums4, 1);
        
        // Test case 5: Only two elements
        int[] nums5 = {2, 1};
        testFindMin(solution, nums5, 1);
        
        // Test case 6: Single element
        int[] nums6 = {7};
        testFindMin(solution, nums6, 7);
        
        // Test case 7: Larger rotated array
        int[] nums7 = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        testFindMin(solution, nums7, 1);
    }
    
    private static void testFindMin(Solution solution, int[] nums, int expected) {
        int result = solution.findMin(nums);
        boolean passed = result == expected;
        
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
            System.out.println("  Actual: " + result);
        }
    }
}
