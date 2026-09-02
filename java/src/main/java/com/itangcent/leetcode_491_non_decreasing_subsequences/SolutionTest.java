package com.itangcent.leetcode_491_non_decreasing_subsequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #491: non-decreasing-subsequences
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #491: non-decreasing-subsequences");

        // Test case 1: Empty array
        testCase(solution, new int[]{}, new ArrayList<>(), "Empty array");

        // Test case 2: Single element
        testCase(solution, new int[]{1}, new ArrayList<>(), "Single element");
        
        // Test case 3: Simple increasing sequence
        testCase(solution, new int[]{1, 2, 3}, Arrays.asList(
            Arrays.asList(1, 2),
            Arrays.asList(1, 2, 3),
            Arrays.asList(1, 3),
            Arrays.asList(2, 3)
        ), "Simple increasing sequence");
        
        // Test case 4: Sequence with duplicates
        testCase(solution, new int[]{4, 6, 7, 7}, Arrays.asList(
            Arrays.asList(4, 6),
            Arrays.asList(4, 6, 7),
            Arrays.asList(4, 6, 7, 7),
            Arrays.asList(4, 7),
            Arrays.asList(4, 7, 7),
            Arrays.asList(6, 7, 7),
            Arrays.asList(6, 7),
            Arrays.asList(7, 7)
        ), "Sequence with duplicates");
        
        // Test case 5: Mixed sequence
        testCase(solution, new int[]{4, 4, 3, 2, 1}, Arrays.asList(
            Arrays.asList(4, 4)
        ), "Mixed sequence");
    }
    
    private static void testCase(Solution solution, int[] input, List<List<Integer>> expected, String caseName) {
        List<List<Integer>> actual = solution.findSubsequences(input);
        if (compareResults(expected, actual)) {
            System.out.println("Test case for " + caseName + ": PASSED");
        } else {
            System.out.println("Test case for " + caseName + ": FAILED");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
        }
    }
    
    private static boolean compareResults(List<List<Integer>> expected, List<List<Integer>> actual) {
        if (expected.size() != actual.size()) {
            return false;
        }
        for (List<Integer> list : expected) {
            if (!actual.contains(list)) {
                return false;
            }
        }
        return true;
    }
}
