package com.itangcent.leetcode_79_word_search;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1: Standard case
        test(solution, new char[][]{
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        }, "ABCCED");

        // Test Case 2: Word not found
        test(solution, new char[][]{
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        }, "ABCB");

        // Test Case 3: Single character board
        test(solution, new char[][]{
            {'A'}
        }, "A");
        
        // Test Case 4: Empty word
        test(solution, new char[][]{
            {'A','B'},
            {'C','D'}
        }, "");
        
        // Test Case 5: Long path
        test(solution, new char[][]{
            {'A','B','C'},
            {'D','E','F'},
            {'G','H','I'}
        }, "ABEFHGDC");
    }

    private static void test(Solution solution, char[][] board, String word) {
        System.out.println("Input: board = [");
        for (char[] row : board) {
            System.out.print("  [");
            for (char c : row) {
                System.out.print("'" + c + "',");
            }
            System.out.println("],");
        }
        System.out.println("], word = \"" + word + "\"");
        boolean result = solution.exist(board, word);
        System.out.println("Output: " + result);
        System.out.println();
    }
} 