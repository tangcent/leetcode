package com.itangcent.leetcode_55_jump_game;

/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        for(int i=0;i<n;++i){
            if(i>max){
                break;
            }
            max = Math.max(max,i+nums[i]);
        }
        return max >= n-1;
    }
}
// @lc code=end 