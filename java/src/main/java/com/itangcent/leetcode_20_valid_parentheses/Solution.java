package com.itangcent.leetcode_20_valid_parentheses;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Character[] stack = new Character[s.length()];
        int top = -1;
        for(char c:s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack[++top] = c;
            }else{
                if(top == -1) return false;
                if(c == ')' && stack[top] == '(' || c == ']' && stack[top] == '[' || c == '}' && stack[top] == '{'){
                    top--;
                }else{
                    return false;
                }
            }
        }
        return top == -1;
    }
}
// @lc code=end

