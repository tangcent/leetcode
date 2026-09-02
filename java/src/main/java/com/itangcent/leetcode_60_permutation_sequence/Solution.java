package com.itangcent.leetcode_60_permutation_sequence;

/*
 * @lc app=leetcode id=60 lang=java
 *
 * [60] Permutation Sequence
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {

    static int[] factorials = new int[10];

    static {
        factorials[0] = 0;
        factorials[1] = 1;
        for (int i = 2; i < 10; ++i) {
            factorials[i] = factorials[i - 1] * i;
        }
    }

    public String getPermutation(int n, int k) {
        List<Character> candidates = buildCandidates(n);
        char[] res = new char[n];
        int rest = k - 1;
        int index = 0;
        for (int i = n - 1; i > 0; --i, ++index) {
            int unit = factorials[i];
            int x = rest / unit;
            if (x < 0) {
                res[index] = getNthChar(candidates, 0);
                continue;
            }
            res[index] = getNthChar(candidates, x);
            rest = rest % unit;
        }
        res[index] = getNthChar(candidates, 0);

        return new String(res);
    }

    private List<Character> buildCandidates(int n) {
        List<Character> candidates = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            candidates.add((char) ('1' + i));
        }
        return candidates;
    }

    private char getNthChar(List<Character> candidates, int n) {
        char ch = candidates.get(n);
        candidates.remove(n);
        return ch;
    }
}
// @lc code=end 