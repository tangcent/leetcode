package com.itangcent.leetcode_179_largest_number;


/*
 * @lc app=leetcode id=179 lang=java
 *
 * [179] Largest Number
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (s1, s2) -> compare(s1, s2));
        
        // Check if the largest number is 0
        if (strs[0].equals("0")) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }

    private static int compare(String s1, String s2) {
        // Compare s1+s2 with s2+s1 lexicographically
        String order1 = s1 + s2;
        String order2 = s2 + s1;
        return order2.compareTo(order1);
    }
}
// @lc code=end

