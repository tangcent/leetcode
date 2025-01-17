package com.itangcent.leetcode_57_insert_interval;

/*
 * @lc app=leetcode id=57 lang=java
 *
 * [57] Insert Interval
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> mergedIntervals = new ArrayList<>();
        insertInterval(intervals, newInterval, mergedIntervals);
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }

    private void insertInterval(int[][] intervals, int[] newInterval, List<int[]> mergedIntervals) {
        int i = 0;
        int n = intervals.length;
        for (; i < n; ++i) {
            if (intervals[i][1] < newInterval[0]) {
                mergedIntervals.add(intervals[i]);
            } else {
                break;
            }
        }
        if (i == n) {
            mergedIntervals.add(newInterval);
            return;
        }

        int[] currentInterval = newInterval;
        for (; i < n; ++i) {
            int[] nextInterval = intervals[i];
            if (nextInterval[0] > currentInterval[1]) {
                mergedIntervals.add(currentInterval);
                currentInterval = null;
                break;
            }
            mergeTo(nextInterval, currentInterval);
        }

        if (currentInterval != null) {
            mergedIntervals.add(currentInterval);
        }

        for (; i < n; ++i) {
            mergedIntervals.add(intervals[i]);
        }
    }

    private void mergeTo(int[] from, int[] to) {
        to[0] = Math.min(from[0], to[0]);
        to[1] = Math.max(from[1], to[1]);
    }
}
// @lc code=end

