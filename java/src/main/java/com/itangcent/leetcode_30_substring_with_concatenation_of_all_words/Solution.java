package com.itangcent.leetcode_30_substring_with_concatenation_of_all_words;
/*
 * @lc app=leetcode id=30 lang=java
 *
 * [30] Substring with Concatenation of All Words
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// @lc code=start
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.isEmpty() || words == null || words.length == 0) {
            return result;
        }

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        int wordLen = words[0].length();
        int totalWords = words.length;

        // Start from each possible offset
        for (int offset = 0; offset < wordLen; offset++) {
            int left = offset;
            int count = 0;
            Map<String, Integer> currentCount = new HashMap<>();

            // Slide the window
            for (int right = offset; right <= s.length() - wordLen; right += wordLen) {
                String word = s.substring(right, right + wordLen);

                // If this is not a valid word, reset everything
                if (!wordCount.containsKey(word)) {
                    currentCount.clear();
                    count = 0;
                    left = right + wordLen;
                    continue;
                }

                // Add the new word to current window
                currentCount.put(word, currentCount.getOrDefault(word, 0) + 1);
                count++;

                // Remove words from the left if we have too many
                while (currentCount.getOrDefault(word, 0) > wordCount.getOrDefault(word, 0)) {
                    String leftWord = s.substring(left, left + wordLen);
                    currentCount.put(leftWord, currentCount.get(leftWord) - 1);
                    count--;
                    left += wordLen;
                }

                // If we have found all words
                if (count == totalWords) {
                    result.add(left);
                    // Remove leftmost word and continue
                    String leftWord = s.substring(left, left + wordLen);
                    currentCount.put(leftWord, currentCount.get(leftWord) - 1);
                    count--;
                    left += wordLen;
                }
            }
        }

        return result;
    }
}
// @lc code=end 