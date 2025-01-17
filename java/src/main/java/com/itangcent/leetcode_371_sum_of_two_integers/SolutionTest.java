package com.itangcent.leetcode_371_sum_of_two_integers;

/**
 * Test class for the solution to LeetCode problem #371: sum-of-two-integers
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Basic addition
        int a1 = 1, b1 = 2;
        int result1 = solution.getSum(a1, b1);
        System.out.println("Test case for adding " + a1 + " and " + b1 + ": " + 
                          (result1 == 3 ? "PASSED" : "FAILED"));
        if (result1 != 3) {
            System.out.println("  Expected: 3, Actual: " + result1);
        }
        
        // Test case 2: One negative, one positive
        int a2 = -2, b2 = 3;
        int result2 = solution.getSum(a2, b2);
        System.out.println("Test case for adding " + a2 + " and " + b2 + ": " + 
                          (result2 == 1 ? "PASSED" : "FAILED"));
        if (result2 != 1) {
            System.out.println("  Expected: 1, Actual: " + result2);
        }
        
        // Test case 3: Both negative
        int a3 = -1, b3 = -2;
        int result3 = solution.getSum(a3, b3);
        System.out.println("Test case for adding " + a3 + " and " + b3 + ": " + 
                          (result3 == -3 ? "PASSED" : "FAILED"));
        if (result3 != -3) {
            System.out.println("  Expected: -3, Actual: " + result3);
        }
        
        // Test case 4: Adding zero
        int a4 = 42, b4 = 0;
        int result4 = solution.getSum(a4, b4);
        System.out.println("Test case for adding " + a4 + " and " + b4 + ": " + 
                          (result4 == 42 ? "PASSED" : "FAILED"));
        if (result4 != 42) {
            System.out.println("  Expected: 42, Actual: " + result4);
        }
    }
}
