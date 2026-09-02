package com.itangcent.leetcode_240_search_a_2_d_matrix_ii;

/**
 * Test class for the solution to LeetCode problem #240: search-a-2-d-matrix-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #240: search-a-2-d-matrix-ii");
        
        // Test case 1: LeetCode Example 1
        int[][] matrix1 = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int target1 = 5;
        boolean expected1 = true;
        boolean result1 = solution.searchMatrix(matrix1, target1);
        System.out.println("Test case for finding " + target1 + ": " + 
                          (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test case 2: LeetCode Example 2
        int[][] matrix2 = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int target2 = 20;
        boolean expected2 = false;
        boolean result2 = solution.searchMatrix(matrix2, target2);
        System.out.println("Test case for finding " + target2 + ": " + 
                          (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test case 3: Empty matrix
        int[][] matrix3 = {};
        int target3 = 0;
        boolean expected3 = false;
        boolean result3 = solution.searchMatrix(matrix3, target3);
        System.out.println("Test case for empty matrix: " + 
                          (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test case 4: Target at the top-right corner
        int[][] matrix4 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target4 = 3;
        boolean expected4 = true;
        boolean result4 = solution.searchMatrix(matrix4, target4);
        System.out.println("Test case for finding " + target4 + " at corner: " + 
                          (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }
        
        // Test case 5: Target at the bottom-left corner
        int[][] matrix5 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target5 = 7;
        boolean expected5 = true;
        boolean result5 = solution.searchMatrix(matrix5, target5);
        System.out.println("Test case for finding " + target5 + " at corner: " + 
                          (result5 == expected5 ? "PASSED" : "FAILED"));
        if (result5 != expected5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
        }
    }
}
