package com.itangcent.leetcode_125_valid_palindrome;


/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int length = s.length();
        int left = 0;
        int right = length - 1;
        while (left < right) {
            char leftChar = s.charAt(left);
            while (!isAlphanumeric(leftChar)) {
                left++;
                if (left >= right) {
                    return true;
                }
                leftChar = s.charAt(left);
            }

            char rightChar = s.charAt(right);
            while (!isAlphanumeric(rightChar)) {
                right--;
                if (right <= left) {
                    return true;
                }
                rightChar = s.charAt(right);
            }

            if (toLowerCase(leftChar) != toLowerCase(rightChar)) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }

    private boolean isAlphanumeric(char c) {
        return (c >= '0' && c <= '9')
                || (c >= 'a' && c <= 'z')
                || (c >= 'A' && c <= 'Z');
    }

    private final int offset = 'a' - 'A';

    private char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + offset);
        }
        return c;
    }
}
// @lc code=end

