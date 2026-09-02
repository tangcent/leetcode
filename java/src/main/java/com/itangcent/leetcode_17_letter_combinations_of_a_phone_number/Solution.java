package com.itangcent.leetcode_17_letter_combinations_of_a_phone_number;

/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// @lc code=start
class Solution {

    static HashMap<Character, char[]> digitMap = new HashMap();

    static {
        digitMap.put('2', new char[]{'a', 'b', 'c'});
        digitMap.put('3', new char[]{'d', 'e', 'f'});
        digitMap.put('4', new char[]{'g', 'h', 'i'});
        digitMap.put('5', new char[]{'j', 'k', 'l'});
        digitMap.put('6', new char[]{'m', 'n', 'o'});
        digitMap.put('7', new char[]{'p', 'q', 'r', 's'});
        digitMap.put('8', new char[]{'t', 'u', 'v'});
        digitMap.put('9', new char[]{'w', 'x', 'y', 'z'});
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        List<StringBuilder> result = new ArrayList<>();
        result.add(new StringBuilder(""));
        for (char digit : digits.toCharArray()) {
            char[] letters = digitMap.get(digit);
            List<StringBuilder> temp = new ArrayList<>(result.size() * letters.length);
            for (StringBuilder sb : result) {
                for (char letter : letters) {
                    temp.add(new StringBuilder(sb).append(letter));
                }
            }
            result = temp;
        }
        List<String> finalResult = new ArrayList<>(result.size());
        for (StringBuilder sb : result) {
            finalResult.add(sb.toString());
        }
        return finalResult;
    }
}
// @lc code=end


