package com.itangcent.leetcode_169_majority_element;


/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for(int n : nums){
            if(count==0){
                candidate = n;
                ++count;
            } else if(n == candidate){
                ++count;
            } else{
                --count;
            }
        }
        return candidate;

    }
}
// @lc code=end

