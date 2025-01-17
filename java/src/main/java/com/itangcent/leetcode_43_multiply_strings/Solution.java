package com.itangcent.leetcode_43_multiply_strings;

/*
 * @lc app=leetcode id=43 lang=java
 *
 * [43] Multiply Strings
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null || num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int[] result = new int[num1.length() + num2.length()];
        int[] num1Arr = astNumArr(num1);
        int[] num2Arr = astNumArr(num2);
        for (int i = 0; i < num1Arr.length; i++) {
            for (int j = 0; j < num2Arr.length; j++) {
                result[i + j] += num1Arr[i] * num2Arr[j];
            }
        }

        int carry = 0;
        for (int i = 0; i < result.length; ++i) {
            result[i] += carry;
            carry = result[i] / 10;
            if (carry > 0) {
                result[i] %= 10;
            }
        }

        StringBuilder sb = new StringBuilder(result.length);
        int i = result.length - 1;
        for (; i >= 0; --i) {
            if (result[i] != 0) {
                break;
            }
        }
        if (i == -1) {
            return "0";
        }
        for (; i >= 0; --i) {
            sb.append(result[i]);
        }
        return sb.toString();
    }

    private int[] astNumArr(String num) {
        int length = num.length();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = num.charAt(length - i - 1) - '0';
        }
        return arr;
    }
}
// @lc code=end 