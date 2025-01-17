package com.itangcent.leetcode_140_word_break_ii;


/*
 * @lc app=leetcode id=140 lang=java
 *
 * [140] Word Break II
 */

import java.util.*;

// @lc code=start
class Solution {
    private Map<Integer, List<String>> cache = new HashMap<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        cache.clear();
        Set<String> wordSet = new HashSet<>(wordDict);
        char[] chars = s.toCharArray();
        return wordBreak(chars, 0, chars.length, wordSet);
    }

    private List<String> wordBreak(char[] chars, int start, int end, Set<String> wordDict) {
        int cacheKey = start << 16 + end;
        if (cache.containsKey(cacheKey)) {
            return cache.get(cacheKey);
        }
        if (start >= end) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        for (int i = start + 1; i <= end; i++) {
            String word = new String(chars, start, i - start);
            if (wordDict.contains(word)) {
                if (i == end) {
                    result.add(word);
                } else {
                    List<String> subResult = wordBreak(chars, i, end, wordDict);
                    for (String sub : subResult) {
                        result.add(word + " " + sub);
                    }
                }
            }
        }
        cache.put(cacheKey, result);
        return result;
    }
}
// @lc code=end

