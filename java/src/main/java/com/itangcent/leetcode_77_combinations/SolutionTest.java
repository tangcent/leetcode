package com.itangcent.leetcode_77_combinations;

import java.util.*;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1: Standard case
        test(solution, 4, 2);
        
        // Test Case 2: Minimal case
        test(solution, 1, 1);

        // Test Case 3: All elements case
        test(solution, 3, 3);
        
        // Test Case 4: Larger numbers
        test(solution, 5, 3);
        
        // Test Case 5: Edge case - half of elements
        test(solution, 6, 3);
        
        // Test Case 6: Another standard case
        test(solution, 4, 3);
    }

    private static void test(Solution solution, int n, int k) {
        System.out.println("Input: n = " + n + ", k = " + k);
        List<List<Integer>> result = solution.combine(n, k);
        System.out.println("Output: " + result);
        System.out.println("Number of combinations: " + result.size());
        System.out.println();
    }
} 