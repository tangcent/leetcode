package com.itangcent.leetcode_149_max_points_on_a_line;

/**
 * Test class for the solution to LeetCode problem #149: max-points-on-a-line
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Points on a single line
        int[][] points1 = {{1, 1}, {2, 2}, {3, 3}};
        test(1, 3, solution.maxPoints(points1));
        
        // Test case 2: Points on multiple lines
        int[][] points2 = {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
        test(2, 4, solution.maxPoints(points2));
        
        // Test case 3: Duplicate points
        int[][] points3 = {{1, 1}, {1, 1}, {2, 2}, {3, 3}};
        test(3, 4, solution.maxPoints(points3));
        
        // Test case 4: Vertical line
        int[][] points4 = {{1, 1}, {1, 2}, {1, 3}, {1, 4}, {2, 1}};
        test(4, 4, solution.maxPoints(points4));

        // Test case 5: LeetCode example
        int[][] points5 = {{1, 1}, {2, 2}, {3, 3}, {4, 1}, {5, 3}, {6, 5}};
        test(5, 3, solution.maxPoints(points5));
        
        // Test case 6: Empty array
        int[][] points6 = {};
        test(6, 0, solution.maxPoints(points6));
        
        // Test case 7: Single point
        int[][] points7 = {{1, 1}};
        test(7, 1, solution.maxPoints(points7));
    }
    
    private static void test(int caseNum, int expected, int actual) {
        boolean passed = expected == actual;
        System.out.println("Test case for case " + caseNum + ": " + (passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + actual);
        }
    }
}
