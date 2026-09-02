package com.itangcent.leetcode_152_maximum_product_subarray;


/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {

        int maxProduct = nums[0];
        int minProduct = nums[0];

        int prevMax = nums[0];
        int prevMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            int productWitMax = prevMax * num;
            int productWitMin = prevMin * num;

            if (num < 0) {
                prevMax = Math.max(productWitMin, num);
                prevMin = Math.min(productWitMax, num);
            } else {
                prevMax = Math.max(productWitMax, num);
                prevMin = Math.min(productWitMin, num);
            }

            if (prevMax > maxProduct) {
                maxProduct = prevMax;
            }
            if (prevMin > minProduct) {
                minProduct = prevMin;
            }
        }

        return maxProduct;
    }
}
// @lc code=end

