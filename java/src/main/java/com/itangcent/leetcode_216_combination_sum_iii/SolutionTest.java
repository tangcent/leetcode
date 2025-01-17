package com.itangcent.leetcode_216_combination_sum_iii;

import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #216: combination-sum-iii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #216: combination-sum-iii");
        
        // Test case 1: Find all valid combinations of k=3, n=7
        List<List<Integer>> result1 = solution.combinationSum3(3, 7);
        List<List<Integer>> expected1 = Arrays.asList(
            Arrays.asList(1, 2, 4)
        );
        boolean passed1 = compareResults(expected1, result1);
        System.out.println("Test case for k=3, n=7: " + (passed1 ? "PASSED" : "FAILED"));
        if (!passed1) {
            System.out.println("Expected: " + expected1);
            System.out.println("Actual: " + result1);
        }
        
        // Test case 2: Find all valid combinations of k=3, n=9
        List<List<Integer>> result2 = solution.combinationSum3(3, 9);
        List<List<Integer>> expected2 = Arrays.asList(
            Arrays.asList(1, 2, 6),
            Arrays.asList(1, 3, 5),
            Arrays.asList(2, 3, 4)
        );
        boolean passed2 = compareResults(expected2, result2);
        System.out.println("Test case for k=3, n=9: " + (passed2 ? "PASSED" : "FAILED"));
        if (!passed2) {
            System.out.println("Expected: " + expected2);
            System.out.println("Actual: " + result2);
        }
        
        // Test case 3: Find all valid combinations of k=4, n=1
        List<List<Integer>> result3 = solution.combinationSum3(4, 1);
        List<List<Integer>> expected3 = Arrays.asList();
        boolean passed3 = compareResults(expected3, result3);
        System.out.println("Test case for k=4, n=1: " + (passed3 ? "PASSED" : "FAILED"));
        if (!passed3) {
            System.out.println("Expected: " + expected3);
            System.out.println("Actual: " + result3);
        }
        
        // Test case 4: Find all valid combinations of k=2, n=10
        List<List<Integer>> result4 = solution.combinationSum3(2, 10);
        List<List<Integer>> expected4 = Arrays.asList(
            Arrays.asList(1, 9),
            Arrays.asList(2, 8),
            Arrays.asList(3, 7),
            Arrays.asList(4, 6)
        );
        boolean passed4 = compareResults(expected4, result4);
        System.out.println("Test case for k=2, n=10: " + (passed4 ? "PASSED" : "FAILED"));
        if (!passed4) {
            System.out.println("Expected: " + expected4);
            System.out.println("Actual: " + result4);
        }
    }
    
    // Helper method to compare two lists of lists regardless of order
    private static boolean compareResults(List<List<Integer>> expected, List<List<Integer>> actual) {
        if (expected.size() != actual.size()) {
            return false;
        }
        
        // Sort each inner list for comparison
        for (List<Integer> list : expected) {
            list.sort(null);
        }
        for (List<Integer> list : actual) {
            list.sort(null);
        }
        
        // Sort outer lists lexicographically for comparison
        expected.sort((a, b) -> {
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                int cmp = a.get(i).compareTo(b.get(i));
                if (cmp != 0) return cmp;
            }
            return Integer.compare(a.size(), b.size());
        });
        
        actual.sort((a, b) -> {
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                int cmp = a.get(i).compareTo(b.get(i));
                if (cmp != 0) return cmp;
            }
            return Integer.compare(a.size(), b.size());
        });
        
        // Compare each list
        for (int i = 0; i < expected.size(); i++) {
            if (!expected.get(i).equals(actual.get(i))) {
                return false;
            }
        }
        
        return true;
    }
}
