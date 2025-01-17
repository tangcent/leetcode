package com.itangcent.leetcode_394_decode_string;

/**
 * Test class for the solution to LeetCode problem #394: decode-string
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #394: decode-string");
        
        // Test case 1: Basic test with single bracket
        String input1 = "3[a]2[bc]";
        String expected1 = "aaabcbc";
        String result1 = solution.decodeString(input1);
        System.out.println("Test case for basic decode: " + 
                           (expected1.equals(result1) ? "PASSED" : "FAILED"));
        if (!expected1.equals(result1)) {
            System.out.println("  Expected: " + expected1);
            System.out.println("  Actual: " + result1);
        }
        
        // Test case 2: Nested brackets
        String input2 = "3[a2[c]]";
        String expected2 = "accaccacc";
        String result2 = solution.decodeString(input2);
        System.out.println("Test case for nested brackets: " + 
                           (expected2.equals(result2) ? "PASSED" : "FAILED"));
        if (!expected2.equals(result2)) {
            System.out.println("  Expected: " + expected2);
            System.out.println("  Actual: " + result2);
        }
        
        // Test case 3: Mixed with letters
        String input3 = "2[abc]3[cd]ef";
        String expected3 = "abcabccdcdcdef";
        String result3 = solution.decodeString(input3);
        System.out.println("Test case for mixed with letters: " + 
                           (expected3.equals(result3) ? "PASSED" : "FAILED"));
        if (!expected3.equals(result3)) {
            System.out.println("  Expected: " + expected3);
            System.out.println("  Actual: " + result3);
        }
        
        // Test case 4: More complex nested structure
        String input4 = "100[leetcode]";
        // Create expected string by repeating "leetcode" 100 times
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("leetcode");
        }
        String expected4 = sb.toString();
        String result4 = solution.decodeString(input4);
        System.out.println("Test case for large repetition: " + 
                           (expected4.equals(result4) ? "PASSED" : "FAILED"));
        if (!expected4.equals(result4)) {
            System.out.println("  Expected: first few chars: " + expected4.substring(0, Math.min(20, expected4.length())));
            System.out.println("  Actual: first few chars: " + result4.substring(0, Math.min(20, result4.length())));
        }
        
        // Test case 5: Empty string
        String input5 = "";
        String expected5 = "";
        String result5 = solution.decodeString(input5);
        System.out.println("Test case for empty string: " + 
                           (expected5.equals(result5) ? "PASSED" : "FAILED"));
        if (!expected5.equals(result5)) {
            System.out.println("  Expected: " + expected5);
            System.out.println("  Actual: " + result5);
        }
    }
}
