package com.itangcent.leetcode_43_multiply_strings;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Simple multiplication
        String result1 = solution.multiply("2", "3");
        System.out.println("Test case 1: " + result1); // Expected: 6

        // Test case 2: Larger numbers
        String result2 = solution.multiply("123", "456");
        System.out.println("Test case 2: " + result2); // Expected: 56088

        // Test case 3: Multiplication with zero
        String result3 = solution.multiply("0", "12345");
        System.out.println("Test case 3: " + result3); // Expected: 0

        // Test case 4: Multiplication with one
        String result4 = solution.multiply("1", "1");
        System.out.println("Test case 4: " + result4); // Expected: 1

        // Test case 5: Large numbers multiplication
        String result5 = solution.multiply("999999999", "999999999");
        System.out.println("Test case 5: " + result5); // Expected: 999999998000000001
    }
} 