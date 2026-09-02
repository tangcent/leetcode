package com.itangcent.leetcode_115_distinct_subsequences;


/*
 * @lc app=leetcode id=115 lang=java
 *
 * [115] Distinct Subsequences
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {
    public int numDistinct(String s, String t) {
        return numDistinct(s, t, 0, 0, t.length());
    }

    private Map<Integer, Integer> cache = new HashMap<>();

    public int numDistinct(String s, String t, int sStart, int tStart, int rest) {
        if (tStart == t.length()) {
            return 1;
        }
        if (sStart == s.length() || rest + sStart > s.length()) {
            return 0;
        }
        int key = sStart << 16 | tStart;
        Integer cacheRes = cache.get(key);
        if (cacheRes != null) {
            return cacheRes;
        }
        int res = numDistinct(s, t, sStart + 1, tStart, rest - 1);
        if (s.charAt(sStart) == t.charAt(tStart)) {
            res += numDistinct(s, t, sStart + 1, tStart + 1, rest - 1);
        }
        cache.put(key, res);
        return res;
    }
}
// @lc code=end

