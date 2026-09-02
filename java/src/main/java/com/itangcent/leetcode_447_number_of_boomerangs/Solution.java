package com.itangcent.leetcode_447_number_of_boomerangs;


/*
 * @lc app=leetcode id=447 lang=java
 *
 * [447] Number of Boomerangs
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {

    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        Map<Long, Long> cache = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            int[] pointA = points[i];
            Map<Long, Integer> counts = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                int[] pointB = points[j];
                long key = getKey(i, j);
                Long distance = cache.computeIfAbsent(key, k ->
                        square(pointA[0] - pointB[0]) + square(pointA[1] - pointB[1])
                );
                int cnt = counts.getOrDefault(distance, 0);
                if (cnt > 0) {
                    res += cnt * 2;
                }
                counts.put(distance, cnt + 1);
            }
        }
        return res;
    }

    private long getKey(int i, int j) {
        if (i > j) {
            return ((long) i << 32) | j;
        } else {
            return ((long) j << 32) | i;
        }
    }

    private long square(int i) {
        return (long) i * (long) i;
    }
}
// @lc code=end

