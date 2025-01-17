package com.itangcent.leetcode_125_valid_palindrome;

/**
 * Test class for the solution to LeetCode problem #125: valid-palindrome
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Running tests for LeetCode problem #125: valid-palindrome");

        // Test case 1: Empty string
        testPalindrome(solution, "", true);

        // Test case 2: Single character
        testPalindrome(solution, "a", true);

        // Test case 3: Simple palindrome
        testPalindrome(solution, "A man, a plan, a canal: Panama", true);

        // Test case 4: Non-palindrome
        testPalindrome(solution, "race a car", false);

        // Test case 5: Numbers only
        testPalindrome(solution, "12321", true);

        // Test case 6: Mixed alphanumeric
        testPalindrome(solution, "A1b2B1a", true);

        // Test case 7: All non-alphanumeric
        testPalindrome(solution, ".,", true);
        
        // Test case 8: Case sensitivity
        testPalindrome(solution, "AbBa", true);
        
        // Test case 9: Long palindrome
        testPalindrome(solution, "Was it a car or a cat I saw?", true);
        
        // Test case 10: Non-palindrome with special characters
        testPalindrome(solution, "hello@world", false);
        
        // Test case 11: Edge case with number and letter
        testPalindrome(solution, "0P", false);
    }
    
    private static void testPalindrome(Solution solution, String input, boolean expected) {
        boolean result = solution.isPalindrome(input);
        String caseResult = result == expected ? "PASSED" : "FAILED";
        System.out.println("Test case for \"" + input + "\": " + caseResult);
        if (result != expected) {
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + result);
        }
    }
}
