package com.itangcent.leetcode_494_target_sum;

/**
 * Test class for the solution to LeetCode problem #494: target-sum
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1
        int[] nums1 = {1, 1, 1, 1, 1};
        int target1 = 3;
        testCase(solution, nums1, target1, 5);
        
        // Test Case 2
        int[] nums2 = {1};
        int target2 = 1;
        testCase(solution, nums2, target2, 1);
        
        // Test Case 3
        int[] nums3 = {1, 0};
        int target3 = 1;
        testCase(solution, nums3, target3, 2);
        
        // Test Case 4
        int[] nums4 = {0, 0, 0, 0, 0, 0, 0, 0, 1};
        int target4 = 1;
        testCase(solution, nums4, target4, 256);
    }
    
    private static void testCase(Solution solution, int[] nums, int target, int expected) {
        int result = solution.findTargetSumWays(nums, target);
        boolean passed = result == expected;
        
        System.out.println("Test case for nums=" + arrayToString(nums) + ", target=" + target + ": " + 
                (passed ? "PASSED" : "FAILED"));
        
        if (!passed) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + result);
        }
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
