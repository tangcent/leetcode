package com.itangcent.leetcode_50_pow_x_n;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Basic case with positive power
        double x1 = 2.0;
        int n1 = 10;
        System.out.println("Test case 1: Basic case with positive power");
        System.out.println("Input: x = " + x1 + ", n = " + n1);
        double result1 = solution.myPow(x1, n1);
        System.out.println("Output: " + result1);
        System.out.println();

        // Test case 2: Negative power
        double x2 = 2.0;
        int n2 = -2;
        System.out.println("Test case 2: Negative power");
        System.out.println("Input: x = " + x2 + ", n = " + n2);
        double result2 = solution.myPow(x2, n2);
        System.out.println("Output: " + result2);
        System.out.println();

        // Test case 3: Zero power
        double x3 = 2.0;
        int n3 = 0;
        System.out.println("Test case 3: Zero power");
        System.out.println("Input: x = " + x3 + ", n = " + n3);
        double result3 = solution.myPow(x3, n3);
        System.out.println("Output: " + result3);
        System.out.println();

        // Test case 4: Negative base
        double x4 = -2.0;
        int n4 = 3;
        System.out.println("Test case 4: Negative base");
        System.out.println("Input: x = " + x4 + ", n = " + n4);
        double result4 = solution.myPow(x4, n4);
        System.out.println("Output: " + result4);
        System.out.println();

        // Test case 5: Edge case with Integer.MIN_VALUE
        double x5 = 1.0;
        int n5 = -2147483648;
        System.out.println("Test case 5: Edge case with Integer.MIN_VALUE");
        System.out.println("Input: x = " + x5 + ", n = " + n5);
        double result5 = solution.myPow(x5, n5);
        System.out.println("Output: " + result5);
        System.out.println();

        // Test case 6: Edge case with Integer.MAX_VALUE
        double x6 = 1.0;
        int n6 = 2147483647;
        System.out.println("Test case 6: Edge case with Integer.MAX_VALUE");
        System.out.println("Input: x = " + x6 + ", n = " + n6);
        double result6 = solution.myPow(x6, n6);
        System.out.println("Output: " + result6);
    }
} 