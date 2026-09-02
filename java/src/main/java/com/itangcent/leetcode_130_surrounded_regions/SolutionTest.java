package com.itangcent.leetcode_130_surrounded_regions;

/**
 * Test class for the solution to LeetCode problem #130: surrounded-regions
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #130: surrounded-regions");
        
        // Test Case 1: Basic case with surrounded regions
        char[][] board1 = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };
        char[][] expected1 = {
            {'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'X', 'X'}
        };
        solution.solve(board1);
        System.out.println("Test case 1 (Basic surrounded regions): " + 
            (compareBoards(board1, expected1) ? "PASSED" : "FAILED"));

        // Test Case 2: Surrounded region in the middle
        /*
         * Initial board:
         * X X X X
         * X O O X
         * X O O X
         * X X X X
         * 
         * Expected output:
         * X X X X
         * X X X X
         * X X X X
         * X X X X
         * 
         * Explanation:
         * - The 'O's form a connected region in the middle
         * - The region is completely surrounded by 'X's
         * - None of the 'O's are on the edge of the board
         * - Therefore, all 'O's should be changed to 'X's
         */
        char[][] board2 = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'X', 'X'}
        };
        char[][] expected2 = {
            {'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X'}
        };
        solution.solve(board2);
        System.out.println("Test case 2 (Surrounded region in the middle): " + 
            (compareBoards(board2, expected2) ? "PASSED" : "FAILED"));

        // Test Case 3: All 'O's connected to border
        char[][] board3 = {
            {'O', 'O', 'O'},
            {'O', 'O', 'O'},
            {'O', 'O', 'O'}
        };
        char[][] expected3 = {
            {'O', 'O', 'O'},
            {'O', 'O', 'O'},
            {'O', 'O', 'O'}
        };
        solution.solve(board3);
        System.out.println("Test case 3 (All 'O's connected to border): " + 
            (compareBoards(board3, expected3) ? "PASSED" : "FAILED"));

        // Test Case 4: Minimum size board (1x1)
        char[][] board4 = {
            {'O'}
        };
        char[][] expected4 = {
            {'O'}
        };
        solution.solve(board4);
        System.out.println("Test case 4 (Minimum size board): " + 
            (compareBoards(board4, expected4) ? "PASSED" : "FAILED"));

        // Test Case 5: Maximum size board (200x200)
        char[][] board5 = createLargeBoard(200);
        char[][] expected5 = createLargeBoard(200);
        solution.solve(board5);
        System.out.println("Test case 5 (Maximum size board): " + 
            (compareBoards(board5, expected5) ? "PASSED" : "FAILED"));

        // Test Case 6: Single row with maximum length
        char[][] board6 = createSingleRowBoard(200);
        char[][] expected6 = createSingleRowBoard(200);
        solution.solve(board6);
        System.out.println("Test case 6 (Single row with maximum length): " + 
            (compareBoards(board6, expected6) ? "PASSED" : "FAILED"));

        // Test Case 7: Single column with maximum length
        char[][] board7 = createSingleColumnBoard(200);
        char[][] expected7 = createSingleColumnBoard(200);
        solution.solve(board7);
        System.out.println("Test case 7 (Single column with maximum length): " + 
            (compareBoards(board7, expected7) ? "PASSED" : "FAILED"));

        // Test Case 8: All 'X's board
        char[][] board8 = createAllXBoard(5);
        char[][] expected8 = createAllXBoard(5);
        solution.solve(board8);
        System.out.println("Test case 8 (All 'X's board): " + 
            (compareBoards(board8, expected8) ? "PASSED" : "FAILED"));
    }

    private static boolean compareBoards(char[][] board1, char[][] board2) {
        if (board1.length != board2.length) return false;
        for (int i = 0; i < board1.length; i++) {
            if (board1[i].length != board2[i].length) return false;
            for (int j = 0; j < board1[i].length; j++) {
                if (board1[i][j] != board2[i][j]) return false;
            }
        }
        return true;
    }

    private static char[][] createLargeBoard(int size) {
        char[][] board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }
        return board;
    }

    private static char[][] createSingleRowBoard(int length) {
        char[][] board = new char[1][length];
        for (int j = 0; j < length; j++) {
            board[0][j] = 'O';
        }
        return board;
    }

    private static char[][] createSingleColumnBoard(int length) {
        char[][] board = new char[length][1];
        for (int i = 0; i < length; i++) {
            board[i][0] = 'O';
        }
        return board;
    }

    private static char[][] createAllXBoard(int size) {
        char[][] board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 'X';
            }
        }
        return board;
    }
}
