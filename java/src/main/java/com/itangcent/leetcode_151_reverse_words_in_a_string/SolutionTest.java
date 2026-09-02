package com.itangcent.leetcode_151_reverse_words_in_a_string;

/**
 * Test class for the solution to LeetCode problem #151: reverse-words-in-a-string
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #151: reverse-words-in-a-string");
        
        // Test case 1: Basic example with multiple words
        String input1 = "the sky is blue";
        String expected1 = "blue is sky the";
        String actual1 = solution.reverseWords(input1);
        System.out.println("Test case for basic example: " + 
            (expected1.equals(actual1) ? "PASSED" : "FAILED"));
        if (!expected1.equals(actual1)) {
            System.out.println("  Expected: " + expected1);
            System.out.println("  Actual: " + actual1);
        }
        
        // Test case 2: Extra spaces between words
        String input2 = "  hello world  ";
        String expected2 = "world hello";
        String actual2 = solution.reverseWords(input2);
        System.out.println("Test case for extra spaces: " + 
            (expected2.equals(actual2) ? "PASSED" : "FAILED"));
        if (!expected2.equals(actual2)) {
            System.out.println("  Expected: " + expected2);
            System.out.println("  Actual: " + actual2);
        }
        
        // Test case 3: Multiple spaces between words
        String input3 = "a good   example";
        String expected3 = "example good a";
        String actual3 = solution.reverseWords(input3);
        System.out.println("Test case for multiple spaces between words: " + 
            (expected3.equals(actual3) ? "PASSED" : "FAILED"));
        if (!expected3.equals(actual3)) {
            System.out.println("  Expected: " + expected3);
            System.out.println("  Actual: " + actual3);
        }
        
        // Test case 4: Single word
        String input4 = "hello";
        String expected4 = "hello";
        String actual4 = solution.reverseWords(input4);
        System.out.println("Test case for single word: " + 
            (expected4.equals(actual4) ? "PASSED" : "FAILED"));
        if (!expected4.equals(actual4)) {
            System.out.println("  Expected: " + expected4);
            System.out.println("  Actual: " + actual4);
        }
        
        // Test case 5: Empty string
        String input5 = "";
        String expected5 = "";
        String actual5 = solution.reverseWords(input5);
        System.out.println("Test case for empty string: " + 
            (expected5.equals(actual5) ? "PASSED" : "FAILED"));
        if (!expected5.equals(actual5)) {
            System.out.println("  Expected: " + expected5);
            System.out.println("  Actual: " + actual5);
        }
        
        // Test case 6: Only spaces
        String input6 = "   ";
        String expected6 = "";
        String actual6 = solution.reverseWords(input6);
        System.out.println("Test case for only spaces: " + 
            (expected6.equals(actual6) ? "PASSED" : "FAILED"));
        if (!expected6.equals(actual6)) {
            System.out.println("  Expected: " + expected6);
            System.out.println("  Actual: " + actual6);
        }
    }
}
