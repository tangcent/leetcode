package com.itangcent.leetcode_88_merge_sorted_array;

/**
 * Test class for the solution to LeetCode problem #88: merge-sorted-array
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Normal case with different lengths
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        System.out.println("Test case 1: " + arrayToString(nums1));
        
        // Test case 2: nums2 is empty
        int[] nums3 = {1};
        int[] nums4 = {};
        solution.merge(nums3, 1, nums4, 0);
        System.out.println("Test case 2: " + arrayToString(nums3));
        
        // Test case 3: nums1 is empty
        int[] nums5 = {0};
        int[] nums6 = {1};
        solution.merge(nums5, 0, nums6, 1);
        System.out.println("Test case 3: " + arrayToString(nums5));
        
        // Test case 4: All elements in nums2 are larger
        int[] nums7 = {1, 2, 4, 5, 6, 0};
        int[] nums8 = {3};
        solution.merge(nums7, 5, nums8, 1);
        System.out.println("Test case 4: " + arrayToString(nums7));
        
        // Test case 5: All elements in nums2 are smaller
        int[] nums9 = {4, 5, 6, 0, 0, 0};
        int[] nums10 = {1, 2, 3};
        solution.merge(nums9, 3, nums10, 3);
        System.out.println("Test case 5: " + arrayToString(nums9));
        
        // Test case 6: Specific case [0], 0, [1], 1
        int[] nums11 = {0};
        int[] nums12 = {1};
        solution.merge(nums11, 0, nums12, 1);
        System.out.println("Test case 6: " + arrayToString(nums11));
    }
    
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
