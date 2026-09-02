package com.itangcent.leetcode_151_reverse_words_in_a_string;


/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (start < i) {
                    words.add(s.substring(start, i));
                }
                start = i + 1;
            }
        }
        if (start < s.length()) {
            words.add(s.substring(start));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            sb.append(words.get(i));
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
// @lc code=end

