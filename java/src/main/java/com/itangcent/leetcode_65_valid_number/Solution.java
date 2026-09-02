package com.itangcent.leetcode_65_valid_number;
/*
 * @lc app=leetcode id=65 lang=java
 *
 * [65] Valid Number
 */

// @lc code=start
class Solution {
    public boolean isNumber(String s) {
        return new Matcher(s).match();
    }

    private static class Matcher {
        public Matcher(String s) {
            this.s = s;
            this.len = s.length();
        }

        private String s;

        private int len;

        private int index = 0;

        private boolean match() {
            return matchNumber() && index == len;
        }

        private void matchOptionalSign() {
            if (index == len) {
                return;
            }

            char ch = s.charAt(index);

            if (ch == '+' || ch == '-') {
                index++;
            }
        }

        private boolean matchPositiveInteger() {
            if (index == len) {
                return false;
            }

            if (Character.isDigit(s.charAt(index))) {
                ++index;
            } else {
                return false;
            }

            while (index < len && Character.isDigit(s.charAt(index))) {
                index++;
            }
            return true;
        }

        private boolean matchInteger() {
            matchOptionalSign();
            return matchPositiveInteger();
        }

        private boolean matchDouble() {
            boolean matchInt = matchInteger();
            if (index < len && s.charAt(index) == '.') {
                index++;
                boolean matchFractional = matchPositiveInteger();
                return matchInt || matchFractional;
            }

            return matchInt;
        }

        private boolean matchOptionalExponent() {
            if (index == len) {
                return true;
            }

            char ch = s.charAt(index);
            if (ch != 'E' && ch != 'e') {
                return false;
            }
            index++;
            return matchInteger();
        }

        private boolean matchNumber() {
            if (!matchDouble()) {
                return false;
            }

            return matchOptionalExponent();
        }
    }
}
// @lc code=end 