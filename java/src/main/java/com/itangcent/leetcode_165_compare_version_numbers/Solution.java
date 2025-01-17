package com.itangcent.leetcode_165_compare_version_numbers;


/*
 * @lc app=leetcode id=165 lang=java
 *
 * [165] Compare Version Numbers
 */

// @lc code=start
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] partsA = version1.split("\\.");
        String[] partsB = version2.split("\\.");
        int maxLength = Math.max(partsA.length, partsB.length);
        for (int i = 0; i < maxLength; i++) {
            int numA = i < partsA.length ? Integer.parseInt(partsA[i]) : 0;
            int numB = i < partsB.length ? Integer.parseInt(partsB[i]) : 0;
            if (numA != numB) {
                return Integer.compare(numA, numB);
            }
        }
        return 0;
    }
}
// @lc code=end

