package com.itangcent.leetcode_519_random_flip_matrix;


/*
 * @lc app=leetcode id=519 lang=java
 *
 * [519] Random Flip Matrix
 */

import java.util.*;

// @lc code=start
class Solution {

    private int m;
    private int n;
    private Random random = new Random();
    private List<Line> lines = new ArrayList<>();

    public Solution(int m, int n) {
        this.m = m;
        this.n = n;
        reset();
    }

    public int[] flip() {
        int index = random.nextInt(lines.size());
        Line line = lines.get(index);
        int[] res = line.pickOne();
        if (line.isEmpty()) {
            lines.remove(index);
        }
        return res;
    }

    public void reset() {
        lines.clear();
        for (int i = 0; i < m; i++) {
            lines.add(new Line(i, n));
        }
    }

    private class Line {
        int line;
        List<int[]> ranges;

        public Line(int line, int len) {
            this.line = line;
            this.ranges = new ArrayList<>();
            this.ranges.add(new int[]{0, len});
        }

        boolean isEmpty() {
            return ranges.isEmpty();
        }

        int[] pickOne() {
            int index = random.nextInt(ranges.size());
            int[] range = ranges.get(index);
            if (range[1] == 1) {
                ranges.remove(index);
                return new int[]{line, range[0]};
            }
            int pick = random.nextInt(range[1]);
            int val = range[0] + pick;
            if (pick == 0) {
                --range[1];
                ++range[0];
            } else if (pick == range[1] - 1) {
                --range[1];
            } else {
                ranges.remove(index);
                ranges.add(new int[]{range[0], pick});
                ranges.add(new int[]{range[0] + pick + 1, range[1] - pick - 1});
            }
            return new int[]{line, val};
        }
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */
// @lc code=end

