package com.itangcent.leetcode_187_repeated_dna_sequences;


/*
 * @lc app=leetcode id=187 lang=java
 *
 * [187] Repeated DNA Sequences
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// @lc code=start
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();

        int length = s.length();
        if (length <= 10) {
            return result;
        }

        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for (int i = 0; i <= length - 10; i++) {
            String sequence = s.substring(i, i + 10);
            if (!seen.add(sequence)) {
                repeated.add(sequence);
            }
        }

        return new ArrayList<>(repeated);
    }
}
// @lc code=end

