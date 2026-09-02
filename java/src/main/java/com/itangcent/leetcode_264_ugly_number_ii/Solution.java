package com.itangcent.leetcode_264_ugly_number_ii;


/*
 * @lc app=leetcode id=264 lang=java
 *
 * [264] Ugly Number II
 */

// @lc code=start
class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        
        // Array to store ugly numbers
        int[] ugly = new int[n];
        ugly[0] = 1;
        
        // Three pointers for multiplying with 2, 3, and 5
        int p2 = 0, p3 = 0, p5 = 0;
        
        for (int i = 1; i < n; i++) {
            // Generate next ugly number by taking the minimum of the multiples
            int nextUgly2 = ugly[p2] * 2;
            int nextUgly3 = ugly[p3] * 3;
            int nextUgly5 = ugly[p5] * 5;
            
            int nextUgly = Math.min(nextUgly2, Math.min(nextUgly3, nextUgly5));
            ugly[i] = nextUgly;
            
            // Increment the pointers for the values that were used
            if (nextUgly == nextUgly2) p2++;
            if (nextUgly == nextUgly3) p3++;
            if (nextUgly == nextUgly5) p5++;
        }
        
        return ugly[n-1];
    }
}
// @lc code=end

