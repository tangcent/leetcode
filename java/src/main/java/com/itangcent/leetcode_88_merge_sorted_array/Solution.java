package com.itangcent.leetcode_88_merge_sorted_array;

/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null || n <= 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;
        int max = Math.max(nums1[0], nums2[0]);
        while (i < m || j < n) {
            while (i < m && nums1[i] < max) {
                result[k++] = nums1[i++];
            }
            while (j < n && nums2[j] < max) {
                result[k++] = nums2[j++];
            }
            if (i < m && nums1[i] == max) {
                result[k++] = nums1[i++];
            }
            if (j < n && nums2[j] == max) {
                result[k++] = nums2[j++];
            }
            max = Math.max(i < m ? nums1[i] : Integer.MIN_VALUE, j < n ? nums2[j] : Integer.MIN_VALUE);
        }
        System.arraycopy(result, 0, nums1, 0, m + n);
    }
}
// @lc code=end

