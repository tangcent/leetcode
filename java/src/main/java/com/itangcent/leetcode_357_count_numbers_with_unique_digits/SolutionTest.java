package com.itangcent.leetcode_357_count_numbers_with_unique_digits;

/**
 * Test class for the solution to LeetCode problem #357: count-numbers-with-unique-digits
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #357: count-numbers-with-unique-digits");
        
        // Test case 1: n = 0
        int n1 = 0;
        int expected1 = 1;
        int actual1 = solution.countNumbersWithUniqueDigits(n1);
        System.out.println("Test case for n = " + n1 + ": " + (expected1 == actual1 ? "PASSED" : "FAILED"));
        if (expected1 != actual1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + actual1);
        }
        
        // Test case 2: n = 1
        int n2 = 1;
        int expected2 = 10;
        int actual2 = solution.countNumbersWithUniqueDigits(n2);
        System.out.println("Test case for n = " + n2 + ": " + (expected2 == actual2 ? "PASSED" : "FAILED"));
        if (expected2 != actual2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + actual2);
        }
        
        // Test case 3: n = 2
        int n3 = 2;
        int expected3 = 91;  // 10 + 9*9 = 91
        int actual3 = solution.countNumbersWithUniqueDigits(n3);
        System.out.println("Test case for n = " + n3 + ": " + (expected3 == actual3 ? "PASSED" : "FAILED"));
        if (expected3 != actual3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + actual3);
        }
        
        // Test case 4: n = 3
        int n4 = 3;
        int expected4 = 739;  // 91 + 9*9*8 = 739
        int actual4 = solution.countNumbersWithUniqueDigits(n4);
        System.out.println("Test case for n = " + n4 + ": " + (expected4 == actual4 ? "PASSED" : "FAILED"));
        if (expected4 != actual4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + actual4);
        }
        
        // Test case 5: n > 10
        int n5 = 11;
        int expected5 = 8877691; // Same as n=10 because there can be at most 10 unique digits (0-9)
        int actual5 = solution.countNumbersWithUniqueDigits(n5);
        System.out.println("Test case for n = " + n5 + ": " + (expected5 == actual5 ? "PASSED" : "FAILED"));
        if (expected5 != actual5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + actual5);
        }
    }
}
