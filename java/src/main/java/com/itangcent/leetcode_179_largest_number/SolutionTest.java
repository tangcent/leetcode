package com.itangcent.leetcode_179_largest_number;

/**
 * Test class for the solution to LeetCode problem #179: largest-number
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Basic test
        testCase("Basic test", solution, new int[]{10, 2}, "210");
        
        // Test case 2: All zeros
        testCase("All zeros", solution, new int[]{0, 0, 0}, "0");
        
        // Test case 3: Prefix matching case
        testCase("Prefix matching", solution, new int[]{824, 8247}, "8248247");
        
        // Test case 4: Example from leetcode
        testCase("Leetcode example 1", solution, new int[]{3, 30, 34, 5, 9}, "9534330");
        
        // Test case 5: Another example
        testCase("Leetcode example 2", solution, new int[]{1, 2, 3, 4, 5}, "54321");
    }
    
    private static void testCase(String caseName, Solution solution, int[] nums, String expected) {
        String actual = solution.largestNumber(nums);
        boolean passed = expected.equals(actual);
        
        System.out.println("Test case for " + caseName + ": " + (passed ? "PASSED" : "FAILED"));
        
        if (!passed) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + actual);
        }
    }
}
