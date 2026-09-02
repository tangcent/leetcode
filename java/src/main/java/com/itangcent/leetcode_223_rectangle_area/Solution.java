package com.itangcent.leetcode_223_rectangle_area;


/*
 * @lc app=leetcode id=223 lang=java
 *
 * [223] Rectangle Area
 */

// @lc code=start
class Solution {
    public int computeArea(int ax1, int ay1,
                           int ax2, int ay2,
                           int bx1, int by1,
                           int bx2, int by2) {
        // Calculate area of first rectangle
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        
        // Calculate area of second rectangle
        int area2 = (bx2 - bx1) * (by2 - by1);
        
        // Calculate overlapping area
        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
        
        // If rectangles don't overlap, both overlapWidth and overlapHeight will be <= 0
        int overlapArea = 0;
        if (overlapWidth > 0 && overlapHeight > 0) {
            overlapArea = overlapWidth * overlapHeight;
        }
        
        // Total area = sum of areas - overlap
        return area1 + area2 - overlapArea;
    }
}
// @lc code=end

