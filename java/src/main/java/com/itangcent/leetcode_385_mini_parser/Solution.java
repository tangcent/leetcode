package com.itangcent.leetcode_385_mini_parser;


/*
 * @lc app=leetcode id=385 lang=java
 *
 * [385] Mini Parser
 */

// @lc code=start

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 * // Constructor initializes an empty nested list.
 * public NestedInteger();
 * <p>
 * // Constructor initializes a single integer.
 * public NestedInteger(int value);
 * <p>
 * // @return true if this NestedInteger holds a single integer, rather than a nested list.
 * public boolean isInteger();
 * <p>
 * // @return the single integer that this NestedInteger holds, if it holds a single integer
 * // Return null if this NestedInteger holds a nested list
 * public Integer getInteger();
 * <p>
 * // Set this NestedInteger to hold a single integer.
 * public void setInteger(int value);
 * <p>
 * // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 * public void add(NestedInteger ni);
 * <p>
 * // @return the nested list that this NestedInteger holds, if it holds a nested list
 * // Return empty list if this NestedInteger holds a single integer
 * public List<NestedInteger> getList();
 * }
 */
class Solution {

    private int index = 0;
    private String str;

    public NestedInteger deserialize(String s) {
        this.index = 0;
        this.str = s;
        return deserializeUnknown();
    }

    public NestedInteger deserializeUnknown() {
        if (index >= str.length()) {
            return null;
        }
        
        char c = str.charAt(index);
        if (c == '[') {
            return deserializeArray();
        } else if (c == '-' || Character.isDigit(c)) {
            return deserializeNumber();
        } else {
            return null;
        }
    }

    public NestedInteger deserializeArray() {
        NestedInteger result = new NestedInteger();
        ++index; // Skip '['
        
        if (index < str.length() && str.charAt(index) == ']') {
            ++index; // Skip ']' for empty array
            return result;
        }
        
        while (index < str.length()) {
            NestedInteger next = deserializeUnknown();
            if (next == null) {
                break;
            }
            result.add(next);
            
            if (index < str.length()) {
                char c = str.charAt(index);
                if (c == ']') {
                    ++index; // Skip ']'
                    break;
                } else if (c == ',') {
                    ++index; // Skip ','
                }
            }
        }
        
        return result;
    }

    public NestedInteger deserializeNumber() {
        boolean isNegative = false;
        int number = 0;
        
        if (str.charAt(index) == '-') {
            isNegative = true;
            ++index;
        }
        
        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            number = number * 10 + (str.charAt(index) - '0');
            ++index;
        }
        
        return new NestedInteger(isNegative ? -number : number);
    }
}
// @lc code=end

