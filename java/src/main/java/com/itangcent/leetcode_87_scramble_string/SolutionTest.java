package com.itangcent.leetcode_87_scramble_string;

/**
 * Test class for the solution to LeetCode problem #87: scramble-string
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Basic scramble
        String s1 = "great";
        String s2 = "rgeat";
        System.out.println("Test case 1:");
        System.out.println("Input: s1 = \"great\", s2 = \"rgeat\"");
        System.out.println("Expected: true");
        System.out.println("Actual: " + solution.isScramble(s1, s2));
        System.out.println();

        // Test case 2: Not a scramble
        s1 = "abcde";
        s2 = "caebd";
        System.out.println("Test case 2:");
        System.out.println("Input: s1 = \"abcde\", s2 = \"caebd\"");
        System.out.println("Expected: false");
        System.out.println("Actual: " + solution.isScramble(s1, s2));
        System.out.println();

        // Test case 3: Same string
        s1 = "a";
        s2 = "a";
        System.out.println("Test case 3:");
        System.out.println("Input: s1 = \"a\", s2 = \"a\"");
        System.out.println("Expected: true");
        System.out.println("Actual: " + solution.isScramble(s1, s2));
        System.out.println();

        // Test case 4: Different lengths
        s1 = "abc";
        s2 = "abcd";
        System.out.println("Test case 4:");
        System.out.println("Input: s1 = \"abc\", s2 = \"abcd\"");
        System.out.println("Expected: false");
        System.out.println("Actual: " + solution.isScramble(s1, s2));
        System.out.println();

        // Test case 5: Complex scramble
        s1 = "abcd";
        s2 = "cdab";
        System.out.println("Test case 5:");
        System.out.println("Input: s1 = \"abcd\", s2 = \"cdab\"");
        System.out.println("Expected: true");
        System.out.println("Actual: " + solution.isScramble(s1, s2));
        System.out.println();

        // Test case 6: Long string scramble
        s1 = "abcdefghijklmnopq";
        s2 = "efghijklmnopqcadb";
        System.out.println("Test case 6:");
        System.out.println("Input: s1 = \"abcdefghijklmnopq\", s2 = \"efghijklmnopqcadb\"");
        System.out.println("Expected: false");
        System.out.println("Actual: " + solution.isScramble(s1, s2));
    }
}
