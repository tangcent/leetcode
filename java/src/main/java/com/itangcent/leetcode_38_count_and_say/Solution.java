package com.itangcent.leetcode_38_count_and_say;

/*
 * @lc app=leetcode id=38 lang=java
 *
 * [38] Count and Say
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String s = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                sb.append(count).append(arr[i - 1]);
                count = 1;
            }
        }
        sb.append(count).append(arr[arr.length - 1]);
        return sb.toString();
    }
}
// @lc code=end

