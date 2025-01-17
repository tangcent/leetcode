package com.itangcent.leetcode_241_different_ways_to_add_parentheses;


/*
 * @lc app=leetcode id=241 lang=java
 *
 * [241] Different Ways to Add Parentheses
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// @lc code=start
class Solution {
    private HashMap<String, List<Integer>> cache = new HashMap<>();

    public List<Integer> diffWaysToCompute(String expression) {
        if (cache.containsKey(expression)) {
            return cache.get(expression);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                List<Integer> leftResults = diffWaysToCompute(left);
                List<Integer> rightResults = diffWaysToCompute(right);
                for (int l : leftResults) {
                    for (int r : rightResults) {
                        switch (c) {
                            case '+':
                                result.add(l + r);
                                break;
                            case '-':
                                result.add(l - r);
                                break;
                            case '*':
                                result.add(l * r);
                                break;
                        }
                    }
                }
            }
        }
        if (result.isEmpty()) {
            // Handle multi-digit numbers (0-99)
            result.add(Integer.parseInt(expression.trim()));
        }
        cache.put(expression, result);
        return result;
    }
}
// @lc code=end
