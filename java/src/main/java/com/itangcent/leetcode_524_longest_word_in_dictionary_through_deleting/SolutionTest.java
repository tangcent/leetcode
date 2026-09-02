package com.itangcent.leetcode_524_longest_word_in_dictionary_through_deleting;

import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #524: longest-word-in-dictionary-through-deleting
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Basic example
        String s1 = "abpcplea";
        List<String> dictionary1 = Arrays.asList("ale","apple","monkey","plea");
        String expected1 = "apple";
        String result1 = solution.findLongestWord(s1, dictionary1);
        System.out.println("Test case for basic example: " + 
            (expected1.equals(result1) ? "PASSED" : "FAILED\nExpected: " + expected1 + "\nActual: " + result1));
        
        // Test case 2: Multiple valid words with same length
        String s2 = "abpcplea";
        List<String> dictionary2 = Arrays.asList("a","b","c");
        String expected2 = "a";
        String result2 = solution.findLongestWord(s2, dictionary2);
        System.out.println("Test case for multiple valid words: " + 
            (expected2.equals(result2) ? "PASSED" : "FAILED\nExpected: " + expected2 + "\nActual: " + result2));
        
        // Test case 3: No valid word can be formed
        String s3 = "abpcplea";
        List<String> dictionary3 = Arrays.asList("xyz","abcde","pqrst");
        String expected3 = "";
        String result3 = solution.findLongestWord(s3, dictionary3);
        System.out.println("Test case for no valid word: " + 
            (expected3.equals(result3) ? "PASSED" : "FAILED\nExpected: " + expected3 + "\nActual: " + result3));
        
        // Test case 4: Empty input string
        String s4 = "";
        List<String> dictionary4 = Arrays.asList("a","b","c");
        String expected4 = "";
        String result4 = solution.findLongestWord(s4, dictionary4);
        System.out.println("Test case for empty input string: " + 
            (expected4.equals(result4) ? "PASSED" : "FAILED\nExpected: " + expected4 + "\nActual: " + result4));

        // Test case 5: Multiple same-length matches should return lexicographically smaller
        String s5 = "abce";
        List<String> dictionary5 = Arrays.asList("abe","abc");
        String expected5 = "abc";
        String result5 = solution.findLongestWord(s5, dictionary5);
        System.out.println("Test case for lexicographical order: " + 
            (expected5.equals(result5) ? "PASSED" : "FAILED\nExpected: " + expected5 + "\nActual: " + result5));
    }
}
