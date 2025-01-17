package com.itangcent.leetcode_386_lexicographical_numbers;

/*
 * @lc app=leetcode id=386 lang=java
 *
 * [386] Lexicographical Numbers
 *
 * Given an integer n, return 1 - n in lexicographical order.
 * 
 * For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].
 *
 * Please optimize your algorithm to use less time and less space. The input size may be as large as 5,000,000.
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>(n);
        for (int i = 1; i <= 9; i++) {
            dfs(i, n, result);
        }
        return result;
    }
    
    private void dfs(int curr, int n, List<Integer> result) {
        if (curr > n) {
            return;
        }
        
        result.add(curr);
        
        for (int i = 0; i <= 9; i++) {
            if (curr * 10 + i <= n) {
                dfs(curr * 10 + i, n, result);
            }
        }
    }
}
// @lc code=end

