package com.itangcent.leetcode_150_evaluate_reverse_polish_notation;


/*
 * @lc app=leetcode id=150 lang=java
 *
 * [150] Evaluate Reverse Polish Notation
 */

import java.util.*;

// @lc code=start
class Solution {
    private static final Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));

    public int evalRPN(String[] tokens) {
        Integer result = null;
        List<Integer> list = new ArrayList<>();
        for (String token : tokens) {
            if (operators.contains(token)) {
                int b = list.remove(list.size() - 1);
                int a = list.remove(list.size() - 1);
                result = calculate(a, b, token);
                list.add(result);
            } else {
                list.add(Integer.parseInt(token));
            }
        }
        return result == null ? list.get(0) : result;
    }

    private int calculate(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
        }
        return 0;
    }
}
// @lc code=end

