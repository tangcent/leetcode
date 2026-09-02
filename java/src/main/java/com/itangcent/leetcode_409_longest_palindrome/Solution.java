package com.itangcent.leetcode_409_longest_palindrome;


/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        // Count frequencies of each character
        int[] counts = new int[128];
        for (char c : s.toCharArray()) {
            counts[c]++;
        }
        
        int length = 0;
        boolean hasOdd = false;
        
        // For each character, add the largest even count to result
        for (int count : counts) {
            // Add the largest even count of this character
            length += count / 2 * 2;
            
            // Check if we can use an odd count as the middle character
            if (count % 2 == 1) {
                hasOdd = true;
            }
        }
        
        // If there's any character with odd count, we can use one as the center
        if (hasOdd) {
            length++;
        }
        
        return length;
    }
}
// @lc code=end

