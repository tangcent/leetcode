package com.itangcent.leetcode_66_plus_one;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Simple case
        System.out.println("Test case 1: [1,2,3]");
        System.out.println("Expected: [1,2,4]");
        System.out.println("Actual: " + Arrays.toString(solution.plusOne(new int[]{1,2,3})));
        System.out.println();

        // Test case 2: Number ending with 9
        System.out.println("Test case 2: [4,3,2,9]");
        System.out.println("Expected: [4,3,3,0]");
        System.out.println("Actual: " + Arrays.toString(solution.plusOne(new int[]{4,3,2,9})));
        System.out.println();

        // Test case 3: All nines
        System.out.println("Test case 3: [9,9,9]");
        System.out.println("Expected: [1,0,0,0]");
        System.out.println("Actual: " + Arrays.toString(solution.plusOne(new int[]{9,9,9})));
        System.out.println();

        // Test case 4: Single digit
        System.out.println("Test case 4: [0]");
        System.out.println("Expected: [1]");
        System.out.println("Actual: " + Arrays.toString(solution.plusOne(new int[]{0})));
        System.out.println();
    }
} 