package com.itangcent.leetcode_118_pascals_triangle;

import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #118: pascals-triangle
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #118: pascals-triangle");
        
        // Test case 1: 0 rows
        System.out.println("\nTest case 1: 0 rows");
        List<List<Integer>> result1 = solution.generate(0);
        System.out.println("Expected: [], Actual: " + result1);
        
        // Test case 2: 1 row
        System.out.println("\nTest case 2: 1 row");
        List<List<Integer>> result2 = solution.generate(1);
        System.out.println("Expected: [[1]], Actual: " + result2);
        
        // Test case 3: 5 rows
        System.out.println("\nTest case 3: 5 rows");
        List<List<Integer>> result3 = solution.generate(5);
        System.out.println("Expected: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]], Actual: " + result3);
        
        // Test case 4: 10 rows
        System.out.println("\nTest case 4: 10 rows");
        List<List<Integer>> result4 = solution.generate(10);
        System.out.println("Rows of 10-row triangle:");
        for (int i = 0; i < 10; i++) {
            System.out.println(result4.get(i));
        }
    }
}
