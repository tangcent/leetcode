package com.itangcent.leetcode_140_word_break_ii;

import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #140: word-break-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #140: word-break-ii");
        
        // Test case 1
        String s1 = "catsanddog";
        List<String> wordDict1 = Arrays.asList("cat", "cats", "and", "sand", "dog");
        List<String> expected1 = Arrays.asList("cats and dog", "cat sand dog");
        List<String> result1 = solution.wordBreak(s1, wordDict1);
        testWordBreak(1, s1, wordDict1, expected1, result1);
        
        // Test case 2
        String s2 = "pineapplepenapple";
        List<String> wordDict2 = Arrays.asList("apple", "pen", "applepen", "pine", "pineapple");
        List<String> expected2 = Arrays.asList("pine apple pen apple", "pineapple pen apple", "pine applepen apple");
        List<String> result2 = solution.wordBreak(s2, wordDict2);
        testWordBreak(2, s2, wordDict2, expected2, result2);
        
        // Test case 3
        String s3 = "catsandog";
        List<String> wordDict3 = Arrays.asList("cats", "dog", "sand", "and", "cat");
        List<String> expected3 = Arrays.asList();
        List<String> result3 = solution.wordBreak(s3, wordDict3);
        testWordBreak(3, s3, wordDict3, expected3, result3);
        
        // Test case 4 - Empty string
        String s4 = "";
        List<String> wordDict4 = Arrays.asList("a", "b");
        List<String> expected4 = Arrays.asList();
        List<String> result4 = solution.wordBreak(s4, wordDict4);
        testWordBreak(4, s4, wordDict4, expected4, result4);
        
        // Test case 5 - Single word
        String s5 = "leetcode";
        List<String> wordDict5 = Arrays.asList("leet", "code");
        List<String> expected5 = Arrays.asList("leet code");
        List<String> result5 = solution.wordBreak(s5, wordDict5);
        testWordBreak(5, s5, wordDict5, expected5, result5);
    }
    
    private static void testWordBreak(int caseNumber, String s, List<String> wordDict, List<String> expected, List<String> actual) {
        // Sort both lists to ensure order doesn't affect comparison
        expected.sort(String::compareTo);
        actual.sort(String::compareTo);
        
        boolean passed = expected.equals(actual);
        System.out.println("Test case for case " + caseNumber + ": " + (passed ? "PASSED" : "FAILED"));
        
        if (!passed) {
            System.out.println("  Input: s = \"" + s + "\", wordDict = " + wordDict);
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + actual);
        }
    }
}
