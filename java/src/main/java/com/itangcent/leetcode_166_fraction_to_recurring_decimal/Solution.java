package com.itangcent.leetcode_166_fraction_to_recurring_decimal;


/*
 * @lc app=leetcode id=166 lang=java
 *
 * [166] Fraction to Recurring Decimal
 */

// @lc code=start
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        
        StringBuilder result = new StringBuilder();
        
        // Handle sign
        boolean isNegative = (numerator < 0) ^ (denominator < 0);
        if (isNegative) {
            result.append("-");
        }
        
        // Convert to long to prevent overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        
        // Integer part
        result.append(num / den);
        
        // Check if there's a fractional part
        long remainder = num % den;
        if (remainder == 0) {
            return result.toString();
        }
        
        result.append(".");
        
        // Map to store remainders and their positions in result
        java.util.HashMap<Long, Integer> remainderPositions = new java.util.HashMap<>();
        
        while (remainder != 0) {
            // If this remainder was seen before, we have a recurring cycle
            if (remainderPositions.containsKey(remainder)) {
                int position = remainderPositions.get(remainder);
                result.insert(position, "(");
                result.append(")");
                break;
            }
            
            // Store the remainder and its position
            remainderPositions.put(remainder, result.length());
            
            // Continue division
            remainder *= 10;
            result.append(remainder / den);
            remainder %= den;
        }
        
        return result.toString();
    }
}
// @lc code=end

