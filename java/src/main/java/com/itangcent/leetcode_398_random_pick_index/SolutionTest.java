package com.itangcent.leetcode_398_random_pick_index;

/**
 * Test class for the solution to LeetCode problem #398: random-pick-index
 */
public class SolutionTest {
    public static void main(String[] args) {
        // Test case 1: Basic test with the example from LeetCode
        int[] nums1 = {1, 2, 3, 3, 3};
        Solution solution1 = new Solution(nums1);
        
        System.out.println("Running tests for LeetCode problem #398: random-pick-index");
        
        // Test picking target 3 multiple times
        System.out.println("Test case for picking target 3 (appears at indices 2, 3, 4):");
        System.out.println("Random pick 1: " + solution1.pick(3));
        System.out.println("Random pick 2: " + solution1.pick(3));
        System.out.println("Random pick 3: " + solution1.pick(3));
        System.out.println("Random pick 4: " + solution1.pick(3));
        System.out.println("Random pick 5: " + solution1.pick(3));
        
        // Test for picking target 2 (only one instance)
        int pickResult = solution1.pick(2);
        System.out.println("\nTest case for picking target 2 (appears only at index 1): " + 
                           (pickResult == 1 ? "PASSED" : "FAILED, got " + pickResult));
        
        // Test for picking target 1 (only one instance)
        pickResult = solution1.pick(1);
        System.out.println("Test case for picking target 1 (appears only at index 0): " + 
                           (pickResult == 0 ? "PASSED" : "FAILED, got " + pickResult));
        
        // Test case 2: Test with larger array
        int[] nums2 = {1, 2, 3, 3, 3, 4, 5, 5, 6, 7, 8, 8, 8, 8};
        Solution solution2 = new Solution(nums2);
        
        // Test picking target 8 multiple times - should return indices 10, 11, 12, or 13
        System.out.println("\nTest case for picking target 8 (appears at indices 10-13):");
        for (int i = 0; i < 5; i++) {
            int result = solution2.pick(8);
            boolean valid = (result >= 10 && result <= 13);
            System.out.println("Random pick " + (i+1) + ": " + result + " - " + 
                              (valid ? "PASSED" : "FAILED"));
        }
        
        // Test case 3: Edge case - single element array
        int[] nums3 = {42};
        Solution solution3 = new Solution(nums3);
        pickResult = solution3.pick(42);
        System.out.println("\nTest case for single element array: " + 
                           (pickResult == 0 ? "PASSED" : "FAILED, got " + pickResult));
    }
}
