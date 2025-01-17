package com.itangcent.leetcode_389_find_the_difference;

/**
 * Test class for the solution to LeetCode problem #389: find-the-difference
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #389: find-the-difference");
        
        // Test case 1: Example from LeetCode
        testFindTheDifference(solution, "abcd", "abcde", 'e');
        
        // Test case 2: Another example with different character
        testFindTheDifference(solution, "abc", "abcd", 'd');
        
        // Test case 3: Characters in different order
        testFindTheDifference(solution, "abcd", "abcde", 'e');
        
        // Test case 4: Single character inputs
        testFindTheDifference(solution, "", "a", 'a');
        
        // Test case 5: Multiple occurrences of characters
        testFindTheDifference(solution, "aabb", "aabbc", 'c');
        
        // Test case 6: Added character in the middle
        testFindTheDifference(solution, "ae", "aec", 'c');
    }
    
    private static void testFindTheDifference(Solution solution, String s, String t, char expected) {
        char result = solution.findTheDifference(s, t);
        boolean passed = result == expected;
        
        System.out.println("Test case for s=\"" + s + "\", t=\"" + t + "\": " + 
                          (passed ? "PASSED" : "FAILED"));
        
        if (!passed) {
            System.out.println("  Expected: '" + expected + "', Actual: '" + result + "'");
        }
    }
}
