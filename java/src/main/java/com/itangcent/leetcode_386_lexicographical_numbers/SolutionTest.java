package com.itangcent.leetcode_386_lexicographical_numbers;

import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #386: lexicographical-numbers
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #386: lexicographical-numbers");
        
        // Test case 1: n = 13
        testLexicalOrder(solution, 13, Arrays.asList(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9));
        
        // Test case 2: n = 2
        testLexicalOrder(solution, 2, Arrays.asList(1, 2));
        
        // Test case 3: n = 23
        List<Integer> expected3 = Arrays.asList(1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2, 20, 21, 22, 23, 3, 4, 5, 6, 7, 8, 9);
        testLexicalOrder(solution, 23, expected3);
        
        // Test case 4: n = 100
        List<Integer> expected4 = Arrays.asList(
            1, 10, 100, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
            3, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 4, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
            5, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 6, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69,
            7, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 8, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
            9, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99
        );
        testLexicalOrder(solution, 100, expected4);
    }
    
    private static void testLexicalOrder(Solution solution, int n, List<Integer> expected) {
        List<Integer> result = solution.lexicalOrder(n);
        boolean passed = result.equals(expected);
        
        System.out.println("Test case for n=" + n + ": " + (passed ? "PASSED" : "FAILED"));
        
        if (!passed) {
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + result);
        }
    }
}
