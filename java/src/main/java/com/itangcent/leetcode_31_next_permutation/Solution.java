package com.itangcent.leetcode_31_next_permutation;

import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                int j=nums.length-1;
                while(nums[j]<=nums[i]) j--;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                Arrays.sort(nums,i+1,nums.length);
                return;
            }
        }
        Arrays.sort(nums);
    }
} 