package com.itangcent.leetcode_52_n_queens_ii;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: n = 1
        System.out.println("Test case 1: n = 1");
        int result1 = solution.totalNQueens(1);
        System.out.println("Result: " + result1);
        System.out.println();

        // Test case 2: n = 2
        System.out.println("Test case 2: n = 2");
        int result2 = solution.totalNQueens(2);
        System.out.println("Result: " + result2);
        System.out.println();

        // Test case 3: n = 3
        System.out.println("Test case 3: n = 3");
        int result3 = solution.totalNQueens(3);
        System.out.println("Result: " + result3);
        System.out.println();

        // Test case 4: n = 4
        System.out.println("Test case 4: n = 4");
        int result4 = solution.totalNQueens(4);
        System.out.println("Result: " + result4);
        System.out.println();

        // Test case 5: n = 5
        System.out.println("Test case 5: n = 5");
        int result5 = solution.totalNQueens(5);
        System.out.println("Result: " + result5);
        System.out.println();

        // Test case 6: n = 6
        System.out.println("Test case 6: n = 6");
        int result6 = solution.totalNQueens(6);
        System.out.println("Result: " + result6);
    }
} 