package com.itangcent.leetcode_69_sqrt_x;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        test(1, 2, solution.mySqrt(4));

        // Test case 2
        test(2, 2, solution.mySqrt(8));

        // Test case 3
        test(3, 3, solution.mySqrt(9));

        // Test case 4
        test(4, 0, solution.mySqrt(0));

        // Test case 5
        test(5, 1, solution.mySqrt(1));

        // Test case 6
        test(6, 46340, solution.mySqrt(2147395600));
    }

    private static void test(int caseNum, int expected, int actual) {
        boolean passed = expected == actual;
        System.out.println("Test case " + caseNum + ": " + (passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
        }
    }
} 