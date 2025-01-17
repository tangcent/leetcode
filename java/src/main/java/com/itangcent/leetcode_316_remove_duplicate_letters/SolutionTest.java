package com.itangcent.leetcode_316_remove_duplicate_letters;

/**
 * Test class for the solution to LeetCode problem #316: remove-duplicate-letters
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Basic case with duplicates
        String input1 = "bcabc";
        String expected1 = "abc";
        String result1 = solution.removeDuplicateLetters(input1);
        System.out.println("Test case for basic duplicates: " + 
            (expected1.equals(result1) ? "PASSED" : "FAILED"));
        System.out.println("Expected: " + expected1 + ", Actual: " + result1);

        // Test case 2: All unique characters
        String input2 = "abc";
        String expected2 = "abc";
        String result2 = solution.removeDuplicateLetters(input2);
        System.out.println("Test case for all unique: " + 
            (expected2.equals(result2) ? "PASSED" : "FAILED"));
        System.out.println("Expected: " + expected2 + ", Actual: " + result2);

        // Test case 3: Requires lexicographical choice
        String input3 = "cbacdcbc";
        String expected3 = "acdb";
        String result3 = solution.removeDuplicateLetters(input3);
        System.out.println("Test case for lex order choice: " + 
            (expected3.equals(result3) ? "PASSED" : "FAILED"));
        System.out.println("Expected: " + expected3 + ", Actual: " + result3);

        // Test case 4: Empty string
        String input4 = "";
        String expected4 = "";
        String result4 = solution.removeDuplicateLetters(input4);
        System.out.println("Test case for empty string: " + 
            (expected4.equals(result4) ? "PASSED" : "FAILED"));
        System.out.println("Expected: " + expected4 + ", Actual: " + result4);
    }
}
