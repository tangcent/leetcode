package com.itangcent.leetcode_500_keyboard_row;

/**
 * Test class for the solution to LeetCode problem #500: keyboard-row
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: All words from first row
        String[] input1 = {"qwerty", "pop", "typewriter"};
        String[] result1 = solution.findWords(input1);
        System.out.println("Test case for first row words: " +
                (result1.length == 3 ? "PASSED" : "FAILED") +
                " - Expected: 3, Actual: " + result1.length);

        // Test case 2: All words from second row
        String[] input2 = {"asdfgh", "jkl", "fads"};
        String[] result2 = solution.findWords(input2);
        System.out.println("Test case for second row words: " +
                (result2.length == 3 ? "PASSED" : "FAILED") +
                " - Expected: 3, Actual: " + result2.length);

        // Test case 3: All words from third row
        String[] input3 = {"zxcvbn", "cmz", "vbn"};
        String[] result3 = solution.findWords(input3);
        System.out.println("Test case for third row words: " +
                (result3.length == 3 ? "PASSED" : "FAILED") +
                " - Expected: 3, Actual: " + result3.length);

        // Test case 4: Mixed row words (should filter)
        String[] input4 = {"hello", "world", "asdf", "qwerty", "zxcv"};
        String[] result4 = solution.findWords(input4);
        System.out.println("Test case for mixed row words: " +
                (result4.length == 3 ? "PASSED" : "FAILED") +
                " - Expected: 3, Actual: " + result4.length);

        // Test case 5: Empty input
        String[] input5 = {};
        String[] result5 = solution.findWords(input5);
        System.out.println("Test case for empty input: " +
                (result5.length == 0 ? "PASSED" : "FAILED") +
                " - Expected: 0, Actual: " + result5.length);

        // Test case 6: Single character words
        String[] input6 = {"a", "q", "z"};
        String[] result6 = solution.findWords(input6);
        System.out.println("Test case for single character words: " +
                (result6.length == 3 ? "PASSED" : "FAILED") +
                " - Expected: 3, Actual: " + result6.length);

        // Test case 7: Mixed case words
        String[] input7 = {"QWERTY", "AsDfGh", "ZXCVBN"};
        String[] result7 = solution.findWords(input7);
        System.out.println("Test case for mixed case words: " +
                (result7.length == 3 ? "PASSED" : "FAILED") +
                " - Expected: 3, Actual: " + result7.length);
    }
}
