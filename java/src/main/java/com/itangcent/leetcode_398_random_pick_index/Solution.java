package com.itangcent.leetcode_398_random_pick_index;


/*
 * @lc app=leetcode id=398 lang=java
 *
 * [398] Random Pick Index
 */

import java.util.Random;

// @lc code=start
class Solution {

    private int[] nums;
    private int length;
    private Random random = new Random(System.currentTimeMillis());

    public Solution(int[] nums) {
        this.nums = nums;
        this.length = nums.length;
    }

    public int pick(int target) {
        int index = -1;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == target) {
                count++;
                if (random.nextInt(count) == 0) {
                    index = i;
                }
            }
        }
        return index;
    }
}
// @lc code=end

