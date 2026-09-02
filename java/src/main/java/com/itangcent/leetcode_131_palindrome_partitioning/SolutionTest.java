package com.itangcent.leetcode_131_palindrome_partitioning;

import java.util.List;

/**
 * Test class for the solution to LeetCode problem #131: palindrome-partitioning
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #131: palindrome-partitioning");

        // Test case 1: Basic case with multiple palindrome partitions
        testPartition(solution, "aab", "[[a, a, b], [aa, b]]");

        // Test case 2: Single character string
        testPartition(solution, "a", "[[a]]");

        // Test case 3: Two identical characters
        testPartition(solution, "aa", "[[a, a], [aa]]");

        // Test case 4: String that is itself a palindrome
        testPartition(solution, "aba", "[[a, b, a], [aba]]");

        // Test case 5: String with no palindrome partitions except single characters
        testPartition(solution, "abc", "[[a, b, c]]");

        // Test case 6: Empty string
        testPartition(solution, "", "[[]]");

        // Test case 7: Multiple palindrome combinations
        testPartition(solution, "aabb", "[[a, a, b, b], [a, a, bb], [aa, b, b], [aa, bb]]");

        // Test case 8: Complex case with multiple overlapping palindromes
        testPartition(solution, "aabaa", "[[a, a, b, a, a], [a, a, b, aa], [a, aba, a], [aa, b, a, a], [aa, b, aa], [aabaa]]");
    }
    
    private static void testPartition(Solution solution, String input, String expected) {
        List<List<String>> result = solution.partition(input);
        String resultStr = result.toString();
        String caseResult = resultStr.equals(expected) ? "PASSED" : "FAILED";
        System.out.println("Test case for \"" + input + "\": " + caseResult);
        if (!resultStr.equals(expected)) {
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + resultStr);
        }
    }
}
