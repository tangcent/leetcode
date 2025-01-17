package com.itangcent.leetcode_202_happy_number;

/**
 * Test class for the solution to LeetCode problem #202: happy-number
 * 
 * Problem: A happy number is a number defined by the following process:
 * - Starting with any positive integer, replace the number by the sum of the squares of its digits
 * - Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle
 * - Those numbers for which this process ends in 1 are happy numbers
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #202: happy-number");
        
        // Test case 1: Example from LeetCode - 19 is a happy number
        int n1 = 19;
        boolean expected1 = true;
        boolean actual1 = solution.isHappy(n1);
        System.out.println("Test case for n=" + n1 + ": " + (expected1 == actual1 ? "PASSED" : "FAILED"));
        if (expected1 != actual1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + actual1);
        }
        
        // Test case 2: Example from LeetCode - 2 is not a happy number (creates a cycle)
        int n2 = 2;
        boolean expected2 = false;
        boolean actual2 = solution.isHappy(n2);
        System.out.println("Test case for n=" + n2 + ": " + (expected2 == actual2 ? "PASSED" : "FAILED"));
        if (expected2 != actual2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + actual2);
        }
        
        // Test case 3: 1 is a happy number by definition
        int n3 = 1;
        boolean expected3 = true;
        boolean actual3 = solution.isHappy(n3);
        System.out.println("Test case for n=" + n3 + ": " + (expected3 == actual3 ? "PASSED" : "FAILED"));
        if (expected3 != actual3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + actual3);
        }
        
        // Test case 4: 7 is a happy number
        int n4 = 7;
        boolean expected4 = true;
        boolean actual4 = solution.isHappy(n4);
        System.out.println("Test case for n=" + n4 + ": " + (expected4 == actual4 ? "PASSED" : "FAILED"));
        if (expected4 != actual4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + actual4);
        }
        
        // Test case 5: 4 is not a happy number (creates a cycle)
        int n5 = 4;
        boolean expected5 = false;
        boolean actual5 = solution.isHappy(n5);
        System.out.println("Test case for n=" + n5 + ": " + (expected5 == actual5 ? "PASSED" : "FAILED"));
        if (expected5 != actual5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + actual5);
        }
        
        // Test case 6: A larger number - 100
        int n6 = 100;
        boolean expected6 = true; // 100 -> 1^2+0^2+0^2 = 1 (which is happy)
        boolean actual6 = solution.isHappy(n6);
        System.out.println("Test case for n=" + n6 + ": " + (expected6 == actual6 ? "PASSED" : "FAILED"));
        if (expected6 != actual6) {
            System.out.println("  Expected: " + expected6 + ", Actual: " + actual6);
        }
    }
}
