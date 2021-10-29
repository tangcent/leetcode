package com.itangcent.v_longest_palindromic_substring;


/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 * Given a string s, return the longest palindromic substring in s.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 * <p>
 * Input: s = "cbbd"
 * Output: "bb"
 * Example 3:
 * <p>
 * Input: s = "a"
 * Output: "a"
 * Example 4:
 * <p>
 * Input: s = "ac"
 * Output: "a"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */
class Solution {
    public String longestPalindrome(String s) {
        // write your code here

        final int mid = s.length() >> 1;
        if (mid == 0) {
            return s;
        }

        int minIndex = 0;
        int maxStrStart = 0;
        int maxStrLength = 1;

        int a, b;
        if ((s.length() & 1) == 0) {
            a = mid - 1;
            b = mid;
            if (s.charAt(a) == s.charAt(b)) {
                maxStrLength = longestPalindrome(s, a - 1, b + 1);
                minIndex = (maxStrLength >> 1);
                maxStrStart = a - minIndex + 1;
            }
        } else {
            a = mid;
            b = mid;
            maxStrLength = longestPalindrome(s, a, a);
            minIndex = (maxStrLength >> 1);
            maxStrStart = a - minIndex;
        }

        while (a > minIndex) {

            int max = 0;


            if (s.charAt(a) == s.charAt(a - 1)) {
                max = longestPalindrome(s, a - 2, a + 1);
                if (max > maxStrLength) {
                    maxStrLength = max;
                    minIndex = (maxStrLength >> 1);
                    maxStrStart = a - minIndex;
                }
            }

            if (s.charAt(b) == s.charAt(b + 1)) {
                max = longestPalindrome(s, b - 1, b + 2);
                if (max > maxStrLength) {
                    maxStrLength = max;
                    minIndex = (maxStrLength >> 1);
                    maxStrStart = b - minIndex + 1;
                }
            }

            if (s.charAt(a - 1) == s.charAt(a + 1)) {
                max = longestPalindrome(s, a - 1, a + 1);
                if (max > maxStrLength) {
                    maxStrLength = max;
                    minIndex = (maxStrLength >> 1);
                    maxStrStart = a - minIndex;
                }
            }


            if (s.charAt(b - 1) == s.charAt(b + 1)) {
                max = longestPalindrome(s, b, b);
                if (max > maxStrLength) {
                    maxStrLength = max;
                    minIndex = (max >> 1);
                    maxStrStart = b - minIndex;
                }
            }

            --a;
            ++b;
        }

        return s.substring(maxStrStart, maxStrStart + maxStrLength);

    }

    public int longestPalindrome(String s, int indexA, int indexB) {
        try {
            while (s.charAt(indexA) == s.charAt(indexB)) {
                indexA--;
                indexB++;
            }
        } catch (Exception ignored) {

        }
        return indexB - indexA - 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("abb"));
        System.out.println(new Solution().longestPalindrome("abiyw8wqbggbqw8whusbaabsdiqqbgygbqqbqywebe1927ehbncdzdzdcnbhecab"));
    }
}
