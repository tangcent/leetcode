package com.itangcent.leetcode_51_n_queens;

import java.util.List;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: n = 1
        System.out.println("Test case 1: n = 1");
        List<List<String>> result1 = solution.solveNQueens(1);
        System.out.println("Result size: " + result1.size());
        System.out.println("First solution: " + result1.get(0));
        System.out.println();

        // Test case 2: n = 2
        System.out.println("Test case 2: n = 2");
        List<List<String>> result2 = solution.solveNQueens(2);
        System.out.println("Result size: " + result2.size());
        System.out.println();

        // Test case 3: n = 3
        System.out.println("Test case 3: n = 3");
        List<List<String>> result3 = solution.solveNQueens(3);
        System.out.println("Result size: " + result3.size());
        System.out.println();

        // Test case 4: n = 4
        System.out.println("Test case 4: n = 4");
        List<List<String>> result4 = solution.solveNQueens(4);
        System.out.println("Result size: " + result4.size());
        System.out.println("First solution:");
        result4.get(0).forEach(System.out::println);
        System.out.println("Second solution:");
        result4.get(1).forEach(System.out::println);
        System.out.println();

        // Test case 5: n = 5
        System.out.println("Test case 5: n = 5");
        List<List<String>> result5 = solution.solveNQueens(5);
        System.out.println("Result size: " + result5.size());
        System.out.println("First solution:");
        result5.get(0).forEach(System.out::println);
        System.out.println();

        // Test case 6: n = 6
        System.out.println("Test case 6: n = 6");
        List<List<String>> result6 = solution.solveNQueens(6);
        System.out.println("Result size: " + result6.size());
        System.out.println("First solution:");
        result6.get(0).forEach(System.out::println);
    }
} 