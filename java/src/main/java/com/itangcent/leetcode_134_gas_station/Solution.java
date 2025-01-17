package com.itangcent.leetcode_134_gas_station;


/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;      // Total gas available
        int currentGas = 0;    // Gas in tank at current position
        int startStation = 0;  // Potential starting station

        for (int i = 0; i < gas.length; i++) {
            int netGas = gas[i] - cost[i];
            totalGas += netGas;
            currentGas += netGas;

            // If we can't reach the next station from current position
            if (currentGas < 0) {
                // Reset starting point to next station
                startStation = i + 1;
                currentGas = 0;
            }
        }

        // If total gas is non-negative, we can complete the circuit
        return totalGas >= 0 ? startStation : -1;
    }
}
// @lc code=end

