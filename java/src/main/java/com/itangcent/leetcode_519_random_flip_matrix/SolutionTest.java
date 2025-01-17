package com.itangcent.leetcode_519_random_flip_matrix;

/**
 * Test class for the solution to LeetCode problem #519: random-flip-matrix
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution(3, 3); // 3x3 matrix for testing
        
        System.out.println("Running tests for LeetCode problem #519: random-flip-matrix");
        
        // Test 1: Flip should return valid coordinates
        int[] flip1 = solution.flip();
        boolean valid1 = flip1[0] >= 0 && flip1[0] < 3 && flip1[1] >= 0 && flip1[1] < 3;
        System.out.println("Test case for valid_flip_coordinates: " + (valid1 ? "PASSED" : "FAILED"));
        
        // Test 2: All cells should be eventually flipped
        boolean[][] flipped = new boolean[3][3];
        solution.reset();
        for (int i = 0; i < 9; i++) {
            int[] coord = solution.flip();
            flipped[coord[0]][coord[1]] = true;
        }
        boolean allFlipped = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!flipped[i][j]) {
                    allFlipped = false;
                    break;
                }
            }
        }
        System.out.println("Test case for all_cells_flipped: " + (allFlipped ? "PASSED" : "FAILED"));
        
        // Test 3: Reset should allow new flips
        solution.reset();
        int[] flipAfterReset = solution.flip();
        boolean validAfterReset = flipAfterReset[0] >= 0 && flipAfterReset[0] < 3 && 
                                flipAfterReset[1] >= 0 && flipAfterReset[1] < 3;
        System.out.println("Test case for valid_flip_after_reset: " + (validAfterReset ? "PASSED" : "FAILED"));
    }
}
