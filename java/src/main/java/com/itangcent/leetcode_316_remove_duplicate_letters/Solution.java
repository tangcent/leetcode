package com.itangcent.leetcode_316_remove_duplicate_letters;


/*
 * @lc app=leetcode id=316 lang=java
 *
 * [316] Remove Duplicate Letters
 */

// @lc code=start
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[128];
        boolean[] visited = new boolean[128];
        char[] chars = s.toCharArray();
        
        // Count character occurrences
        for (char c : chars) {
            count[c]++;
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            count[c]--;
            if (visited[c]) continue;
            
            // Remove characters from result if:
            // 1. current character is smaller than last character in result
            // 2. last character will appear again later
            while (result.length() > 0 
                   && c < result.charAt(result.length() - 1) 
                   && count[result.charAt(result.length() - 1)] > 0) {
                visited[result.charAt(result.length() - 1)] = false;
                result.deleteCharAt(result.length() - 1);
            }
            
            result.append(c);
            visited[c] = true;
        }
        return result.toString();
    }
}
// @lc code=end
