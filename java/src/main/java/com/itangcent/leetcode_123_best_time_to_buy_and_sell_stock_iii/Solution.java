package com.itangcent.leetcode_123_best_time_to_buy_and_sell_stock_iii;


/*
 * @lc app=leetcode id=123 lang=java
 *
 * [123] Best Time to Buy and Sell Stock III
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if (length <= 1) {
            return 0;
        }

        //dp state
        //dp[i][0]: first buy
        //dp[i][1]: first sell
        //dp[i][2]: second buy
        //dp[i][3]: second sell
        int[][] dp = new int[length][4];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        dp[0][2] = -prices[0];
        dp[0][3] = 0;

        for (int i = 1; i < length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] - prices[i]);
            dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] + prices[i]);
        }

        return Math.max(0, Math.max(dp[length - 1][1], dp[length - 1][3]));
    }
}
// @lc code=end

