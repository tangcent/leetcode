/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

package com.itangcent.leetcode_67_add_binary;

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int maxLen = Math.max(aLen, bLen);
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < maxLen; i++) {
            int aVal = i < aLen ? a.charAt(aLen - 1 - i) - '0' : 0;
            int bVal = i < bLen ? b.charAt(bLen - 1 - i) - '0' : 0;
            int sum = aVal + bVal + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
// @lc code=end 