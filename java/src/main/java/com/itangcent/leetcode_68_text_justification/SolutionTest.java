package com.itangcent.leetcode_68_text_justification;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        String[] words1 = {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> expected1 = Arrays.asList(
            "This    is    an",
            "example  of text",
            "justification.  "
        );
        test(1, expected1, solution.fullJustify(words1, 16));

        // Test case 2
        String[] words2 = {"What","must","be","acknowledgment","shall","be"};
        List<String> expected2 = Arrays.asList(
            "What   must   be",
            "acknowledgment  ",
            "shall be        "
        );
        test(2, expected2, solution.fullJustify(words2, 16));

        // Test case 3
        String[] words3 = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        List<String> expected3 = Arrays.asList(
            "Science  is  what we",
            "understand      well",
            "enough to explain to",
            "a  computer.  Art is",
            "everything  else  we",
            "do                  "
        );
        test(3, expected3, solution.fullJustify(words3, 20));
    }

    private static void test(int caseNum, List<String> expected, List<String> actual) {
        boolean passed = expected.equals(actual);
        System.out.println("Test case " + caseNum + ": " + (passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
        }
    }
} 