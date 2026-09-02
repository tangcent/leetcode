package com.itangcent.leetcode_438_find_all_anagrams_in_a_string;

/**
 * Test class for the solution to LeetCode problem #438: find-all-anagrams-in-a-string
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Basic example
        testCase(solution, "cbaebabacd", "abc", "[0, 6]");
        
        // Test case 2: Multiple anagrams
        testCase(solution, "abab", "ab", "[0, 1, 2]");
        
        // Test case 3: No anagrams found
        testCase(solution, "abcdefg", "xyz", "[]");
        
        // Test case 4: Empty string
        testCase(solution, "", "a", "[]");
        
        // Test case 5: Pattern longer than string
        testCase(solution, "abc", "abcdef", "[]");
    }
    
    private static void testCase(Solution solution, String s, String p, String expected) {
        String actual = solution.findAnagrams(s, p).toString();
        if (expected.equals(actual)) {
            System.out.println("Test case for \"" + s + "\", \"" + p + "\": PASSED");
        } else {
            System.out.println("Test case for \"" + s + "\", \"" + p + "\": FAILED");
            System.out.println("Expected: " + expected);
            System.out.println("Actual:   " + actual);
        }
    }
}
