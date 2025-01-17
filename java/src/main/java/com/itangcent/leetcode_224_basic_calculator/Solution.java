package com.itangcent.leetcode_224_basic_calculator;


/*
 * @lc app=leetcode id=224 lang=java
 *
 * [224] Basic Calculator
 */

import java.util.Stack;

// @lc code=start
class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int number = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                // Push the current result and sign onto the stack
                stack.push(result);
                stack.push(sign);
                // Reset the result and sign for calculation inside the parenthesis
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * number;
                number = 0;
                // Apply the sign outside the parenthesis
                result *= stack.pop();
                // Add the result before the parenthesis
                result += stack.pop();
            }
        }

        if (number != 0) {
            result += sign * number;
        }

        return result;
    }
}
// @lc code=end

