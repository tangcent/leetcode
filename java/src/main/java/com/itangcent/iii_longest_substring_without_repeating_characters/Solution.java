package com.itangcent.iii_longest_substring_without_repeating_characters;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * <p>
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s == null) return 0;
        int length = s.length();
        if (length == 0) return 0;

        int max = 1;

        int start = 0;
        for (int i = 1; i < length; i++) {
            char ch = s.charAt(i);
            int existed = findChar(s, start, i, ch);
            if (existed != -1) {
                int l = i - start;
                if (l > max) {
                    max = l;
                }
                start = existed + 1;
            }
        }

        int l = length - start;
        if (l > max) {
            max = l;
        }
        return max;
    }

    private int findChar(String s, int start, int end, char ch) {
        for (int i = start; i < end; i++) {
            if (s.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(new Solution().lengthOfLongestSubstring(str));
    }
}
