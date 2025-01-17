package com.itangcent.leetcode_416_partition_equal_subset_sum;

/**
 * Test class for the solution to LeetCode problem #416: partition-equal-subset-sum
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #416: partition-equal-subset-sum");
        
        // Test case 1: Basic partitionable array
        int[] nums1 = {1, 5, 11, 5};
        boolean result1 = solution.canPartition(nums1);
        System.out.println("Test case for basic partitionable array: " + 
            (result1 ? "PASSED" : "FAILED") + " (Expected: true)");
        
        // Test case 2: Non-partitionable array
        int[] nums2 = {1, 2, 3, 5};
        boolean result2 = solution.canPartition(nums2);
        System.out.println("Test case for non-partitionable array: " + 
            (result2 ? "FAILED" : "PASSED") + " (Expected: false)");
            
        // Test case 3: Single element array
        int[] nums3 = {5};
        boolean result3 = solution.canPartition(nums3);
        System.out.println("Test case for single element array: " + 
            (result3 ? "FAILED" : "PASSED") + " (Expected: false)");
            
        // Test case 4: Large array (200 elements)
        int[] nums4 = new int[200];
        java.util.Arrays.fill(nums4, 1);
        nums4[199] = 99; // Makes total sum 298 (149+149)
        boolean result4 = solution.canPartition(nums4);
        System.out.println("Test case for large array: " + 
            (result4 ? "PASSED" : "FAILED") + " (Expected: true)");
    }
}
