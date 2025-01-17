package com.itangcent.leetcode_62_unique_paths;

import java.util.Arrays;

/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        if(m>n){
            return uniquePaths(n,m);
        }
        int[] arr = new int[m];
        Arrays.fill(arr,1);
        for(int i=1;i<n;++i){
            for(int j=1;j<m;++j){
                arr[j] = arr[j] + arr[j-1];
            }
        }
        return arr[m-1];
    }
}
// @lc code=end 