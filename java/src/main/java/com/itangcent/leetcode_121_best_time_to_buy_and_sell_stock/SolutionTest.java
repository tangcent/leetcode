package com.itangcent.leetcode_121_best_time_to_buy_and_sell_stock;

/**
 * Test class for the solution to LeetCode problem #121: best-time-to-buy-and-sell-stock
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Basic case with clear profit
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int expected1 = 5;
        int result1 = solution.maxProfit(prices1);
        System.out.println("Test case for basic profit: " + (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("Expected: " + expected1 + ", Actual: " + result1);
        }

        // Test case 2: No profit possible (prices always decreasing)
        int[] prices2 = {7, 6, 4, 3, 1};
        int expected2 = 0;
        int result2 = solution.maxProfit(prices2);
        System.out.println("Test case for no profit: " + (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("Expected: " + expected2 + ", Actual: " + result2);
        }

        // Test case 3: Multiple peaks and valleys
        int[] prices3 = {3, 2, 6, 5, 0, 3};
        int expected3 = 4;
        int result3 = solution.maxProfit(prices3);
        System.out.println("Test case for multiple peaks: " + (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("Expected: " + expected3 + ", Actual: " + result3);
        }

        // Test case 4: Empty array
        int[] prices4 = {};
        int expected4 = 0;
        int result4 = solution.maxProfit(prices4);
        System.out.println("Test case for empty array: " + (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("Expected: " + expected4 + ", Actual: " + result4);
        }

        // Test case 5: Single day array
        int[] prices5 = {7};
        int expected5 = 0;
        int result5 = solution.maxProfit(prices5);
        System.out.println("Test case for single day: " + (result5 == expected5 ? "PASSED" : "FAILED"));
        if (result5 != expected5) {
            System.out.println("Expected: " + expected5 + ", Actual: " + result5);
        }
    }
}
