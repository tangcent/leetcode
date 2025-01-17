package com.itangcent.leetcode_306_additive_number;

/**
 * Test class for the solution to LeetCode problem #306: additive-number
 * <p>
 * An additive number is a string whose digits can form a sequence where each number
 * is the sum of the two preceding numbers.
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Running tests for LeetCode problem #306: additive-number");

        // Test case 1: "112358" - Classic Fibonacci sequence
        String test1 = "112358";
        System.out.println("Test case for 112358: " +
                            (solution.isAdditiveNumber(test1) ? "PASSED" : "FAILED"));

        // Test case 2: "199100199" - Another valid additive sequence
        String test2 = "199100199";
        System.out.println("Test case for 199100199: " +
                            (solution.isAdditiveNumber(test2) ? "PASSED" : "FAILED"));

        // Test case 3: "123" - Is an additive number
        String test3 = "123";
        boolean result3 = solution.isAdditiveNumber(test3);
        System.out.println("Test case for 123: " +
                (result3 ? "PASSED" : "FAILED"));

        // Test case 4: "1023" - Contains leading zero (should be false)
        String test4 = "1023";
        boolean result4 = solution.isAdditiveNumber(test4);
        System.out.println("Test case for 1023: " +
                (!result4 ? "PASSED" : "FAILED"));

        // Test case 5: "101" - Valid (1+0=1)
        String test5 = "101";
        System.out.println("Test case for 101: " +
                (solution.isAdditiveNumber(test5) ? "PASSED" : "FAILED"));

        // Test case 6: "0235813" - Starts with 0 (should be false)
        String test6 = "0235813";
        boolean result6 = solution.isAdditiveNumber(test6);
        System.out.println("Test case for 0235813: " +
                (!result6 ? "PASSED" : "FAILED"));

        // Test case 7: "121474836472147483648" - Large numbers
        String test7 = "121474836472147483648";
        System.out.println("Test case for 121474836472147483648: " +
                (solution.isAdditiveNumber(test7) ? "PASSED" : "FAILED"));

        // Test case 8: Empty string (should be false)
        String test8 = "";
        boolean result8 = solution.isAdditiveNumber(test8);
        System.out.println("Test case for empty string: " +
                (!result8 ? "PASSED" : "FAILED"));

        // Test case 9: "198019823962" - Valid sequence where 1980 + 1982 = 3962
        String test9 = "198019823962";
        boolean result9 = solution.isAdditiveNumber(test9);
        System.out.println("Test case for 198019823962: " +
                (result9 ? "PASSED" : "FAILED"));

        // Test case 10: "199111992" - Valid sequence (1+99=100, 99+100=199, etc.)
        String test10 = "199111992";
        boolean result10 = solution.isAdditiveNumber(test10);
        boolean expected10 = true;
        System.out.println("Test case for 199111992: " +
                (result10 == expected10 ? "PASSED" : "FAILED") +
                " (Expected: " + expected10 + ", Actual: " + result10 + ")");
    }
}
