package com.itangcent.leetcode_500_keyboard_row;


/*
 * @lc app=leetcode id=500 lang=java
 *
 * [500] Keyboard Row
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {


    private static String[] rows = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
    private static int[] indexes = new int[128];

    static {
        for (int i = 0; i < rows.length; i++) {
            String row = rows[i];
            for (int j = 0; j < row.length(); j++) {
                indexes[row.charAt(j)] = i;
                indexes[Character.toUpperCase(row.charAt(j))] = i;
            }
        }
    }

    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>(words.length);
        for (String word : words) {
            if (isLinedWord(word)) {
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }

    private boolean isLinedWord(String word) {
        int index = indexes[word.charAt(0)];
        for (int i = 1; i < word.length(); i++) {
            if (indexes[word.charAt(i)] != index) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

