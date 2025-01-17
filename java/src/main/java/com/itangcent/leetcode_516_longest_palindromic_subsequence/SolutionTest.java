package com.itangcent.leetcode_516_longest_palindromic_subsequence;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        testCase(solution, "bbbab", 4);
        testCase(solution, "cbbd", 2);
        testCase(solution, "", 0);
        testCase(solution, "a", 1);
        testCase(solution, "racecar", 7);
        testCase(solution, "abcde", 1);
    }

    private static void testCase(Solution solution, String input, int expected) {
        long startTime = System.nanoTime();
        int result = solution.longestPalindromeSubseq(input);
        long endTime = System.nanoTime();
        
        String status = result == expected ? "PASSED" : "FAILED";
        if (status.equals("PASSED")) {
            System.out.println(String.format(
                "Test case for %s: %s",
                input, status
            ));
        } else {
            System.out.println(String.format(
                "Test case for %s: %s (expected: %d, actual: %d)",
                input, status, expected, result
            ));
        }
    }
}
