package com.itangcent.leetcode_213_house_robber_ii;

/**
 * Test class for the solution to LeetCode problem #213: house-robber-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        testRob();
    }
    
    public static void testRob() {
        Solution solution = new Solution();
        
        // Test case 1: [2,3,2]
        int[] nums1 = {2, 3, 2};
        int expected1 = 3;
        int result1 = solution.rob(nums1);
        System.out.println("Test case for [2,3,2]: " + (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test case 2: [1,2,3,1]
        int[] nums2 = {1, 2, 3, 1};
        int expected2 = 4;
        int result2 = solution.rob(nums2);
        System.out.println("Test case for [1,2,3,1]: " + (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test case 3: [1,2,3]
        int[] nums3 = {1, 2, 3};
        int expected3 = 3;
        int result3 = solution.rob(nums3);
        System.out.println("Test case for [1,2,3]: " + (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test case 4: Single house
        int[] nums4 = {5};
        int expected4 = 5;
        int result4 = solution.rob(nums4);
        System.out.println("Test case for [5]: " + (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("Expected: " + expected4 + ", Actual: " + result4);
        }
    }
}
