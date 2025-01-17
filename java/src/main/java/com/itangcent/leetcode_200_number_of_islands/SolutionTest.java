package com.itangcent.leetcode_200_number_of_islands;

/**
 * Test class for the solution to LeetCode problem #200: number-of-islands
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        testCase(solution, grid1, "1 island (connected horizontally and vertically)", 1);
        
        // Test case 2
        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        testCase(solution, grid2, "3 separate islands", 3);
        
        // Test case 3
        char[][] grid3 = {
            {'1', '0', '1', '0', '1'},
            {'0', '1', '0', '1', '0'},
            {'1', '0', '1', '0', '1'},
            {'0', '1', '0', '1', '0'}
        };
        testCase(solution, grid3, "9 single-cell islands", 10);
        
        // Test case 4
        char[][] grid4 = {
            {'0', '0', '0'},
            {'0', '0', '0'},
            {'0', '0', '0'}
        };
        testCase(solution, grid4, "No islands", 0);
    }
    
    private static void testCase(Solution solution, char[][] grid, String caseName, int expected) {
        // Create a copy of the grid since the solution modifies it
        char[][] gridCopy = new char[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            gridCopy[i] = grid[i].clone();
        }
        
        int result = solution.numIslands(gridCopy);
        boolean passed = result == expected;
        
        System.out.println("Test case for " + caseName + ": " + (passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + result);
        }
    }
}
