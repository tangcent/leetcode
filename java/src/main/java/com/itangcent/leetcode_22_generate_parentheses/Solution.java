package com.itangcent.leetcode_22_generate_parentheses;

import java.util.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        int unmatched = 0;
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();
        generateParenthesis(n, unmatched, sb, result);
        return result;
    }

    private void generateParenthesis(int n, int unmatched, StringBuilder sb, List<String> result) {
        if (sb.length() == n * 2) {
            if (unmatched == 0) {
                result.add(sb.toString());
            }
            return;
        }
        if (unmatched < n) {
            sb.append('(');
            generateParenthesis(n, unmatched + 1, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (unmatched > 0) {
            sb.append(')');
            generateParenthesis(n, unmatched - 1, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
// @lc code=end

