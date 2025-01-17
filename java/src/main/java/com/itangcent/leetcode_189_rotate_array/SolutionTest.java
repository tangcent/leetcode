package com.itangcent.leetcode_189_rotate_array;

import java.util.Arrays;

/**
 * Test class for the solution to LeetCode problem #189: rotate-array
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        solution.rotate(nums1, k1);
        boolean result1 = Arrays.equals(nums1, new int[]{5, 6, 7, 1, 2, 3, 4});
        System.out.println("Test case for rotating [1,2,3,4,5,6,7] by 3: " + 
                          (result1 ? "PASSED" : "FAILED"));
        if (!result1) {
            System.out.println("  Expected: [5, 6, 7, 1, 2, 3, 4]");
            System.out.println("  Actual: " + Arrays.toString(nums1));
        }
        
        // Test case 2
        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        solution.rotate(nums2, k2);
        boolean result2 = Arrays.equals(nums2, new int[]{3, 99, -1, -100});
        System.out.println("Test case for rotating [-1,-100,3,99] by 2: " + 
                          (result2 ? "PASSED" : "FAILED"));
        if (!result2) {
            System.out.println("  Expected: [3, 99, -1, -100]");
            System.out.println("  Actual: " + Arrays.toString(nums2));
        }
        
        // Test case 3: Edge case with k > length
        int[] nums3 = {1, 2};
        int k3 = 3;
        solution.rotate(nums3, k3);
        boolean result3 = Arrays.equals(nums3, new int[]{2, 1});
        System.out.println("Test case for rotating [1,2] by 3: " + 
                          (result3 ? "PASSED" : "FAILED"));
        if (!result3) {
            System.out.println("  Expected: [2, 1]");
            System.out.println("  Actual: " + Arrays.toString(nums3));
        }
        
        // Test case 4: Empty array
        int[] nums4 = {};
        int k4 = 1;
        solution.rotate(nums4, k4);
        boolean result4 = Arrays.equals(nums4, new int[]{});
        System.out.println("Test case for rotating [] by 1: " + 
                          (result4 ? "PASSED" : "FAILED"));
    }
}
