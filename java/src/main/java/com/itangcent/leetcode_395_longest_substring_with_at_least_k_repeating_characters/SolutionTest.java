package com.itangcent.leetcode_395_longest_substring_with_at_least_k_repeating_characters;

/**
 * Test class for the solution to LeetCode problem #395: longest-substring-with-at-least-k-repeating-characters
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Running tests for LeetCode problem #395: longest-substring-with-at-least-k-repeating-characters");

        // Test case 1: Basic case
        testCase(solution, "aaabb", 3, 3);

        // Test case 2: All characters same
        testCase(solution, "aaaaa", 2, 5);

        // Test case 3: No valid substring
        testCase(solution, "ababbc", 4, 0);

        // Test case 4: k=1 should return full string length
        testCase(solution, "abcde", 1, 5);

        // Test case 5: Mixed case with multiple valid substrings
        testCase(solution, "ababacb", 3, 0);

        // Test case 6: Empty string
        testCase(solution, "", 1, 0);

        // Test case 7: Mixed characters with valid substring
        testCase(solution, "bbaaacbd", 3, 3);
    }
    
    private static void testCase(Solution solution, String s, int k, int expected) {
        int actual = solution.longestSubstring(s, k);
        if (actual == expected) {
            System.out.println(String.format("Test case for '%s' with k=%d: PASSED", s, k));
        } else {
            System.out.println(String.format("Test case for '%s' with k=%d: FAILED", s, k));
            System.out.println(String.format("  Expected: %d", expected));
            System.out.println(String.format("  Actual: %d", actual));
        }
    }
}
