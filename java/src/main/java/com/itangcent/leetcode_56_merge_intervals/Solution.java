/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

package com.itangcent.leetcode_56_merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] currentInterval = intervals[0];
        List<int[]> mergedIntervals = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] <= currentInterval[1]) {
                // Merge
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                mergedIntervals.add(currentInterval);
                currentInterval = interval;
            }
        }
        mergedIntervals.add(currentInterval);
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
// @lc code=end

