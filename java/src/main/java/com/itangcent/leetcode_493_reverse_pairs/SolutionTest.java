package com.itangcent.leetcode_493_reverse_pairs;

/**
 * Test class for the solution to LeetCode problem #493: reverse-pairs
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Basic case
        int[] nums1 = {1, 3, 2, 3, 1};
        int expected1 = 2;
        int actual1 = solution.reversePairs(nums1);
        String result1 = expected1 == actual1 ? "PASSED" :
            String.format("FAILED (expected %d, actual %d)", expected1, actual1);
        System.out.println("Test case for basic array: " + result1);

        // Test case 2: Empty array
        int[] nums2 = {};
        int expected2 = 0;
        int actual2 = solution.reversePairs(nums2);
        String result2 = expected2 == actual2 ? "PASSED" :
            String.format("FAILED (expected %d, actual %d)", expected2, actual2);
        System.out.println("Test case for empty array: " + result2);

        // Test case 3: Single element
        int[] nums3 = {5};
        int expected3 = 0;
        int actual3 = solution.reversePairs(nums3);
        String result3 = expected3 == actual3 ? "PASSED" :
            String.format("FAILED (expected %d, actual %d)", expected3, actual3);
        System.out.println("Test case for single element: " + result3);

        // Test case 4: With negative numbers
        int[] nums4 = {-5, -3, -1, 0, 2, 4};
        int expected4 = 1;
        int actual4 = solution.reversePairs(nums4);
        String result4 = expected4 == actual4 ? "PASSED" :
            String.format("FAILED (expected %d, actual %d)", expected4, actual4);
        System.out.println("Test case with negative numbers: " + result4);

        // Test case 5: Larger array
        int[] nums5 = {2, 4, 3, 5, 1, 6, 8, 7, 9, 0};
        int expected5 = 12;
        int actual5 = solution.reversePairs(nums5);
        String result5 = expected5 == actual5 ? "PASSED" :
            String.format("FAILED (expected %d, actual %d)", expected5, actual5);
        System.out.println("Test case for larger array: " + result5);

        // Test case 6: Descending order array
        int[] nums6 = {5, 4, 3, 2, 1};
        int expected6 = 4;
        int actual6 = solution.reversePairs(nums6);
        String result6 = expected6 == actual6 ? "PASSED" :
            String.format("FAILED (expected %d, actual %d)", expected6, actual6);
        System.out.println("Test case for descending order array: " + result6);

        // Test case 7: Large numbers array
        int[] nums7 = {233,2000000001,234,2000000006,235,2000000003,236,2000000007,237,2000000002,2000000005,233,233,233,233,233,2000000004};
        int expected7 = 40;
        int actual7 = solution.reversePairs(nums7);
        String result7 = expected7 == actual7 ? "PASSED" :
            String.format("FAILED (expected %d, actual %d)", expected7, actual7);
        System.out.println("Test case for large numbers array: " + result7);
    }
}
