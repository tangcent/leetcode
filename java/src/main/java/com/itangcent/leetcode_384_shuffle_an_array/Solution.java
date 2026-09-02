package com.itangcent.leetcode_384_shuffle_an_array;


/*
 * @lc app=leetcode id=384 lang=java
 *
 * [384] Shuffle an Array
 */

import java.util.Arrays;
import java.util.Random;

// @lc code=start
class Solution {

    private final int[] original;
    private final int length;
    private final Random rand = new Random();

    public Solution(int[] nums) {
        this.original = nums;
        this.length = original.length;
    }

    public int[] reset() {
        return original;
    }

    public int[] shuffle() {
        int[] result = Arrays.copyOf(original, length);

        for (int i = 0; i < length; i++) {
            int exchange = rand.nextInt(length);
            int temp = result[exchange];
            result[exchange] = result[i];
            result[i] = temp;
        }

        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
// @lc code=end

