package com.itangcent.leetcode_524_longest_word_in_dictionary_through_deleting;


/*
 * @lc app=leetcode id=524 lang=java
 *
 * [524] Longest Word in Dictionary through Deleting
 */

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// @lc code=start
class Solution {
    private final Map<String, Integer> cache = new HashMap<>();

    public String findLongestWord(String s, List<String> dictionary) {
        cache.clear();
        cache.put("", -1);

        dictionary.sort(Comparator.comparing(String::length).reversed().thenComparing(Comparator.naturalOrder()));

        for (String word : dictionary) {
            if (findLatestIndex(s, word) != -2) {
                return word;
            }
        }
        return "";
    }

    private int findLatestIndex(String s, String word) {
        if (cache.containsKey(word)) {
            return cache.get(word);
        }
        int res = -2;
        String prefix = word.substring(0, word.length() - 1);
        int prefixIndex = findLatestIndex(s, prefix);
        if (prefixIndex != -2) {
            char nextCh = word.charAt(word.length() - 1);
            for (int i = prefixIndex + 1; i < s.length(); i++) {
                if (s.charAt(i) == nextCh) {
                    res = i;
                    break;
                }
            }
        }
        cache.put(word, res);
        return res;

    }
}
// @lc code=end
