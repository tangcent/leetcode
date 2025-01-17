package com.itangcent.leetcode_229_majority_element_ii;

import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #229: majority-element-ii
 * 
 * Problem: Given an integer array of size n, find all elements that appear more than ⌊n/3⌋ times.
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #229: majority-element-ii");
        
        // Test case 1: Example from LeetCode - [3,2,3]
        int[] nums1 = {3, 2, 3};
        List<Integer> expected1 = Arrays.asList(3);
        List<Integer> result1 = solution.majorityElement(nums1);
        System.out.println("Test case for Example 1: " + (compareResults(expected1, result1) ? "PASSED" : "FAILED"));
        if (!compareResults(expected1, result1)) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test case 2: Example from LeetCode - [1,2]
        int[] nums2 = {1, 2};
        List<Integer> expected2 = Arrays.asList(1, 2);
        List<Integer> result2 = solution.majorityElement(nums2);
        System.out.println("Test case for Example 2: " + (compareResults(expected2, result2) ? "PASSED" : "FAILED"));
        if (!compareResults(expected2, result2)) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test case 3: Example from LeetCode - [1]
        int[] nums3 = {1};
        List<Integer> expected3 = Arrays.asList(1);
        List<Integer> result3 = solution.majorityElement(nums3);
        System.out.println("Test case for Example 3: " + (compareResults(expected3, result3) ? "PASSED" : "FAILED"));
        if (!compareResults(expected3, result3)) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test case 4: More complex example with multiple majority elements
        int[] nums4 = {1, 1, 1, 2, 2, 2, 3, 4};
        List<Integer> expected4 = Arrays.asList(1, 2);
        List<Integer> result4 = solution.majorityElement(nums4);
        System.out.println("Test case for Complex Example: " + (compareResults(expected4, result4) ? "PASSED" : "FAILED"));
        if (!compareResults(expected4, result4)) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }
        
        // Test case 5: Empty array
        int[] nums5 = {};
        List<Integer> expected5 = Arrays.asList();
        List<Integer> result5 = solution.majorityElement(nums5);
        System.out.println("Test case for Empty Array: " + (compareResults(expected5, result5) ? "PASSED" : "FAILED"));
        if (!compareResults(expected5, result5)) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
        }
    }
    
    /**
     * Helper method to compare two lists regardless of order
     */
    private static boolean compareResults(List<Integer> expected, List<Integer> actual) {
        if (expected.size() != actual.size()) {
            return false;
        }
        return expected.containsAll(actual) && actual.containsAll(expected);
    }
}
