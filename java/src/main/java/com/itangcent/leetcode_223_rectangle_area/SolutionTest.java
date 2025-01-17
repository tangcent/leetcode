package com.itangcent.leetcode_223_rectangle_area;

/**
 * Test class for the solution to LeetCode problem #223: rectangle-area
 * 
 * Problem: Find the total area covered by two rectilinear rectangles in a 2D plane.
 * Each rectangle is defined by its bottom left corner and top right corner coordinates.
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #223: rectangle-area");
        
        // Test case 1: Example from LeetCode - two overlapping rectangles
        testComputeArea(solution, -3, 0, 3, 4, 0, -1, 9, 2, 45);
        
        // Test case 2: No overlap between rectangles
        testComputeArea(solution, -2, -2, 2, 2, 3, 3, 6, 6, 25);
        
        // Test case 3: One rectangle inside another
        testComputeArea(solution, -3, -3, 3, 3, -1, -1, 1, 1, 36);
        
        // Test case 4: Partial overlap
        testComputeArea(solution, -5, -2, 5, 1, -3, -3, 3, 3, 48);
        
        // Test case 5: Edge case - rectangles touching at an edge
        testComputeArea(solution, 0, 0, 2, 2, 2, 0, 4, 2, 8);
        
        // Test case 6: Edge case - rectangles touching at a corner
        testComputeArea(solution, 0, 0, 1, 1, 1, 1, 2, 2, 2);
        
        // Test case 7: Negative coordinates
        testComputeArea(solution, -5, -5, -3, -3, -2, -2, 0, 0, 8);
    }
    
    private static void testComputeArea(Solution solution, 
                                        int ax1, int ay1, int ax2, int ay2, 
                                        int bx1, int by1, int bx2, int by2, 
                                        int expected) {
        int actual = solution.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        boolean passed = actual == expected;
        
        System.out.println("Test case for rectangles [(" + ax1 + "," + ay1 + "),(" + ax2 + "," + ay2 + ")] " +
                           "and [(" + bx1 + "," + by1 + "),(" + bx2 + "," + by2 + ")]: " + 
                           (passed ? "PASSED" : "FAILED"));
        
        if (!passed) {
            System.out.println("  Expected: " + expected + ", Actual: " + actual);
        }
    }
}
