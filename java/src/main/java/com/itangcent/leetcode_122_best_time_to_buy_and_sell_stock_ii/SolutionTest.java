package com.itangcent.leetcode_122_best_time_to_buy_and_sell_stock_ii;

/**
 * Test class for the solution to LeetCode problem #122: best-time-to-buy-and-sell-stock-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Empty array
        int[] prices1 = {};
        int expected1 = 0;
        int result1 = solution.maxProfit(prices1);
        System.out.println("Test case for empty array: " + (result1 == expected1 ? "PASSED" : "FAILED"));
        
        // Test case 2: Single price
        int[] prices2 = {7};
        int expected2 = 0;
        int result2 = solution.maxProfit(prices2);
        System.out.println("Test case for single price: " + (result2 == expected2 ? "PASSED" : "FAILED"));
        
        // Test case 3: Increasing prices
        int[] prices3 = {1, 2, 3, 4, 5};
        int expected3 = 4;
        int result3 = solution.maxProfit(prices3);
        System.out.println("Test case for increasing prices: " + (result3 == expected3 ? "PASSED" : "FAILED"));
        
        // Test case 4: Decreasing prices
        int[] prices4 = {5, 4, 3, 2, 1};
        int expected4 = 0;
        int result4 = solution.maxProfit(prices4);
        System.out.println("Test case for decreasing prices: " + (result4 == expected4 ? "PASSED" : "FAILED"));
        
        // Test case 5: Mixed prices
        int[] prices5 = {7, 1, 5, 3, 6, 4};
        int expected5 = 7;
        int result5 = solution.maxProfit(prices5);
        System.out.println("Test case for mixed prices: " + (result5 == expected5 ? "PASSED" : "FAILED"));
        
        // Test case 6: Multiple peaks and valleys
        int[] prices6 = {3, 2, 6, 5, 0, 3};
        int expected6 = 7;
        int result6 = solution.maxProfit(prices6);
        System.out.println("Test case for multiple peaks and valleys: " + (result6 == expected6 ? "PASSED" : "FAILED"));
    }
}
