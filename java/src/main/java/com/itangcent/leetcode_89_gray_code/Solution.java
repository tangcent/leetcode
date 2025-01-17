package com.itangcent.leetcode_89_gray_code;

/*
 * @lc app=leetcode id=89 lang=java
 *
 * [89] Gray Code
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// @lc code=start
class Solution {
    public List<Integer> grayCode(int n) {
        if (n == 1) {
            return Arrays.asList(0, 1);
        }
        List<Integer> previousGrayCode = grayCode(n - 1);
        // Create the new gray code list
        int size = previousGrayCode.size();
        List<Integer> result = new ArrayList<>(size * 2);
        result.addAll(previousGrayCode);
        int prefix = 1 << (n - 1); // The prefix for the new gray code
        for (int i = size - 1; i >= 0; i--) {
            result.add(prefix + previousGrayCode.get(i));
        }
        return result;
    }
}
// @lc code=end

