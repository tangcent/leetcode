package com.itangcent.leetcode_53_maximum_subarray;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: [-2,1,-3,4,-1,2,1,-5,4]
        System.out.println("Test case 1: [-2,1,-3,4,-1,2,1,-5,4]");
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        int result1 = solution.maxSubArray(nums1);
        System.out.println("Result: " + result1);
        System.out.println();

        // Test case 2: [1]
        System.out.println("Test case 2: [1]");
        int[] nums2 = {1};
        int result2 = solution.maxSubArray(nums2);
        System.out.println("Result: " + result2);
        System.out.println();

        // Test case 3: [5,4,-1,7,8]
        System.out.println("Test case 3: [5,4,-1,7,8]");
        int[] nums3 = {5,4,-1,7,8};
        int result3 = solution.maxSubArray(nums3);
        System.out.println("Result: " + result3);
        System.out.println();

        // Test case 4: [-1]
        System.out.println("Test case 4: [-1]");
        int[] nums4 = {-1};
        int result4 = solution.maxSubArray(nums4);
        System.out.println("Result: " + result4);
        System.out.println();

        // Test case 5: [-2,-1]
        System.out.println("Test case 5: [-2,-1]");
        int[] nums5 = {-2,-1};
        int result5 = solution.maxSubArray(nums5);
        System.out.println("Result: " + result5);
        System.out.println();

        // Test case 6: Large array with alternating positive and negative numbers
        System.out.println("Test case 6: Large array with alternating numbers");
        int[] nums6 = {1,-2,3,-4,5,-6,7,-8,9,-10,11,-12,13,-14,15};
        int result6 = solution.maxSubArray(nums6);
        System.out.println("Result: " + result6);
        System.out.println();

        // Test case 7: Array with all negative numbers
        System.out.println("Test case 7: All negative numbers");
        int[] nums7 = {-5,-4,-3,-2,-1,-10,-8,-6,-4,-2};
        int result7 = solution.maxSubArray(nums7);
        System.out.println("Result: " + result7);
        System.out.println();

        // Test case 8: Array with all positive numbers
        System.out.println("Test case 8: All positive numbers");
        int[] nums8 = {1,2,3,4,5,6,7,8,9,10};
        int result8 = solution.maxSubArray(nums8);
        System.out.println("Result: " + result8);
        System.out.println();

        // Test case 9: Array with large numbers and small numbers
        System.out.println("Test case 9: Mix of large and small numbers");
        int[] nums9 = {1000,-1,1000,-1,1000,-1,1000};
        int result9 = solution.maxSubArray(nums9);
        System.out.println("Result: " + result9);
        System.out.println();

        // Test case 10: Array with repeated patterns
        System.out.println("Test case 10: Array with repeated patterns");
        int[] nums10 = {1,2,3,-5,1,2,3,-5,1,2,3};
        int result10 = solution.maxSubArray(nums10);
        System.out.println("Result: " + result10);
        System.out.println();

        // Test case 11: Array with maximum sum at the end
        System.out.println("Test case 11: Maximum sum at the end");
        int[] nums11 = {-1,-2,-3,4,5,6,7,8,9,10};
        int result11 = solution.maxSubArray(nums11);
        System.out.println("Result: " + result11);
        System.out.println();

        // Test case 12: Array with maximum sum at the beginning
        System.out.println("Test case 12: Maximum sum at the beginning");
        int[] nums12 = {10,9,8,7,6,5,4,-1,-2,-3};
        int result12 = solution.maxSubArray(nums12);
        System.out.println("Result: " + result12);
    }
} 