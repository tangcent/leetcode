package com.itangcent.leetcode_127_word_ladder;

import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #127: word-ladder
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Basic transformation
        List<String> wordList1 = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int result1 = solution.ladderLength("hit", "cog", wordList1);
        System.out.println("Test case for basic transformation: " + (result1 == 5 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 5, Actual: " + result1);

        // Test case 2: No transformation possible
        List<String> wordList2 = Arrays.asList("hot", "dot", "dog", "lot", "log");
        int result2 = solution.ladderLength("hit", "cog", wordList2);
        System.out.println("Test case for no transformation possible: " + (result2 == 0 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 0, Actual: " + result2);

        // Test case 3: Begin word equals end word
        List<String> wordList3 = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int result3 = solution.ladderLength("hit", "hit", wordList3);
        System.out.println("Test case for begin word equals end word: " + (result3 == 0 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 0, Actual: " + result3);

        // Test case 4: Single step transformation
        List<String> wordList4 = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int result4 = solution.ladderLength("hot", "dot", wordList4);
        System.out.println("Test case for single step transformation: " + (result4 == 2 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 2, Actual: " + result4);

        // Test case 5: Empty word list
        List<String> wordList5 = Arrays.asList();
        int result5 = solution.ladderLength("hit", "cog", wordList5);
        System.out.println("Test case for empty word list: " + (result5 == 0 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 0, Actual: " + result5);
    }
}
