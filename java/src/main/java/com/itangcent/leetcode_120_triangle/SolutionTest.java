package com.itangcent.leetcode_120_triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #120: triangle
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Example from problem
        List<List<Integer>> triangle1 = new ArrayList<>();
        triangle1.add(Arrays.asList(2));
        triangle1.add(Arrays.asList(3, 4));
        triangle1.add(Arrays.asList(6, 5, 7));
        triangle1.add(Arrays.asList(4, 1, 8, 3));
        int result1 = solution.minimumTotal(triangle1);
        System.out.println("Test case for example triangle: " + (result1 == 11 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 11, Actual: " + result1);

        // Test case 2: Single row triangle
        List<List<Integer>> triangle2 = new ArrayList<>();
        triangle2.add(Arrays.asList(5));
        int result2 = solution.minimumTotal(triangle2);
        System.out.println("Test case for single row triangle: " + (result2 == 5 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 5, Actual: " + result2);

        // Test case 3: Two rows triangle
        List<List<Integer>> triangle3 = new ArrayList<>();
        triangle3.add(Arrays.asList(1));
        triangle3.add(Arrays.asList(2, 3));
        int result3 = solution.minimumTotal(triangle3);
        System.out.println("Test case for two rows triangle: " + (result3 == 3 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 3, Actual: " + result3);

        // Test case 4: All negative numbers
        List<List<Integer>> triangle4 = new ArrayList<>();
        triangle4.add(Arrays.asList(-1));
        triangle4.add(Arrays.asList(-2, -3));
        triangle4.add(Arrays.asList(-4, -5, -6));
        int result4 = solution.minimumTotal(triangle4);
        System.out.println("Test case for all negative numbers: " + (result4 == -10 ? "PASSED" : "FAILED"));
        System.out.println("Expected: -10, Actual: " + result4);

        // Test case 5: Large triangle
        List<List<Integer>> triangle5 = new ArrayList<>();
        triangle5.add(Arrays.asList(1));
        triangle5.add(Arrays.asList(2, 3));
        triangle5.add(Arrays.asList(4, 5, 6));
        triangle5.add(Arrays.asList(7, 8, 9, 10));
        triangle5.add(Arrays.asList(11, 12, 13, 14, 15));
        int result5 = solution.minimumTotal(triangle5);
        System.out.println("Test case for large triangle: " + (result5 == 20 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 25, Actual: " + result5);
    }
}
