package com.itangcent.leetcode_402_remove_k_digits;


/*
 * @lc app=leetcode id=402 lang=java
 *
 * [402] Remove K Digits
 */

// @lc code=start
class Solution {
    public String removeKdigits(String num, int k) {
        // Edge case: if k equals the length of num, return "0"
        if (k >= num.length()) {
            return "0";
        }
        
        // Use StringBuilder as a stack
        StringBuilder stack = new StringBuilder();
        
        // Process each digit
        for (char digit : num.toCharArray()) {
            // When the current digit is smaller than the last digit in the stack
            // and we still need to remove digits, we pop from the stack
            while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > digit) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            
            // Skip leading zeros
            if (stack.length() == 0 && digit == '0') {
                continue;
            }
            
            // Add current digit to the stack
            stack.append(digit);
        }
        
        // If we still need to remove digits, remove from the end
        // (this happens when digits are in non-decreasing order)
        while (k > 0 && stack.length() > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }
        
        // Return result, or "0" if the result is empty
        return stack.length() == 0 ? "0" : stack.toString();
    }
}
// @lc code=end

