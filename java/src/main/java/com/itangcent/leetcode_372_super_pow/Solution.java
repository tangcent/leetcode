package com.itangcent.leetcode_372_super_pow;


/*
 * @lc app=leetcode id=372 lang=java
 *
 * [372] Super Pow
 */

// @lc code=start
class Solution {
    private static int MOD = 1337;

    public int superPow(int a, int[] b) {
        a %= MOD;
        int result = 1;
        
        // a^b[0] * (a^10)^b[1] * (a^100)^b[2] * ...
        for (int j : b) {
            result = (powMod(result, 10) * powMod(a, j)) % MOD;
        }
        
        return result;
    }
    
    // Calculate (x^n) % MOD
    private int powMod(int x, int n) {
        int result = 1;
        x %= MOD;
        
        while (n > 0) {
            if ((n & 1) == 1) {
                result = (result * x) % MOD;
            }
            x = (x * x) % MOD;
            n >>= 1;
        }
        
        return result;
    }
}
// @lc code=end

