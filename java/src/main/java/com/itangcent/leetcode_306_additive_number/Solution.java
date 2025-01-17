package com.itangcent.leetcode_306_additive_number;

/*
 * @lc app=leetcode id=306 lang=java
 *
 * [306] Additive Number
 */

// @lc code=start
class Solution {
    public boolean isAdditiveNumber(String num) {
        int length = num.length();
        int minL = Math.min(String.valueOf(Long.MAX_VALUE).length() - 2, length / 2);
        for (int i = 1; i <= minL; i++) {
            for (int j = 1; j <= minL; j++) {
                if (isInvalidNumber(num, 0, i)
                        || isInvalidNumber(num, i, j)) {
                    continue;
                }

                long a = toNumber(num, 0, i);
                long b = toNumber(num, i, j);
                if (isAdditiveNumber(a, b, num, i + j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isInvalidNumber(String num, int start, int length) {
        return length != 1 && num.charAt(start) == '0';
    }

    private long toNumber(String num, int start, int length) {
        return Long.parseLong(num.substring(start, start + length));
    }

    private boolean isAdditiveNumber(long a, long b, String num, int start) {
        long nextNumber = a + b;
        String str = String.valueOf(nextNumber);
        int length = str.length();
        int nextStart = start + length;
        if (nextStart > num.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != num.charAt(start + i)) {
                return false;
            }
        }
        if (nextStart == num.length()) {
            return true;
        }
        return isAdditiveNumber(b, nextNumber, num, nextStart);
    }
}
// @lc code=end

