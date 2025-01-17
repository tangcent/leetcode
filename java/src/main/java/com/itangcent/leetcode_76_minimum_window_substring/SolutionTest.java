package com.itangcent.leetcode_76_minimum_window_substring;

public class SolutionTest {
    static Solution solution = new Solution();

    public static void main(String[] args) {
        // Test case 1: Basic case
        test("ADOBECODEBANC", "ABC", "BANC");

        // Test case 2: Substring at the beginning
        test("ABCDEF", "ABC", "ABC");

        // Test case 3: Substring at the end
        test("DEFABC", "ABC", "ABC");

        // Test case 4: Entire string is the minimum window
        test("ABC", "ABC", "ABC");

        // Test case 5: No valid window exists
        test("ABCDEF", "XYZ", "");

        // Test case 6: Single character target
        test("ADOBECODEBANC", "A", "A");

        // Test case 7: Empty source string
        test("", "ABC", "");

        // Test case 8: Empty target string
        test("ABCDEF", "", "");

        // Test case 9: Repeated characters in target
        test("ADOBACODEBANC", "AAB", "ADOBA");

        System.out.println("All tests passed!");
    }
    
    private static void test(String s, String t, String expected) {
        String result = solution.minWindow(s, t);
        
        if (!result.equals(expected)) {
            System.err.println("Test failed!");
            System.err.println("Input string: " + s);
            System.err.println("Target string: " + t);
            System.err.println("Expected: " + expected);
            System.err.println("Got: " + result);
            System.exit(1);
        }
    }
} 