package com.itangcent.leetcode_322_coin_change;

/**
 * Test class for the solution to LeetCode problem #322: coin-change
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Running tests for LeetCode problem #322: coin-change");
        
        // Test case 1: Standard case
        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        int expected1 = 3; // 5 + 5 + 1
        int result1 = solution.coinChange(coins1, amount1);
        System.out.println("Test case 1 - Standard case: " +
                         (result1 == expected1 ? "PASSED" : "FAILED") +
                         " (Expected: " + expected1 + ", Actual: " + result1 + ")");

        // Test case 2: Exact single coin match
        int[] coins2 = {1, 5, 10};
        int amount2 = 5;
        int expected2 = 1;
        int result2 = solution.coinChange(coins2, amount2);
        System.out.println("Test case 2 - Exact single coin: " +
                         (result2 == expected2 ? "PASSED" : "FAILED") +
                         " (Expected: " + expected2 + ", Actual: " + result2 + ")");

        // Test case 3: No possible combination
        int[] coins3 = {2};
        int amount3 = 3;
        int expected3 = -1;
        int result3 = solution.coinChange(coins3, amount3);
        System.out.println("Test case 3 - No combination: " +
                         (result3 == expected3 ? "PASSED" : "FAILED") +
                         " (Expected: " + expected3 + ", Actual: " + result3 + ")");

        // Test case 4: Amount is 0
        int[] coins4 = {1, 2, 5};
        int amount4 = 0;
        int expected4 = 0;
        int result4 = solution.coinChange(coins4, amount4);
        System.out.println("Test case 4 - Zero amount: " +
                         (result4 == expected4 ? "PASSED" : "FAILED") +
                         " (Expected: " + expected4 + ", Actual: " + result4 + ")");

        // Test case 5: Duplicate coin values
        int[] coins5 = {1, 1, 2, 5, 5};
        int amount5 = 11;
        int expected5 = 3; // 5 + 5 + 1
        int result5 = solution.coinChange(coins5, amount5);
        System.out.println("Test case 5 - Duplicate coins: " +
                         (result5 == expected5 ? "PASSED" : "FAILED") +
                         " (Expected: " + expected5 + ", Actual: " + result5 + ")");

        // Test case 6: Complex case from LeetCode
        int[] coins6 = {186, 419, 83, 408};
        int amount6 = 6249;
        int expected6 = 20;
        int result6 = solution.coinChange(coins6, amount6);
        System.out.println("Test case 6 - Complex case: " + 
                         (result6 == expected6 ? "PASSED" : "FAILED") + 
                         " (Expected: " + expected6 + ", Actual: " + result6 + ")");
    }
}
