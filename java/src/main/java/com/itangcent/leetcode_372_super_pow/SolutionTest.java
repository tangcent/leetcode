package com.itangcent.leetcode_372_super_pow;

/**
 * Test class for the solution to LeetCode problem #372: super-pow
 * 
 * Calculate a^b mod 1337 where a is a positive integer and b is an 
 * extremely large positive integer given in the form of an array.
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #372: super-pow");

        // Test case 1: a = 2, b = [3] => 2^3 = 8
        int a1 = 2;
        int[] b1 = {3};
        int expected1 = 8;
        int result1 = solution.superPow(a1, b1);
        System.out.println("Test case for a=2, b=[3]: " +
                          (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }

        // Test case 2: a = 2, b = [1,0] => 2^10 = 1024 % 1337 = 1024
        int a2 = 2;
        int[] b2 = {1, 0};
        int expected2 = 1024;
        int result2 = solution.superPow(a2, b2);
        System.out.println("Test case for a=2, b=[1,0]: " +
                          (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }

        // Test case 3: a = 1, b = [4,3,3,8,5,2] => 1^433852 = 1
        int a3 = 1;
        int[] b3 = {4, 3, 3, 8, 5, 2};
        int expected3 = 1;
        int result3 = solution.superPow(a3, b3);
        System.out.println("Test case for a=1, b=[4,3,3,8,5,2]: " +
                          (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }

        // Test case 4: a = 2147483647, b = [2,0,0] => (2147483647^200) % 1337
        int a4 = 2147483647;
        int[] b4 = {2, 0, 0};
        int expected4 = 1198;
        int result4 = solution.superPow(a4, b4);
        System.out.println("Test case for a=2147483647, b=[2,0,0]: " +
                          (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }
        
        // Test case 5: a = 78267, b = [1,7,7,4,3,1,7,0,1,4,4,9,2,8,5,0,0,9,3,1,2,5,9,6,0,9,9,0,9,6,0,5,3,7,2,1,0]
        int a5 = 78267;
        int[] b5 = {1,7,7,4,3,1,7,0,1,4,4,9,2,8,5,0,0,9,3,1,2,5,9,6,0,9,9,0,9,6,0,5,3,7,2,1,0};
        int expected5 = 1323;
        int result5 = solution.superPow(a5, b5);
        System.out.println("Test case for a=78267, b=[1,7,7,4,3,...]: " + 
                          (result5 == expected5 ? "PASSED" : "FAILED"));
        if (result5 != expected5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
        }
    }
}
