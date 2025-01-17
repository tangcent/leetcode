package com.itangcent.leetcode_215_kth_largest_element_in_an_array;

/**
 * Test class for the solution to LeetCode problem #215: kth-largest-element-in-an-array
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: [3,2,1,5,6,4], k = 2
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        int expected1 = 5;
        int result1 = solution.findKthLargest(nums1, k1);
        System.out.println("Test case for findKthLargest([3,2,1,5,6,4], 2): " + 
                           (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test case 2: [3,2,3,1,2,4,5,5,6], k = 4
        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        int expected2 = 4;
        int result2 = solution.findKthLargest(nums2, k2);
        System.out.println("Test case for findKthLargest([3,2,3,1,2,4,5,5,6], 4): " + 
                          (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test case 3: Single element array
        int[] nums3 = {1};
        int k3 = 1;
        int expected3 = 1;
        int result3 = solution.findKthLargest(nums3, k3);
        System.out.println("Test case for findKthLargest([1], 1): " + 
                          (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test case 4: Duplicate elements
        int[] nums4 = {3, 3, 3, 3, 3};
        int k4 = 1;
        int expected4 = 3;
        int result4 = solution.findKthLargest(nums4, k4);
        System.out.println("Test case for findKthLargest([3,3,3,3,3], 1): " + 
                          (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }
    }
}
