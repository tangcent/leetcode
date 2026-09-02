package com.itangcent.leetcode_322_coin_change;


/*
 * @lc app=leetcode id=322 lang=java
 *
 * [322] Coin Change
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {

    private final Map<Integer, Integer> cache = new HashMap<>();

    public int coinChange(int[] coins, int amount) {
        this.cache.clear();
        this.cache.put(0, 0);

        return doCoinChange(coins, amount);
    }

    public int doCoinChange(int[] coins, int amount) {
        if (cache.containsKey(amount)) {
            return cache.get(amount);
        }

        int min = -1;
        for (int coin : coins) {
            int rest = amount - coin;
            if (rest < 0) {
                continue;
            }
            int next = doCoinChange(coins, rest);
            if (next == -1) {
                continue;
            }

            if (min == -1 || next < min) {
                min = next + 1;
            }
        }
        cache.put(amount, min);
        return min;
    }
}
// @lc code=end

