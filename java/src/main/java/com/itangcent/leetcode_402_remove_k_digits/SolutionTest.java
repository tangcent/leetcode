package com.itangcent.leetcode_402_remove_k_digits;

/**
 * Test class for the solution to LeetCode problem #402: remove-k-digits
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        String num1 = "1432219";
        int k1 = 3;
        String expected1 = "1219";
        String result1 = solution.removeKdigits(num1, k1);
        System.out.println("Test case for Example 1: " + (expected1.equals(result1) ? "PASSED" : "FAILED"));
        if (!expected1.equals(result1)) {
            System.out.println("  Expected: " + expected1);
            System.out.println("  Actual: " + result1);
        }
        
        // Test case 2
        String num2 = "10200";
        int k2 = 1;
        String expected2 = "200";
        String result2 = solution.removeKdigits(num2, k2);
        System.out.println("Test case for Example 2: " + (expected2.equals(result2) ? "PASSED" : "FAILED"));
        if (!expected2.equals(result2)) {
            System.out.println("  Expected: " + expected2);
            System.out.println("  Actual: " + result2);
        }
        
        // Test case 3
        String num3 = "10";
        int k3 = 2;
        String expected3 = "0";
        String result3 = solution.removeKdigits(num3, k3);
        System.out.println("Test case for Example 3: " + (expected3.equals(result3) ? "PASSED" : "FAILED"));
        if (!expected3.equals(result3)) {
            System.out.println("  Expected: " + expected3);
            System.out.println("  Actual: " + result3);
        }
        
        // Additional test cases
        // Test case 4: Non-decreasing sequence
        String num4 = "12345";
        int k4 = 2;
        String expected4 = "123";
        String result4 = solution.removeKdigits(num4, k4);
        System.out.println("Test case for non-decreasing sequence: " + (expected4.equals(result4) ? "PASSED" : "FAILED"));
        if (!expected4.equals(result4)) {
            System.out.println("  Expected: " + expected4);
            System.out.println("  Actual: " + result4);
        }
        
        // Test case 5: All same digits
        String num5 = "1111";
        int k5 = 2;
        String expected5 = "11";
        String result5 = solution.removeKdigits(num5, k5);
        System.out.println("Test case for all same digits: " + (expected5.equals(result5) ? "PASSED" : "FAILED"));
        if (!expected5.equals(result5)) {
            System.out.println("  Expected: " + expected5);
            System.out.println("  Actual: " + result5);
        }
    }
}
