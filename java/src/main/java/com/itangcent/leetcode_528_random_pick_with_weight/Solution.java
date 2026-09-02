package com.itangcent.leetcode_528_random_pick_with_weight;


/*
 * @lc app=leetcode id=528 lang=java
 *
 * [528] Random Pick with Weight
 */

import java.util.Random;

// @lc code=start
class Solution {

    private final int[] w;
    private final int total;
    private final Random random = new Random();

    public Solution(int[] w) {
        int total = 0;
        this.w = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            total += w[i];
            this.w[i] = total;
        }
        this.total = total;
    }

    public int pickIndex() {
        int next = random.nextInt(this.total);
        for (int i = 0; i < w.length; i++) {
            if (next < w[i]) {
                return i;
            }
        }
        return 0;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
// @lc code=end

