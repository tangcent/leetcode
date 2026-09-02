package com.itangcent.leetcode_289_game_of_life;

/**
 * Test class for the solution to LeetCode problem #289: game-of-life
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test 1: Live cell with fewer than 2 live neighbors dies
        int[][] board1 = {{0,1,0},{0,0,0},{0,0,0}};
        int[][] expected1 = {{0,0,0},{0,0,0},{0,0,0}};
        testCase(solution, "Live cell with <2 neighbors dies", board1, expected1);
        
        // Test 2: Live cell with 2-3 live neighbors lives
        int[][] board2 = {{1,1,0},{1,0,0},{0,0,0}};
        int[][] expected2 = {{1,1,0},{1,1,0},{0,0,0}};
        testCase(solution, "Live cell with 2-3 neighbors lives", board2, expected2);
        
        // Test 3: Live cell with more than 3 live neighbors dies
        int[][] board3 = {{1,1,1},{1,1,0},{0,0,0}};
        int[][] expected3 = {{1,0,1},{1,0,1},{0,0,0}};
        testCase(solution, "Live cell with >3 neighbors dies", board3, expected3);
        
        // Test 4: Dead cell with exactly 3 live neighbors becomes alive
        int[][] board4 = {{1,1,0},{1,0,0},{0,0,0}};
        int[][] expected4 = {{1,1,0},{1,1,0},{0,0,0}};
        testCase(solution, "Dead cell with 3 neighbors lives", board4, expected4);
        
        // Test 5: Edge case - corner cell
        int[][] board5 = {{1,0,0},{0,0,0},{0,0,1}};
        int[][] expected5 = {{0,0,0},{0,0,0},{0,0,0}};
        testCase(solution, "Corner cells", board5, expected5);
    }
    
    private static void testCase(Solution solution, String caseName, int[][] board, int[][] expected) {
        // Make a copy of the original board for comparison
        int[][] original = new int[board.length][];
        for (int i = 0; i < board.length; i++) {
            original[i] = board[i].clone();
        }
        
        solution.gameOfLife(board);
        
        boolean passed = true;
        outer: for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                if (board[i][j] != expected[i][j]) {
                    passed = false;
                    break outer;
                }
            }
        }
        
        if (passed) {
            System.out.println("Test case for " + caseName + ": PASSED");
        } else {
            System.out.println("Test case for " + caseName + ": FAILED");
            System.out.println("Input:");
            printBoard(original);
            System.out.println("Expected:");
            printBoard(expected);
            System.out.println("Actual:");
            printBoard(board);
        }
    }
    
    private static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
