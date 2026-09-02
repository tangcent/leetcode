package com.itangcent.leetcode_400_nth_digit;

/**
 * Test class for the solution to LeetCode problem #400: nth-digit
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #400: nth-digit");
        
        // Test cases from LeetCode examples and edge cases
        testFindNthDigit(solution, 3, 3);           // The 3rd digit is 3
        testFindNthDigit(solution, 11, 0);          // The 11th digit is 0 (in the number 10)
        testFindNthDigit(solution, 15, 2);          // The 15th digit is 2 (in the number 12)

        // Additional test cases
        testFindNthDigit(solution, 1, 1);           // The 1st digit is 1
        testFindNthDigit(solution, 9, 9);           // The 9th digit is 9
        testFindNthDigit(solution, 10, 1);          // The 10th digit is 1 (in the number 10)
        testFindNthDigit(solution, 190, 1);         // The 190th digit is 1 (in the number 100)
        testFindNthDigit(solution, 191, 0);         // The 191st digit is 0 (in the number 100)
        testFindNthDigit(solution, 192, 0);         // The 192nd digit is 0 (in the number 100)
        testFindNthDigit(solution, 1000, 3);        // The 1000th digit is 3
        
        // Failed test case from LeetCode submission
        testFindNthDigit(solution, 1000000000, 1);  // The 1000000000th digit should be 1
    }
    
    private static void testFindNthDigit(Solution solution, int n, int expected) {
        int actual = solution.findNthDigit(n);
        boolean passed = actual == expected;
        
        System.out.println("Test case for n=" + n + ": " + (passed ? "PASSED" : "FAILED"));
        
        if (!passed) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + actual);
        }
    }
}
