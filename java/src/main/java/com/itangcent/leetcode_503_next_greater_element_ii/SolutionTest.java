package com.itangcent.leetcode_503_next_greater_element_ii;

import java.util.Arrays;

/**
 * Test class for the solution to LeetCode problem #503: next-greater-element-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Basic case
        int[] input1 = {1, 2, 1};
        int[] expected1 = {2, -1, 2};
        int[] result1 = solution.nextGreaterElements(input1);
        System.out.println("Test case for basic input: " +
            (Arrays.equals(result1, expected1) ? "PASSED" : "FAILED") +
            " (Expected: " + Arrays.toString(expected1) + ", Actual: " + Arrays.toString(result1) + ")");

        // Test case 2: All elements same
        int[] input2 = {5, 5, 5, 5};
        int[] expected2 = {-1, -1, -1, -1};
        int[] result2 = solution.nextGreaterElements(input2);
        System.out.println("Test case for all same elements: " +
            (Arrays.equals(result2, expected2) ? "PASSED" : "FAILED") +
            " (Expected: " + Arrays.toString(expected2) + ", Actual: " + Arrays.toString(result2) + ")");

        // Test case 3: Single element
        int[] input3 = {7};
        int[] expected3 = {-1};
        int[] result3 = solution.nextGreaterElements(input3);
        System.out.println("Test case for single element: " +
            (Arrays.equals(result3, expected3) ? "PASSED" : "FAILED") +
            " (Expected: " + Arrays.toString(expected3) + ", Actual: " + Arrays.toString(result3) + ")");

        // Test case 4: Circular case
        int[] input4 = {3, 8, 4, 1, 2};
        int[] expected4 = {8, -1, 8, 2, 3};
        int[] result4 = solution.nextGreaterElements(input4);
        System.out.println("Test case for circular input: " + 
            (Arrays.equals(result4, expected4) ? "PASSED" : "FAILED") + 
            " (Expected: " + Arrays.toString(expected4) + ", Actual: " + Arrays.toString(result4) + ")");
    }
}
