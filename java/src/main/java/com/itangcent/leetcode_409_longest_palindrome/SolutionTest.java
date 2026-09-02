package com.itangcent.leetcode_409_longest_palindrome;

/**
 * Test class for the solution to LeetCode problem #409: longest-palindrome
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        testCase("abccccdd", 7, solution);
        testCase("a", 1, solution);
        testCase("bb", 2, solution);
        testCase("ccc", 3, solution);
        testCase("bananas", 5, solution);
        testCase("racecar", 7, solution);
    }
    
    private static void testCase(String s, int expected, Solution solution) {
        int actual = solution.longestPalindrome(s);
        boolean passed = actual == expected;
        
        System.out.println("Test case for \"" + s + "\": " + (passed ? "PASSED" : "FAILED"));
        
        if (!passed) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + actual);
        }
    }
}
