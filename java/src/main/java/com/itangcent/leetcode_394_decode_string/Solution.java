package com.itangcent.leetcode_394_decode_string;


/*
 * @lc app=leetcode id=394 lang=java
 *
 * [394] Decode String
 */

import java.util.LinkedList;

// @lc code=start
class Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        LinkedList<StringBuilder> strStack = new LinkedList<>();
        LinkedList<Integer> countStack = new LinkedList<>();

        int count = 0;
        StringBuilder curr = sb;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // is
            if ('0' <= c && c <= '9') {
                count = count * 10 + (c - '0');
            } else if (c == '[') {
                strStack.push(curr);
                countStack.push(count);

                curr = new StringBuilder();
                count = 0;

            } else if (c == ']') {
                StringBuilder temp = curr;
                curr = strStack.pop();
                count = countStack.pop();
                for (int x = 0; x < count; x++) {
                    curr.append(temp);
                }
                count = 0;
            } else {
                curr.append(c);
            }
        }
        return sb.toString();
    }
}
// @lc code=end

