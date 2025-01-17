package com.itangcent.leetcode_115_distinct_subsequences;

/**
 * Test class for the solution to LeetCode problem #115: distinct-subsequences
 */
public class SolutionTest {
    public static void main(String[] args) {
        // Test case 1: Basic case
        System.out.println("Test case 1:");
        System.out.println("Input: s = \"rabbbit\", t = \"rabbit\"");
        System.out.println("Expected: 3, Actual: " + new Solution().numDistinct("rabbbit", "rabbit"));

        // Test case 2: Empty target string
        System.out.println("\nTest case 2:");
        System.out.println("Input: s = \"abc\", t = \"\"");
        System.out.println("Expected: 1, Actual: " + new Solution().numDistinct("abc", ""));

        // Test case 3: Empty source string
        System.out.println("\nTest case 3:");
        System.out.println("Input: s = \"\", t = \"abc\"");
        System.out.println("Expected: 0, Actual: " + new Solution().numDistinct("", "abc"));

        // Test case 4: Both strings empty
        System.out.println("\nTest case 4:");
        System.out.println("Input: s = \"\", t = \"\"");
        System.out.println("Expected: 1, Actual: " + new Solution().numDistinct("", ""));

        // Test case 5: No matching subsequences
        System.out.println("\nTest case 5:");
        System.out.println("Input: s = \"abc\", t = \"def\"");
        System.out.println("Expected: 0, Actual: " + new Solution().numDistinct("abc", "def"));

        // Test case 6: Multiple possible subsequences
        System.out.println("\nTest case 6:");
        System.out.println("Input: s = \"babgbag\", t = \"bag\"");
        System.out.println("Expected: 5, Actual: " + new Solution().numDistinct("babgbag", "bag"));

        // Test case 7: Single character target
        System.out.println("\nTest case 7:");
        System.out.println("Input: s = \"aaa\", t = \"a\"");
        System.out.println("Expected: 3, Actual: " + new Solution().numDistinct("aaa", "a"));
    }
}
