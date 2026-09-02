package com.itangcent.leetcode_132_palindrome_partitioning_ii;

/**
 * Test class for the solution to LeetCode problem #132: palindrome-partitioning-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #132: palindrome-partitioning-ii");

        // Test case 1: Basic case with multiple possible partitions
        testMinCut(solution, "aab", 1);  // "aa|b" requires 1 cut

        // Test case 2: String that is already a palindrome
        testMinCut(solution, "aba", 0);  // "aba" requires no cuts

        // Test case 3: String where each character needs to be separated
        testMinCut(solution, "abc", 2);  // "a|b|c" requires 2 cuts

        // Test case 4: Empty string
        testMinCut(solution, "", 0);  // Empty string requires no cuts
        
        // Test case 5: Single character
        testMinCut(solution, "a", 0);  // Single character is always a palindrome
        
        // Test case 6: Two identical characters
        testMinCut(solution, "aa", 0);  // "aa" is already a palindrome
        
        // Test case 7: String that is a palindrome
        testMinCut(solution, "aabaa", 0);  // "aabaa" is already a palindrome
        
        // Test case 8: String with all same characters
        testMinCut(solution, "aaaa", 0);  // Already a palindrome
        
        // Test case 9: More complex case
        testMinCut(solution, "abcba", 0);  // Already a palindrome
        
        // Test case 10: Complex case requiring multiple cuts
        testMinCut(solution, "abcde", 4);  // "a|b|c|d|e" requires 4 cuts
        
        // Test case 11: Case with overlapping palindrome substrings
        testMinCut(solution, "cdd", 1);  // "c|dd" requires 1 cut
        
        // Test case 12: Complex case with multiple palindrome possibilities
        testMinCut(solution, "aabbc", 2);  // "aa|b|bc" requires 2 cuts
        
        // Test case 13: Longer string with mixed patterns
        testMinCut(solution, "abcccb", 1);  // "a|bcccb" requires 1 cut
        
        // Test case 14: String with repeated patterns
        testMinCut(solution, "ababc", 2);  // "aba|bc" requires 2 cuts
    }
    
    private static void testMinCut(Solution solution, String input, int expected) {
        int result = solution.minCut(input);
        String caseResult = result == expected ? "PASSED" : "FAILED";
        System.out.println("Test case for \"" + input + "\": " + caseResult);
        if (result != expected) {
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + result);
        }
    }
}
