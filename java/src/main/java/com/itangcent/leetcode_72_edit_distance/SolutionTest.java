package com.itangcent.leetcode_72_edit_distance;

public class SolutionTest {
    static Solution solution = new Solution();

    public static void main(String[] args) {
        // Test case 1: Basic case
        test("horse", "ros", 3);
        
        // Test case 2: Another example
        test("intention", "execution", 5);
        
        // Test case 3: Empty strings
        test("", "", 0);
        
        // Test case 4: One empty string
        test("", "abc", 3);
        
        // Test case 5: Same strings
        test("hello", "hello", 0);
        
        // Test case 6: Completely different strings
        test("abc", "def", 3);

        System.out.println("All tests passed!");
    }
    
    private static void test(String word1, String word2, int expected) {
        int result = solution.minDistance(word1, word2);
        if (result != expected) {
            System.err.println("Test failed!");
            System.err.println("Input: word1 = " + word1 + ", word2 = " + word2);
            System.err.println("Expected: " + expected);
            System.err.println("Got: " + result);
            System.exit(1);
        }
    }
} 