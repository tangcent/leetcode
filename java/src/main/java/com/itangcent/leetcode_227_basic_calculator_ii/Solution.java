package com.itangcent.leetcode_227_basic_calculator_ii;


/*
 * @lc app=leetcode id=227 lang=java
 *
 * [227] Basic Calculator II
 */

// @lc code=start
class Solution {
    public int calculate(String s) {
        if (s == null || s.isEmpty()) return 0;
        Reader reader = new Reader(s);

        long result = 0;
        int currentNum = reader.readNumber();
        char prevOp = '+';

        while (!reader.isEnd()) {
            Character op = reader.readOperator();
            if (op == null) break;

            int nextNum = reader.readNumber();

            switch (op) {
                case '+':
                case '-':
                    result = caculate(result, currentNum, prevOp);
                    currentNum = nextNum;
                    prevOp = op;
                    break;
                case '*':
                    currentNum *= nextNum;
                    break;
                case '/':
                    currentNum /= nextNum;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + op);
            }
        }

        // Add the last number
        result = caculate(result, currentNum, prevOp);
        return (int) result;
    }

    private long caculate(long a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }

    private class Reader {
        String str;
        int index = 0;
        int length = 0;

        public Reader(String str) {
            this.str = str;
            this.length = str.length();
        }

        private boolean isEnd() {
            return index >= length;
        }

        public int readNumber() {
            skipWhitespace();
            int number = 0;
            while (index < length && Character.isDigit(str.charAt(index))) {
                number = number * 10 + (str.charAt(index) - '0');
                index++;
            }
            return number;
        }

        public Character readOperator() {
            skipWhitespace();
            if (index < length) {
                return str.charAt(index++);
            }
            return null;
        }

        private void skipWhitespace() {
            while (index < length && Character.isWhitespace(str.charAt(index))) {
                index++;
            }
        }
    }
}
// @lc code=end

