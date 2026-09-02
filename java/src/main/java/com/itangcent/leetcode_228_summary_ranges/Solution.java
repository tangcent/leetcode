package com.itangcent.leetcode_228_summary_ranges;


/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        int start = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            start = i;
            for (j = i + 1; j < nums.length; ++j, ++i) {
                if (nums[j] != nums[i] + 1) {
                    break;
                }
            }
            result.add(rangeOf(nums[start], j - start));
        }
        return result;
    }

    private String rangeOf(int start, int len) {
        if (len == 1) {
            return String.valueOf(start);
        } else {
            return start + "->" + (start + len - 1);
        }
    }
}
// @lc code=end

