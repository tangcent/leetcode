package com.itangcent.leetcode_274_h_index;


/*
 * @lc app=leetcode id=274 lang=java
 *
 * [274] H-Index
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        
        // Sort the citations array in ascending order
        java.util.Arrays.sort(citations);
        
        int h = 0;
        // Iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Number of papers with citation >= citations[i]
            int count = n - i;
            
            // If current citation count is >= count, then we have 'count' papers with at least 'count' citations
            if (citations[i] >= count) {
                h = count;
            } else {
                break;  // Once this condition fails, h won't increase further
            }
        }
        
        return h;
    }
}
// @lc code=end

