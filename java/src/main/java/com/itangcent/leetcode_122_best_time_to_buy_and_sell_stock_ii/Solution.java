package com.itangcent.leetcode_122_best_time_to_buy_and_sell_stock_ii;


/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price > minPrice) {
                profit += price - minPrice;
                minPrice = price;
            }
        }
        return profit;
    }
}
// @lc code=end

