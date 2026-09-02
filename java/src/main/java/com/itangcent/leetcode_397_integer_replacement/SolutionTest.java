package com.itangcent.leetcode_397_integer_replacement;

/**
 * Test class for the solution to LeetCode problem #397: integer-replacement
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #397: integer-replacement");
//
//        // Test case 1: n = 8
//        int n1 = 8;
//        int expected1 = 3; // 8 -> 4 -> 2 -> 1 (3 steps)
//        int result1 = solution.integerReplacement(n1);
//        System.out.println("Test case for n = " + n1 + ": " + (result1 == expected1 ? "PASSED" : "FAILED"));
//        if (result1 != expected1) {
//            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
//        }
//
//        // Test case 2: n = 7
//        int n2 = 7;
//        int expected2 = 4; // 7 -> 6 -> 3 -> 2 -> 1 (4 steps) or 7 -> 8 -> 4 -> 2 -> 1 (4 steps)
//        int result2 = solution.integerReplacement(n2);
//        System.out.println("Test case for n = " + n2 + ": " + (result2 == expected2 ? "PASSED" : "FAILED"));
//        if (result2 != expected2) {
//            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
//        }
//
//        // Test case 3: n = 4
//        int n3 = 4;
//        int expected3 = 2; // 4 -> 2 -> 1 (2 steps)
//        int result3 = solution.integerReplacement(n3);
//        System.out.println("Test case for n = " + n3 + ": " + (result3 == expected3 ? "PASSED" : "FAILED"));
//        if (result3 != expected3) {
//            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
//        }
//
//        // Test case 4: n = 1
//        int n4 = 1;
//        int expected4 = 0; // Already at 1, so 0 steps
//        int result4 = solution.integerReplacement(n4);
//        System.out.println("Test case for n = " + n4 + ": " + (result4 == expected4 ? "PASSED" : "FAILED"));
//        if (result4 != expected4) {
//            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
//        }
//
//        // Test case 5: n = 65535 (2^16 - 1)
//        int n5 = 65535;
//        int expected5 = 17; // Optimal path requires 17 steps
//        int result5 = solution.integerReplacement(n5);
//        System.out.println("Test case for n = " + n5 + ": " + (result5 == expected5 ? "PASSED" : "FAILED"));
//        if (result5 != expected5) {
//            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
//        }
        
        // Test case 6: Integer.MAX_VALUE
        try {
            int n6 = Integer.MAX_VALUE;
            int result6 = solution.integerReplacement(n6);
            int expected6 = 32; // 2^31-1 should take 32 steps
            System.out.println("Test case for n = Integer.MAX_VALUE: " + (result6 == expected6 ? "PASSED" : "FAILED"));
            if (result6 != expected6) {
                System.out.println("  Expected: " + expected6 + ", Actual: " + result6);
            }
        } catch (Exception e) {
            System.out.println("Test case for n = Integer.MAX_VALUE: FAILED (Exception thrown)");
            System.out.println("  Exception: " + e.getMessage());
        }
    }
}
