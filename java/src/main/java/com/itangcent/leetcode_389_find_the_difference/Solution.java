package com.itangcent.leetcode_389_find_the_difference;


/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        int[] counts = new int[26];
        for (int i = 0; i < t.length(); i++) {
            counts[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                return (char) (i + 'a');
            }
        }
        return (char) 0;
    }
}
// @lc code=end

