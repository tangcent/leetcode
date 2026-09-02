package com.itangcent.leetcode_205_isomorphic_strings;


/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

import java.util.HashMap;

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] mappings = new int[128];
        int[] reversals = new int[128];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            int existedMapping = mappings[chS];
            if (existedMapping == 0) {
                if (reversals[chT] != 0) {
                    return false;
                }
                mappings[chS] = chT;
                reversals[chT] = chS;
            } else if (existedMapping != chT) {
                return false;
            }
        }

        return true;
    }
}
// @lc code=end

