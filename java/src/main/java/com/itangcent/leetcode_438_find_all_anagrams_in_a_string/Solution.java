package com.itangcent.leetcode_438_find_all_anagrams_in_a_string;


/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return new ArrayList<>();
        }
        int[] countsP = new int[128];
        int[] countsS = new int[128];
        int length = p.length();

        for (int i = 0; i < length; i++) {
            ++countsP[p.charAt(i)];
            ++countsS[s.charAt(i)];
        }

        List<Integer> res = new ArrayList<>();
        for (int i = length; i < s.length(); i++) {
            int preIndex = i - length;
            if (isAnagram(countsP, countsS)) {
                res.add(preIndex);
            }
            --countsS[s.charAt(preIndex)];
            ++countsS[s.charAt(i)];
        }
        if (isAnagram(countsP, countsS)) {
            res.add(s.length() - length);
        }
        return res;
    }

    private boolean isAnagram(int[] countsA, int[] countsB) {
        for (int i = 0; i < countsA.length; i++) {
            if (countsA[i] != countsB[i]) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

