package com.itangcent.leetcode_518_coin_change_ii;

/**
 * Test class for the solution to LeetCode problem #518: coin-change-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #518: coin-change-ii");
        
        System.out.println("Testing minimum coins needed for amount (not combinations count)");
        
        // Test case 1: Minimum coins for basic case [1,2,5]
        int[] coins1 = {1, 2, 5};
        int amount1 = 5;
        int result1 = solution.change(amount1, coins1);
        System.out.println("Test minimum coins for [1,2,5] amount 5: " + 
            (result1 == 1 ? "PASSED" : "FAILED") + 
            " (Expected: 1, Actual: " + result1 + ")"); // Can make 5 with single 5 coin
            
        // Test case 2: No solution possible
        int[] coins2 = {2};
        int amount2 = 3;
        int result2 = solution.change(amount2, coins2);
        System.out.println("Test minimum coins when no solution [2] amount 3: " + 
            (result2 == 0 ? "PASSED" : "FAILED") + 
            " (Expected: 0, Actual: " + result2 + ")");
            
        // Test case 3: Zero amount requires zero coins
        int[] coins3 = {1, 2, 5};
        int amount3 = 0;
        int result3 = solution.change(amount3, coins3);
        System.out.println("Test minimum coins for zero amount: " + 
            (result3 == 0 ? "PASSED" : "FAILED") + 
            " (Expected: 0, Actual: " + result3 + ")");
            
        // Test case 4: Empty coins array can't make any amount
        int[] coins4 = {};
        int amount4 = 5;
        int result4 = solution.change(amount4, coins4);
        System.out.println("Test minimum coins with empty coins array: " + 
            (result4 == 0 ? "PASSED" : "FAILED") + 
            " (Expected: 0, Actual: " + result4 + ")");
            
        // Test case 5: Minimum coins with single denomination
        int[] coins5 = {5};
        int amount5 = 15;
        int result5 = solution.change(amount5, coins5);
        System.out.println("Test minimum coins for single coin [5] amount 15: " + 
            (result5 == 3 ? "PASSED" : "FAILED") + 
            " (Expected: 3, Actual: " + result5 + ")"); // 3x5 coins
            
        // Test case 6: Complex minimum coins case
        int[] coins6 = {1, 3, 4, 5};
        int amount6 = 7;
        int result6 = solution.change(amount6, coins6);
        System.out.println("Test minimum coins for complex case [1,3,4,5] amount 7: " + 
            (result6 == 2 ? "PASSED" : "FAILED") + 
            " (Expected: 2, Actual: " + result6 + ")"); // 4+3 coins
    }
}
