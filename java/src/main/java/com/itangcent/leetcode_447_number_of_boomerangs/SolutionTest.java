package com.itangcent.leetcode_447_number_of_boomerangs;

/**
 * Test class for the solution to LeetCode problem #447: number-of-boomerangs
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Example from problem (3 colinear points)
        int[][] points1 = {{0,0}, {1,0}, {2,0}};
        int result1 = solution.numberOfBoomerangs(points1);
        System.out.println("Test case for 3 colinear points: " + (result1 == 2 ? "PASSED" : "FAILED") +
                         " (Expected: 2, Actual: " + result1 + ")");

        // Test case 2: Example from problem (3 points forming line)
        int[][] points2 = {{1,1}, {2,2}, {3,3}};
        int result2 = solution.numberOfBoomerangs(points2);
        System.out.println("Test case for 3 points in line: " + (result2 == 2 ? "PASSED" : "FAILED") +
                         " (Expected: 2, Actual: " + result2 + ")");

        // Test case 3: Single point (should return 0)
        int[][] points3 = {{1,1}};
        int result3 = solution.numberOfBoomerangs(points3);
        System.out.println("Test case for single point: " + (result3 == 0 ? "PASSED" : "FAILED") +
                         " (Expected: 0, Actual: " + result3 + ")");

        // Test case 4: Square formation (4 points)
        int[][] points4 = {{0,0}, {0,1}, {1,0}, {1,1}};
        int result4 = solution.numberOfBoomerangs(points4);
        System.out.println("Test case for square formation: " + (result4 == 8 ? "PASSED" : "FAILED") +
                         " (Expected: 8, Actual: " + result4 + ")");

        // Test case 5: Equilateral triangle approximation
        int[][] points5 = {{0,0}, {4,0}, {2,3}};
        int result5 = solution.numberOfBoomerangs(points5);
        System.out.println("Test case for equilateral triangle: " + (result5 == 2 ? "PASSED" : "FAILED") +
                         " (Expected: 2, Actual: " + result5 + ")");
    }
}
