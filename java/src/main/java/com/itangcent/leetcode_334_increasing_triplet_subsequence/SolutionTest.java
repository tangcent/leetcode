package com.itangcent.leetcode_334_increasing_triplet_subsequence;

/**
 * Test class for the solution to LeetCode problem #334: increasing-triplet-subsequence
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #334: increasing-triplet-subsequence");
        
        // Test case 1: Basic increasing triplet
        boolean result1 = solution.increasingTriplet(new int[]{1, 2, 3, 4, 5});
        System.out.println("Test case for basic increasing sequence: " + (result1 ? "PASSED" : "FAILED"));
        
        // Test case 2: No increasing triplet
        boolean result2 = solution.increasingTriplet(new int[]{5, 4, 3, 2, 1});
        System.out.println("Test case for decreasing sequence: " + (!result2 ? "PASSED" : "FAILED"));
        
        // Test case 3: Increasing triplet not consecutive
        boolean result3 = solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6});
        System.out.println("Test case for non-consecutive triplet: " + (result3 ? "PASSED" : "FAILED"));
        
        // Test case 4: Small array (size < 3)
        boolean result4 = solution.increasingTriplet(new int[]{1, 2});
        System.out.println("Test case for small array: " + (!result4 ? "PASSED" : "FAILED"));
        
        // Test case 5: Exactly 3 elements with triplet
        boolean result5 = solution.increasingTriplet(new int[]{1, 2, 3});
        System.out.println("Test case for exactly 3 elements: " + (result5 ? "PASSED" : "FAILED"));
        
        // Test case 6: Edge case - empty array
        boolean result6 = solution.increasingTriplet(new int[]{});
        System.out.println("Test case for empty array: " + (!result6 ? "PASSED" : "FAILED"));
    }
}
