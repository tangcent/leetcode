package com.itangcent.leetcode_84_largest_rectangle_in_histogram;/*
 * @lc app=leetcode id=84 lang=java
 *
 * [84] Largest Rectangle in Histogram
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// @lc code=start
class Solution {
    public int largestRectangleArea(int[] heights) {
        int length = heights.length;
        if (length == 0) return 0;
        //h -> start
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int maxH = 0;
        for (int i = 0; i < length; i++) {
            int height = heights[i];
            List<Integer> heightList = new ArrayList<>(map.keySet());
            int newStart = i;
            if (height < maxH) {
                for (Integer h : heightList) {
                    if (h > height) {
                        newStart = Math.min(newStart, map.get(h));
                        max = Math.max(max, h * (i - map.get(h)));
                        map.remove(h);
                    }
                }
            }
            if (!map.containsKey(height)) {
                map.put(height, newStart);
            }
            maxH = height;
        }
        for (Integer h : map.keySet()) {
            max = Math.max(max, h * (length - map.get(h)));
        }
        return max;
    }
}
// @lc code=end

