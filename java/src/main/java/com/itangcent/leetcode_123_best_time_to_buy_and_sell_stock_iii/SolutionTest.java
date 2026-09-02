package com.itangcent.leetcode_123_best_time_to_buy_and_sell_stock_iii;

/**
 * Test class for the solution to LeetCode problem #123: best-time-to-buy-and-sell-stock-iii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #123: best-time-to-buy-and-sell-stock-iii");
        
        // Test case 1: Empty array
        int[] prices1 = {};
        int expected1 = 0;
        int result1 = solution.maxProfit(prices1);
        System.out.println("Test case for empty array: " + (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test case 2: Single price
        int[] prices2 = {7};
        int expected2 = 0;
        int result2 = solution.maxProfit(prices2);
        System.out.println("Test case for single price: " + (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test case 3: Decreasing prices
        int[] prices3 = {7, 6, 5, 4, 3, 2, 1};
        int expected3 = 0;
        int result3 = solution.maxProfit(prices3);
        System.out.println("Test case for decreasing prices: " + (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test case 4: Increasing prices
        int[] prices4 = {1, 2, 3, 4, 5, 6, 7};
        int expected4 = 6;
        int result4 = solution.maxProfit(prices4);
        System.out.println("Test case for increasing prices: " + (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("Expected: " + expected4 + ", Actual: " + result4);
        }
        
        // Test case 5: LeetCode example
        int[] prices5 = {3, 3, 5, 0, 0, 3, 1, 4};
        int expected5 = 6;
        int result5 = solution.maxProfit(prices5);
        System.out.println("Test case for LeetCode example: " + (result5 == expected5 ? "PASSED" : "FAILED"));
        if (result5 != expected5) {
            System.out.println("Expected: " + expected5 + ", Actual: " + result5);
        }
        
        // Test case 6: Multiple peaks and valleys
        int[] prices6 = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0};
        int expected6 = 13;
        int result6 = solution.maxProfit(prices6);
        System.out.println("Test case for multiple peaks and valleys: " + (result6 == expected6 ? "PASSED" : "FAILED"));
        if (result6 != expected6) {
            System.out.println("Expected: " + expected6 + ", Actual: " + result6);
        }
    }
}
