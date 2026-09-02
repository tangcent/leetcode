package com.itangcent.leetcode_424_longest_repeating_character_replacement;

/**
 * Test class for the solution to LeetCode problem #424: longest-repeating-character-replacement
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Basic case with single replacement
        int result1 = solution.characterReplacement("ABAB", 2);
        System.out.println(String.format("Test case for basic replacement: %s",
                result1 == 4 ? "PASSED" : "FAILED (Expected: 4, Actual: " + result1 + ")"));

        // Test case 1a: Limited replacement (k=0)
        int result1a = solution.characterReplacement("ABAB", 0);
        System.out.println(String.format("Test case for limited replacement (k=1): %s",
                result1a == 1 ? "PASSED" : "FAILED (Expected: 1, Actual: " + result1a + ")"));

        // Test case 2: All same characters
        int result2 = solution.characterReplacement("AAAA", 2);
        System.out.println(String.format("Test case for all same characters: %s",
                result2 == 4 ? "PASSED" : "FAILED (Expected: 4, Actual: " + result2 + ")"));

        // Test case 3: Empty string
        int result3 = solution.characterReplacement("", 1);
        System.out.println(String.format("Test case for empty string: %s",
                result3 == 0 ? "PASSED" : "FAILED (Expected: 0, Actual: " + result3 + ")"));

        // Test case 4: k=0
        int result4 = solution.characterReplacement("AABABBA", 0);
        System.out.println(String.format("Test case for k=0: %s",
                result4 == 2 ? "PASSED" : "FAILED (Expected: 2, Actual: " + result4 + ")"));

        // Test case 5: Multiple replacements needed
        int result5 = solution.characterReplacement("AABABBB", 1);
        System.out.println(String.format("Test case for multiple replacements: %s",
                result5 == 5 ? "PASSED" : "FAILED (Expected: 4, Actual: " + result5 + ")"));

        // Test case 6: Multiple B's with k=2
        int result6 = solution.characterReplacement("ABBB", 2);
        System.out.println(String.format("Test case for multiple B's with k=2: %s",
                result6 == 4 ? "PASSED" : "FAILED (Expected: 4, Actual: " + result6 + ")"));
    }
}
