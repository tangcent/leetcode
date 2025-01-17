package com.itangcent.leetcode_427_construct_quad_tree;

/**
 * Test class for the solution to LeetCode problem #427: construct-quad-tree
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: All 1s (should be a single leaf node with val=true)
        int[][] grid1 = {
                {1, 1},
                {1, 1}
        };
        testQuadTree(solution, grid1, "Test Case 1 (All 1s)");

        // Test case 2: All 0s (should be a single leaf node with val=false)
        int[][] grid2 = {
                {0, 0},
                {0, 0}
        };
        testQuadTree(solution, grid2, "Test Case 2 (All 0s)");

        // Test case 3: Mixed values (should be a non-leaf node)
        int[][] grid3 = {
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1},
                {0, 0, 1, 1}
        };
        testQuadTree(solution, grid3, "Test Case 3 (Mixed values)");

        // Test case 4: Example from the problem
        int[][] grid4 = {
                {0, 1},
                {1, 0}
        };
        testQuadTree(solution, grid4, "Test Case 4 (0,1,1,0)");

        // Test case 5: A larger grid with complex patterns
        int[][] grid5 = {
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 1, 1, 1}
        };
        testQuadTree(solution, grid5, "Test Case 5 (8x8 grid)");
    }

    private static void testQuadTree(Solution solution, int[][] grid, String caseName) {
        Node root = solution.construct(grid);
        System.out.println("Test case for " + caseName + ": " + (validateQuadTree(root, grid, 0, 0, grid.length) ? "PASSED" : "FAILED"));
        System.out.println("Quad Tree: " + root);
        System.out.println();
    }

    private static boolean validateQuadTree(Node node, int[][] grid, int row, int col, int length) {
        if (node.isLeaf) {
            // Check if all values in this section are the same
            boolean expected = grid[row][col] == 1;
            for (int i = row; i < row + length; i++) {
                for (int j = col; j < col + length; j++) {
                    if ((grid[i][j] == 1) != expected) {
                        return false;
                    }
                }
            }
            return node.val == expected;
        } else {
            // Check children
            int halfLength = length / 2;
            return validateQuadTree(node.topLeft, grid, row, col, halfLength) &&
                    validateQuadTree(node.topRight, grid, row, col + halfLength, halfLength) &&
                    validateQuadTree(node.bottomLeft, grid, row + halfLength, col, halfLength) &&
                    validateQuadTree(node.bottomRight, grid, row + halfLength, col + halfLength, halfLength);
        }
    }
}
