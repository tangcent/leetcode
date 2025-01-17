package com.itangcent.leetcode_75_sort_colors;

public class SolutionTest {
    static Solution solution = new Solution();

    public static void main(String[] args) {
        // Test case 1: Basic case with all colors
        test(new int[]{2,0,2,1,1,0}, new int[]{0,0,1,1,2,2});

        // Test case 2: Already sorted array
        test(new int[]{0,0,1,1,2,2}, new int[]{0,0,1,1,2,2});

        // Test case 3: Single element array
        test(new int[]{1}, new int[]{1});

        // Test case 4: Array with only two colors
        test(new int[]{1,0,1,0}, new int[]{0,0,1,1});

        // Test case 5: Array with all same color
        test(new int[]{2,2,2}, new int[]{2,2,2});

        // Test case 6: Empty array
        test(new int[]{}, new int[]{});

        System.out.println("All tests passed!");
    }
    
    private static void test(int[] nums, int[] expected) {
        // Create a copy of input array for comparison
        int[] input = nums.clone();
        
        solution.sortColors(nums);
        
        // Compare result with expected
        if (!arrayEquals(nums, expected)) {
            System.err.println("Test failed!");
            System.err.println("Input array: " + arrayToString(input));
            System.err.println("Expected: " + arrayToString(expected));
            System.err.println("Got: " + arrayToString(nums));
            System.exit(1);
        }
    }
    
    private static boolean arrayEquals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
} 